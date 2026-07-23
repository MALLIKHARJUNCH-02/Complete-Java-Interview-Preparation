# HikariCP Connection Pooling with Oracle JDBC - Complete Notes

## Overview

HikariCP is a high-performance JDBC connection pool library. It manages
a pool of reusable database connections, allowing applications to borrow
and return connections instead of creating a new one for every database
request.

Your application flow:

``` text
Application
     |
     v
HikariConfig (Configuration)
     |
     v
HikariDataSource (Connection Pool)
     |
     v
Oracle Database
```

------------------------------------------------------------------------

# HikariConfig

## What is HikariConfig?

`HikariConfig` is a **configuration class**. It stores all the settings
required to create a connection pool.

It **does not**: - Create database connections - Execute SQL - Talk to
Oracle

It only stores configuration values.

### Object Creation

``` java
HikariConfig config = new HikariConfig();
```

Conceptually:

``` text
HikariConfig Object
----------------------------
jdbcUrl            = null
username           = null
password           = null
maximumPoolSize    = 10 (default)
minimumIdle        = 10 (default)
connectionTimeout  = 30000
idleTimeout        = 600000
maxLifetime        = 1800000
----------------------------
```

------------------------------------------------------------------------

## setJdbcUrl()

``` java
config.setJdbcUrl("jdbc:oracle:thin:@//localhost:1521/XEPDB1");
```

Stores the JDBC URL.

Breakdown:

-   `jdbc` → JDBC protocol
-   `oracle` → Oracle database
-   `thin` → Thin JDBC driver
-   `localhost` → Database server
-   `1521` → Oracle listener port
-   `XEPDB1` → Pluggable database name

Internally (conceptually):

``` java
private String jdbcUrl;

public void setJdbcUrl(String url){
    this.jdbcUrl = url;
}
```

------------------------------------------------------------------------

## setUsername()

``` java
config.setUsername("chmallikharjun");
```

Stores the Oracle database username.

------------------------------------------------------------------------

## setPassword()

``` java
config.setPassword("Welcome1");
```

Stores the Oracle database password.

------------------------------------------------------------------------

## setMaximumPoolSize()

``` java
config.setMaximumPoolSize(10);
```

Maximum number of connections the pool may create.

Example:

``` text
Pool
C1
C2
...
C10
```

If all 10 are busy, additional callers must wait.

------------------------------------------------------------------------

## setMinimumIdle()

``` java
config.setMinimumIdle(2);
```

Creates and maintains at least **2 idle connections** ready for
immediate use.

------------------------------------------------------------------------

## setIdleTimeout()

``` java
config.setIdleTimeout(30000);
```

30,000 ms = 30 seconds.

Extra idle connections (above `minimumIdle`) are removed after remaining
unused for this duration.

------------------------------------------------------------------------

## setConnectionTimeout()

``` java
config.setConnectionTimeout(30000);
```

Maximum time `getConnection()` waits for a free connection before
throwing an exception.

------------------------------------------------------------------------

## setMaxLifetime()

``` java
config.setMaxLifetime(1800000);
```

1,800,000 ms = 30 minutes.

Connections older than this are retired and replaced to avoid stale
database connections.

------------------------------------------------------------------------

# HikariDataSource

## What is HikariDataSource?

`HikariDataSource` is the actual **connection pool manager**.

It implements `javax.sql.DataSource` and is responsible for:

-   Creating physical database connections
-   Managing the connection pool
-   Returning connections
-   Recycling connections

### Object Creation

``` java
HikariDataSource dataSource = new HikariDataSource(config);
```

Internally:

``` text
Read Configuration
        |
Validate Configuration
        |
Load JDBC Driver
        |
Create Connection Pool
        |
Create Initial Connections
        |
Pool Ready
```

------------------------------------------------------------------------

## getConnection()

``` java
Connection con = dataSource.getConnection();
```

Flow:

``` text
Pool
 |
Find Free Connection
 |
Mark Busy
 |
Return Connection
```

Normally it **borrows** an existing connection instead of creating a new
one.

------------------------------------------------------------------------

## close()

``` java
con.close();
```

Without pooling:

``` text
Connection Destroyed
```

With HikariCP:

``` text
Connection Returned
        |
       Pool
```

The physical Oracle connection remains open for reuse.

------------------------------------------------------------------------

# Why Connection Pooling?

Without pooling:

``` text
Create Connection
Use
Close

Create Again
Use
Close
```

With pooling:

``` text
Pool

Connection 1
Connection 2
Connection 3

Borrow
Use
Return
```

This improves performance and scalability.

------------------------------------------------------------------------

# Relationship Between HikariConfig and HikariDataSource

``` text
HikariConfig
      |
Stores Configuration
      |
Passed to
      |
HikariDataSource
      |
Creates Pool
      |
Creates Connections
      |
Returns Connection
      |
Application Uses
```

------------------------------------------------------------------------

# Important JDBC Classes in Your Program

## Connection

-   Package: `java.sql`
-   Type: Interface

Represents a connection to the database.

``` java
Connection con = dataSource.getConnection();
```

------------------------------------------------------------------------

## Statement

-   Package: `java.sql`
-   Type: Interface

Executes SQL statements.

``` java
Statement st = con.createStatement();
```

------------------------------------------------------------------------

## ResultSet

-   Package: `java.sql`
-   Type: Interface

Represents rows returned from a SQL query.

``` java
ResultSet rs = st.executeQuery("SELECT * FROM products");
```

Cursor movement:

``` text
Before First Row
      |
   next()
      |
   Row 1
      |
   Row 2
      |
   false
```

------------------------------------------------------------------------

# Try-With-Resources

``` java
try(
    Connection con = ...
    Statement st = ...
    ResultSet rs = ...
){
}
```

Automatically closes resources in reverse order:

1.  ResultSet
2.  Statement
3.  Connection

With HikariCP, `Connection.close()` returns the connection to the pool
instead of closing it.

------------------------------------------------------------------------

# Class Loading Flow

``` text
JVM Starts
      |
Loads TestConnectionPool
      |
Loads ConnectionPool
      |
Creates Static Variables
      |
Executes Static Block
      |
Creates HikariConfig
      |
Creates HikariDataSource
      |
Creates Connection Pool
      |
main() Executes
```

------------------------------------------------------------------------

# Summary Table

  Component                Purpose
  ------------------------ ---------------------------------------------
  HikariConfig             Stores connection pool configuration
  HikariDataSource         Creates and manages the connection pool
  setJdbcUrl()             Stores the database URL
  setUsername()            Stores the username
  setPassword()            Stores the password
  setMaximumPoolSize()     Maximum number of pooled connections
  setMinimumIdle()         Minimum idle connections kept ready
  setIdleTimeout()         Removes extra idle connections
  setConnectionTimeout()   Maximum wait time for a connection
  setMaxLifetime()         Replaces old connections
  getConnection()          Borrows a pooled connection
  close()                  Returns connection to the pool
  Connection               JDBC interface representing a DB connection
  Statement                Executes SQL
  ResultSet                Holds query results

------------------------------------------------------------------------

# Interview Definition

**Connection Pooling** is a technique in which a pool of reusable
database connections is maintained. Applications borrow a connection
from the pool, use it, and return it back instead of creating and
destroying a new connection for every request. This improves
performance, scalability, and resource utilization.
