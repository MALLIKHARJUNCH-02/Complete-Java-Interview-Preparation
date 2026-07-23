# Java JDBC Connection Pool Libraries

## What is a Connection Pool?

A connection pool is a cache of reusable database connections. Instead
of creating and closing a new connection for every database operation,
an application borrows a connection from the pool and returns it after
use.

Benefits:

-   Faster performance
-   Better scalability
-   Reduced database load
-   Efficient resource management

------------------------------------------------------------------------

# Popular Java Connection Pool Libraries

  ------------------------------------------------------------------------
  Library       Maintained By        Performance       Common Usage
  ------------- -------------------- ----------------- -------------------
  HikariCP      Community            ⭐⭐⭐⭐⭐        Spring Boot
                                     Fastest           (default), modern
                                                       Java applications

  Apache DBCP 2 Apache Software      ⭐⭐⭐⭐          Apache Tomcat,
                Foundation                             standalone Java
                                                       applications

  C3P0          Community            ⭐⭐⭐            Older enterprise
                                                       applications

  Tomcat JDBC   Apache Tomcat        ⭐⭐⭐⭐          Apache Tomcat
  Pool                                                 servers

  Oracle        Oracle               ⭐⭐⭐⭐⭐        Oracle Database
  Universal                                            applications
  Connection                                           
  Pool (UCP)                                           

  Agroal        Red Hat              ⭐⭐⭐⭐⭐        Quarkus and Jakarta
                                                       EE
  ------------------------------------------------------------------------

------------------------------------------------------------------------

# 1. HikariCP

## Package

``` java
com.zaxxer.hikari
```

## Main Classes

``` java
HikariConfig
HikariDataSource
```

## Purpose

HikariCP is a lightweight, high-performance JDBC connection pool.

## Advantages

-   Very fast
-   Low memory usage
-   Excellent performance
-   Default connection pool in Spring Boot

## Sample Code

``` java
HikariConfig config = new HikariConfig();
HikariDataSource ds = new HikariDataSource(config);

Connection con = ds.getConnection();
```

------------------------------------------------------------------------

# 2. Apache DBCP 2

## Package

``` java
org.apache.commons.dbcp2
```

## Main Class

``` java
BasicDataSource
```

## Purpose

Apache DBCP is one of the oldest and most stable connection pool
libraries.

## Advantages

-   Stable
-   Easy configuration
-   Common in older enterprise applications

## Sample Code

``` java
BasicDataSource ds = new BasicDataSource();

ds.setUrl(url);
ds.setUsername(user);
ds.setPassword(password);

Connection con = ds.getConnection();
```

------------------------------------------------------------------------

# 3. C3P0

## Package

``` java
com.mchange.v2.c3p0
```

## Main Class

``` java
ComboPooledDataSource
```

## Purpose

An older JDBC connection pool with automatic recovery and connection
testing.

## Advantages

-   Automatic connection recovery
-   Connection validation
-   Widely used in legacy Java EE applications

## Sample Code

``` java
ComboPooledDataSource cpds = new ComboPooledDataSource();

cpds.setJdbcUrl(url);
cpds.setUser(user);
cpds.setPassword(password);

Connection con = cpds.getConnection();
```

------------------------------------------------------------------------

# 4. Tomcat JDBC Pool

## Package

``` java
org.apache.tomcat.jdbc.pool
```

## Main Class

``` java
DataSource
```

## Purpose

A connection pool designed for Apache Tomcat.

## Advantages

-   Good performance
-   Tight integration with Tomcat
-   Simple configuration

## Sample Code

``` java
DataSource ds = new DataSource();

ds.setUrl(url);
ds.setUsername(user);
ds.setPassword(password);

Connection con = ds.getConnection();
```

------------------------------------------------------------------------

# 5. Oracle Universal Connection Pool (UCP)

## Package

``` java
oracle.ucp.jdbc
```

## Main Classes

``` java
PoolDataSource
PoolDataSourceFactory
```

## Purpose

Oracle's official JDBC connection pool.

## Advantages

-   Optimized for Oracle Database
-   Supports Oracle RAC
-   Fast Connection Failover (FCF)
-   Runtime Load Balancing (RLB)
-   Oracle enterprise features

## Sample Code

``` java
PoolDataSource pds = PoolDataSourceFactory.getPoolDataSource();

pds.setConnectionFactoryClassName(
    "oracle.jdbc.pool.OracleDataSource");

pds.setURL(url);
pds.setUser(user);
pds.setPassword(password);

Connection con = pds.getConnection();
```

------------------------------------------------------------------------

# 6. Agroal

## Package

``` java
io.agroal.api
```

## Purpose

High-performance connection pool developed by Red Hat.

## Used In

-   Quarkus
-   Jakarta EE
-   Cloud-native applications

## Advantages

-   Very fast
-   Lightweight
-   Optimized for Quarkus

------------------------------------------------------------------------

# Can We Create Our Own Connection Pool?

Yes.

Using Java Collections and JDBC, you can build a simple connection pool.

Concept:

``` text
Pool
 |
 |-- Connection 1
 |-- Connection 2
 |-- Connection 3

Borrow
   |
Use
   |
Return
```

Educational example:

``` java
Connection con = pool.getConnection();

// Use the connection

pool.releaseConnection(con);
```

Production applications typically use established libraries such as
HikariCP rather than implementing a custom pool.

------------------------------------------------------------------------

# Comparison

  ----------------------------------------------------------------------------------------
  Feature         HikariCP     DBCP2      C3P0    Tomcat Pool    Oracle UCP      Agroal
  ------------- ------------ ---------- -------- -------------- ------------- ------------
  Performance    ⭐⭐⭐⭐⭐   ⭐⭐⭐⭐   ⭐⭐⭐     ⭐⭐⭐⭐     ⭐⭐⭐⭐⭐    ⭐⭐⭐⭐⭐

  Lightweight        ✅          ⚪        ❌          ✅            ✅            ✅

  Spring Boot        ✅          ❌        ❌          ❌            ❌            ❌
  Default                                                                     

  Oracle             ⚪          ❌        ❌          ❌            ✅            ❌
  Optimized                                                                   

  Legacy             ⚪          ✅        ✅          ✅            ✅            ❌
  Support                                                                     
  ----------------------------------------------------------------------------------------

------------------------------------------------------------------------

# Which One Should You Learn?

## Beginners

-   HikariCP

## Spring Boot Developers

-   HikariCP

## Oracle Developers

-   Oracle UCP
-   HikariCP

## Maintaining Legacy Projects

-   Apache DBCP 2
-   C3P0

## Quarkus Developers

-   Agroal

------------------------------------------------------------------------

# Interview Answer

**Q: Which JDBC connection pool libraries do you know?**

**Answer:**

"I am familiar with several JDBC connection pooling libraries including
HikariCP, Apache DBCP 2, C3P0, Tomcat JDBC Pool, Oracle Universal
Connection Pool (UCP), and Agroal. Among these, HikariCP is the most
popular and is the default connection pool in Spring Boot due to its
excellent performance and low memory usage. Oracle UCP is commonly used
in Oracle enterprise environments, while Apache DBCP and C3P0 are often
found in older enterprise applications."
