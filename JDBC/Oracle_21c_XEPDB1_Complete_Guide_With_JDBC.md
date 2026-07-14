# Oracle Database 21c XE -- Complete Guide (Create User, Login, Create Table & Connect with JDBC)

## Prerequisites

-   Oracle Database 21c XE installed
-   XEPDB1 Pluggable Database available
-   Oracle Listener running
-   Oracle JDBC Driver (`ojdbc11.jar` or `ojdbc8.jar`) added to your
    project

------------------------------------------------------------------------

# Part 1 -- Create a User in XEPDB1

## Step 1: Open SQL\*Plus

``` sql
sqlplus / as sysdba
```

or

``` text
Enter user-name: system
Enter password: ********
```

## Step 2: Check the Current Container

``` sql
SHOW CON_NAME;
```

If it displays `CDB$ROOT`, switch to XEPDB1.

## Step 3: Switch to XEPDB1

``` sql
ALTER SESSION SET CONTAINER = XEPDB1;

SHOW CON_NAME;
```

Expected:

``` text
XEPDB1
```

## Step 4: Create a User

``` sql
CREATE USER chmallikharjun IDENTIFIED BY Welcome1;
```

> Note: `ALTER SESSION SET "_oracle_script"=TRUE;` is mainly for
> lab/testing scenarios in the root container. For normal application
> users, create them inside **XEPDB1**.

## Step 5: Grant Privileges

``` sql
GRANT CREATE SESSION TO chmallikharjun;
GRANT CREATE TABLE TO chmallikharjun;
GRANT CREATE VIEW TO chmallikharjun;
GRANT CREATE SEQUENCE TO chmallikharjun;
GRANT CREATE PROCEDURE TO chmallikharjun;
GRANT CREATE TRIGGER TO chmallikharjun;
GRANT UNLIMITED TABLESPACE TO chmallikharjun;
```

## Step 6: Verify the User

``` sql
SELECT username, account_status
FROM dba_users
WHERE username='CHMALLIKHARJUN';
```

Expected account status: `OPEN`.

------------------------------------------------------------------------

# Part 2 -- Start the Oracle Listener

If you get `ORA-12541: TNS:no listener`

``` cmd
sc query OracleServiceXE
sc query OracleOraDB21Home1TNSListener
```

Start the listener:

``` cmd
net start OracleOraDB21Home1TNSListener
```

Verify:

``` cmd
lsnrctl status
```

------------------------------------------------------------------------

# Part 3 -- Login as the New User

``` sql
CONNECT chmallikharjun/Welcome1@localhost:1521/XEPDB1
```

or

``` sql
CONNECT chmallikharjun/Welcome1
```

Verify:

``` sql
SHOW USER;
```

------------------------------------------------------------------------

# Part 4 -- SQL\*Plus Formatting (Optional)

``` sql
SET LINESIZE 150
SET PAGESIZE 100

COLUMN emp_name FORMAT A15
COLUMN department FORMAT A15
COLUMN city FORMAT A15
```

------------------------------------------------------------------------

# Part 5 -- Create a Table

``` sql
CREATE TABLE employees(
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(100),
    department VARCHAR2(50),
    salary NUMBER(10,2),
    hire_date DATE,
    city VARCHAR2(50)
);
```

Insert sample data:

``` sql
INSERT INTO employees
VALUES (101,'John','IT',50000,DATE '2024-01-15','Hyderabad');

COMMIT;
```

View data:

``` sql
SELECT * FROM employees;
```

------------------------------------------------------------------------

# Part 6 -- Connect Oracle Database Using JDBC

## Step 1: Add the JDBC Driver

Add `ojdbc11.jar` (Java 11+) or `ojdbc8.jar` (Java 8) to your project's
build path.

## Step 2: JDBC Connection URL

Use the XEPDB1 service name.

``` text
jdbc:oracle:thin:@//localhost:1521/XEPDB1
```

Do **not** use:

``` text
jdbc:oracle:thin:@localhost:1521:xe
```

when your user is created in **XEPDB1**.

## Step 3: Register the Driver

``` java
Driver d = new oracle.jdbc.OracleDriver();
DriverManager.registerDriver(d);
```

## Step 4: Create the Connection

``` java
String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
String username = "chmallikharjun";
String password = "Welcome1";

Connection con = DriverManager.getConnection(url, username, password);
```

## Step 5: Create a Statement

``` java
Statement smt = con.createStatement();
```

## Step 6: Execute SQL

``` java
int feedback = smt.executeUpdate(
    "INSERT INTO employees VALUES " +
    "(116, 'Arjun Reddy', 'Marketing', 47000, " +
    "TO_DATE('14-JUN-23','DD-MON-RR'), " +
    "'Kurnool')");
```

## Step 7: Check the Result

``` java
if (feedback > 0) {
    System.out.println("Insert Successful");
} else {
    System.out.println("Insert Not Successful");
}
```

## Step 8: Close Resources

``` java
smt.close();
con.close();
```

------------------------------------------------------------------------

# Complete JDBC Program

``` java
import java.sql.*;

public class InsertRecord {

    public static void main(String[] args) throws SQLException {

        Driver d = new oracle.jdbc.OracleDriver();
        DriverManager.registerDriver(d);

        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
        String username = "chmallikharjun";
        String password = "Welcome1";

        Connection con = DriverManager.getConnection(url, username, password);

        Statement smt = con.createStatement();

        int feedback = smt.executeUpdate(
                "INSERT INTO employees VALUES " +
                        "(116, 'Arjun Reddy', 'Marketing', 47000, " +
                        "TO_DATE('14-JUN-23','DD-MON-RR'), " +
                        "'Kurnool')");

        if (feedback > 0)
            System.out.println("Insert Successful");
        else
            System.out.println("Insert Not Successful");

        smt.close();
        con.close();
    }
}
```

------------------------------------------------------------------------

# Common Errors

## ORA-65096

Switch to XEPDB1 before creating the user.

## ORA-01017

Verify the username, password, and account status.

## ORA-12154

Use:

``` sql
CONNECT chmallikharjun/Welcome1@localhost:1521/XEPDB1
```

## ORA-12541

Start the Oracle listener:

``` cmd
net start OracleOraDB21Home1TNSListener
```

Verify with:

``` cmd
lsnrctl status
```
