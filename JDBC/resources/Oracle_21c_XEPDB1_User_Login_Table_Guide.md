# Oracle Database 21c XE -- Create a User in XEPDB1 and Create a Table

## 1. Open SQL\*Plus as SYSDBA

``` sql
sqlplus / as sysdba
```

------------------------------------------------------------------------

## 2. Check the Current Container

``` sql
SHOW CON_NAME;
```

If the output is:

``` text
CDB$ROOT
```

switch to the pluggable database.

------------------------------------------------------------------------

## 3. Switch to XEPDB1

``` sql
ALTER SESSION SET CONTAINER = XEPDB1;
```

Verify:

``` sql
SHOW CON_NAME;
```

Expected output:

``` text
XEPDB1
```

------------------------------------------------------------------------

## 4. Create a New User

Example:

``` sql
CREATE USER chmallikharjun IDENTIFIED BY Welcome1;
```

------------------------------------------------------------------------

## 5. Grant Required Privileges

``` sql
GRANT CREATE SESSION TO chmallikharjun;
GRANT CREATE TABLE TO chmallikharjun;
GRANT CREATE VIEW TO chmallikharjun;
GRANT CREATE SEQUENCE TO chmallikharjun;
GRANT CREATE PROCEDURE TO chmallikharjun;
GRANT CREATE TRIGGER TO chmallikharjun;
GRANT UNLIMITED TABLESPACE TO chmallikharjun;
```

------------------------------------------------------------------------

## 6. Verify the User

``` sql
SELECT username, account_status
FROM dba_users
WHERE username = 'CHMALLIKHARJUN';
```

Expected:

``` text
USERNAME           ACCOUNT_STATUS
-----------------  --------------
CHMALLIKHARJUN     OPEN
```

------------------------------------------------------------------------

## 7. Start the Oracle Listener (If Needed)

If you receive:

``` text
ORA-12541: TNS:no listener
```

check the listener service.

### Check services (Windows Command Prompt)

``` cmd
sc query OracleServiceXE
sc query OracleOraDB21Home1TNSListener
```

If the listener is stopped:

``` cmd
net start OracleOraDB21Home1TNSListener
```

Verify:

``` cmd
lsnrctl status
```

------------------------------------------------------------------------

## 8. Connect to the User

### Option 1 (Easy Connect)

``` sql
CONNECT chmallikharjun/Welcome1@localhost:1521/XEPDB1
```

### Option 2 (If already connected to XEPDB1 locally)

``` sql
CONNECT chmallikharjun/Welcome1
```

------------------------------------------------------------------------

## 9. Confirm the Current User

``` sql
SHOW USER;
```

Expected:

``` text
USER is "CHMALLIKHARJUN"
```

------------------------------------------------------------------------

## 10. Create a Table

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

## 11. Insert Sample Data

``` sql
INSERT INTO employees
VALUES (101, 'John', 'IT', 50000, DATE '2024-01-15', 'Hyderabad');

COMMIT;
```

------------------------------------------------------------------------

## 12. View the Data

``` sql
SELECT * FROM employees;
```

------------------------------------------------------------------------

## Useful Commands

### Show current container

``` sql
SHOW CON_NAME;
```

### Show all pluggable databases

``` sql
SHOW PDBS;
```

### Show current user

``` sql
SHOW USER;
```

### List all users in XEPDB1

``` sql
SELECT username
FROM dba_users
ORDER BY username;
```

------------------------------------------------------------------------

## Common Errors

### ORA-65096: Invalid common user or role name

Cause: - You are in `CDB$ROOT`.

Fix:

``` sql
ALTER SESSION SET CONTAINER = XEPDB1;
```

Then create the user again.

### ORA-01017: Invalid username/password

-   Verify the username and password.
-   Ensure the account status is `OPEN`.

### ORA-12541: TNS:no listener

-   Start the Oracle listener:

``` cmd
net start OracleOraDB21Home1TNSListener
```

-   Verify:

``` cmd
lsnrctl status
```
