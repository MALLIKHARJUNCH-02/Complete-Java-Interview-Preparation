# Oracle Database 21c XE -- Complete Guide (Create User, Login, and Create Table in XEPDB1)

## Step 1: Open SQL\*Plus

If connecting as SYSDBA:

``` sql
sqlplus / as sysdba
```

Or connect as the SYSTEM user:

``` text
Enter user-name: system
Enter password: ********
```

------------------------------------------------------------------------

## Step 2: Check the Current Container

``` sql
SHOW CON_NAME;
```

If the result is:

``` text
CDB$ROOT
```

switch to the pluggable database.

------------------------------------------------------------------------

## Step 3: Switch to XEPDB1

``` sql
ALTER SESSION SET CONTAINER = XEPDB1;
```

Verify:

``` sql
SHOW CON_NAME;
```

Expected:

``` text
XEPDB1
```

------------------------------------------------------------------------

## Step 4: Create a New User

Example:

``` sql
CREATE USER username IDENTIFIED BY password;
```

> **Note:** If you intentionally want to create users in the root
> container (not recommended for normal application users), Oracle
> requires:
>
> ``` sql
> ALTER SESSION SET "_oracle_script"=TRUE;
> ```
>
> This is commonly used in lab environments. For application users,
> create them inside **XEPDB1** instead.

------------------------------------------------------------------------

## Step 5: Grant Required Privileges

``` sql
GRANT CREATE SESSION TO username;
GRANT CREATE TABLE TO username;
GRANT CREATE VIEW TO username;
GRANT CREATE SEQUENCE TO username;
GRANT CREATE PROCEDURE TO username;
GRANT CREATE TRIGGER TO username;
GRANT UNLIMITED TABLESPACE TO username;
```

------------------------------------------------------------------------

## Step 6: Verify the User

``` sql
SELECT username, account_status
FROM dba_users
WHERE username = 'USERNAME';
```

Expected:

``` text
USERNAME           ACCOUNT_STATUS
-----------------  --------------
USERNAME               OPEN
```

------------------------------------------------------------------------

## Step 7: Start the Oracle Listener (If Needed)

If you receive:

``` text
ORA-12541: TNS:no listener
```

### Check Oracle Services

``` cmd
sc query OracleServiceXE
sc query OracleOraDB21Home1TNSListener
```

Start the listener if it is stopped:

``` cmd
net start OracleOraDB21Home1TNSListener
```

Verify:

``` cmd
lsnrctl status
```

------------------------------------------------------------------------

## Step 8: Connect as the New User

Preferred (Easy Connect):

``` sql
CONNECT username/password@localhost:1521/XEPDB1
```

If you have a TNS alias configured:

``` sql
CONNECT username/password@XEPDB1
```

If you are already connected locally to XEPDB1:

``` sql
CONNECT username/password
```

Verify:

``` sql
SHOW USER;
```

Expected:

``` text
USER is "USERNAME"
```

------------------------------------------------------------------------

## Step 9: SQL\*Plus Formatting (Optional)

``` sql
SET LINESIZE 150
SET PAGESIZE 100

COLUMN emp_name FORMAT A15
COLUMN department FORMAT A15
COLUMN city FORMAT A15
```

------------------------------------------------------------------------

## Step 10: Create a Table

``` sql
CREATE TABLE employees (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(100),
    department VARCHAR2(50),
    salary NUMBER(10,2),
    hire_date DATE,
    city VARCHAR2(50)
);
```

------------------------------------------------------------------------

## Step 11: Insert Sample Data

``` sql
INSERT INTO employees
VALUES (101, 'John', 'IT', 50000, DATE '2024-01-15', 'Hyderabad');

COMMIT;
```

------------------------------------------------------------------------

## Step 12: View the Data

``` sql
SELECT * FROM employees;
```

------------------------------------------------------------------------

# Useful Commands

## Current Container

``` sql
SHOW CON_NAME;
```

## Current User

``` sql
SHOW USER;
```

## List Pluggable Databases

``` sql
SHOW PDBS;
```

## List Users

``` sql
SELECT username
FROM dba_users
ORDER BY username;
```

------------------------------------------------------------------------

# Common Errors

## ORA-65096: Invalid common user or role name

Cause:

-   Creating a local user while connected to `CDB$ROOT`.

Fix:

``` sql
ALTER SESSION SET CONTAINER = XEPDB1;
```

Then create the user again.

------------------------------------------------------------------------

## ORA-01017: Invalid username/password

-   Verify the username and password.
-   Ensure the account is OPEN.

``` sql
SELECT username, account_status
FROM dba_users
WHERE username='USERNAME';
```

------------------------------------------------------------------------

## ORA-12154: TNS could not resolve the connect identifier

Use Easy Connect:

``` sql
CONNECT username/password@localhost:1521/XEPDB1
```

or configure the `XEPDB1` alias in `tnsnames.ora`.

------------------------------------------------------------------------

## ORA-12541: TNS:no listener

Start the listener:

``` cmd
net start OracleOraDB21Home1TNSListener
```

Verify:

``` cmd
lsnrctl status
```
