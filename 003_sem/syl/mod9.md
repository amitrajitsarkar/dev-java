# Module 9 : Database Connectivity through JDBC

This topic teaches:

> How Java connects to databases.

JDBC =

```text id="3u8kq1"
Java Database Connectivity
```

Used to:

* store data
* retrieve data
* update records
* delete records

Basically Java talking to databases like:

* MySQL
* Oracle
* PostgreSQL

---

# 1. What is JDBC?

JDBC is an API provided by Java for database communication.

Package:

```java id="m7v2x5"
java.sql
```

---

# JDBC Architecture

```text id="v5p9n2"
Java Program
     ↓
JDBC API
     ↓
JDBC Driver
     ↓
Database
```

---

# JDBC Driver

Driver acts like translator between:

```text id="x1m6q4"
Java ↔ Database
```

---

# 2. Steps for JDBC Connectivity

Very important.

---

# Step 1: Import Package

```java id="q8v3m1"
import java.sql.*;
```

---

# Step 2: Load Driver

```java id="p4x7n6"
Class.forName(
"com.mysql.cj.jdbc.Driver");
```

Loads MySQL driver.

---

# Step 3: Establish Connection

```java id="k2m9v5"
Connection con =
DriverManager.getConnection(
"url","username","password");
```

Example:

```java id="z7q1x8"
Connection con =
DriverManager.getConnection(
"jdbc:mysql://localhost:3306/test",
"root",
"1234");
```

---

# Important Parts

| Part      | Meaning       |
| --------- | ------------- |
| localhost | Same computer |
| 3306      | MySQL port    |
| test      | Database name |

---

# Step 4: Create Statement

```java id="r3m8v1"
Statement st =
con.createStatement();
```

Used to execute SQL queries.

---

# Step 5: Execute Query

## Insert/Update/Delete

```java id="t6x2q9"
st.executeUpdate(
"insert into student values(1,'Amit')");
```

Returns affected rows.

---

## Select Query

```java id="u9m4v7"
ResultSet rs =
st.executeQuery(
"select * from student");
```

---

# Step 6: Process Result

```java id="w1q8x5"
while(rs.next()) {

    System.out.println(
        rs.getInt(1));

    System.out.println(
        rs.getString(2));
}
```

---

# Step 7: Close Connection

```java id="f5m2v9"
con.close();
```

Very important to free resources.

---

# 3. Important JDBC Interfaces

| Interface         | Purpose             |
| ----------------- | ------------------- |
| Driver            | Database driver     |
| Connection        | Database connection |
| Statement         | SQL execution       |
| PreparedStatement | Precompiled SQL     |
| ResultSet         | Stores query result |

---

# 4. Statement Interface

Used for normal SQL execution.

```java id="g8x1m4"
Statement st =
con.createStatement();
```

---

# Problem

Unsafe against:

```text id="h3q7v2"
SQL Injection
```

---

# 5. PreparedStatement

Very important modern JDBC tool.

Safer + faster.

---

# Example

```java id="j6m2x8"
PreparedStatement ps =
con.prepareStatement(
"insert into student values(?,?)");
```

Set values:

```java id="n1v9q5"
ps.setInt(1,101);

ps.setString(2,"Amit");
```

Execute:

```java id="p7x4m1"
ps.executeUpdate();
```

---

# Why PreparedStatement Better?

| Feature                | Benefit |
| ---------------------- | ------- |
| Precompiled            | Faster  |
| Parameterized          | Safer   |
| Prevents SQL injection | Secure  |

---

# 6. ResultSet

Stores table data returned from database.

---

# Example

```java id="r2m7v8"
ResultSet rs =
st.executeQuery(
"select * from student");
```

---

# Important Methods

| Method      | Purpose       |
| ----------- | ------------- |
| next()      | Move next row |
| getInt()    | Read integer  |
| getString() | Read string   |

---

# Example

```java id="s9x3m6"
while(rs.next()) {

    System.out.println(
        rs.getString("name"));
}
```

---

# 7. executeQuery vs executeUpdate

Very common question.

| Method          | Used For             |
| --------------- | -------------------- |
| executeQuery()  | SELECT               |
| executeUpdate() | INSERT/UPDATE/DELETE |

---

# 8. SQLException

Most JDBC operations may throw:

```java id="t5m1q9"
SQLException
```

Handled using:

```java id="u8x4v2"
try-catch
```

---

# Example

```java id="v3m7q1"
try {

}
catch(SQLException e) {

    System.out.println(e);
}
```

---

# 9. Basic CRUD Operations

CRUD =

| Operation | Meaning |
| --------- | ------- |
| Create    | Insert  |
| Read      | Select  |
| Update    | Modify  |
| Delete    | Remove  |

---

# Insert Example

```java id="w6x2m8"
insert into student values(1,'Amit')
```

---

# Select Example

```java id="x9m4q7"
select * from student
```

---

# Update Example

```java id="y1v8x5"
update student
set name='Rahul'
where id=1
```

---

# Delete Example

```java id="z4m2q9"
delete from student
where id=1
```

---

# 10. Types of JDBC Drivers

Mostly theory question now.

| Type   | Name             |
| ------ | ---------------- |
| Type 1 | JDBC-ODBC Bridge |
| Type 2 | Native Driver    |
| Type 3 | Network Protocol |
| Type 4 | Thin Driver      |

---

# Most Used Today

```text id="a7v1m3"
Type 4 Driver
```

Pure Java driver.

---

# 11. JDBC with MySQL

Very common practical setup.

Need:

* MySQL installed
* JDBC connector JAR

Common driver:

```text id="b2x8q6"
mysql-connector-j
```

---

# Modern JDBC URL

```java id="c5m9v1"
jdbc:mysql://localhost:3306/dbname
```

---

# 12. Important Real-World Concepts

---

# Connection Pooling

Creating DB connection repeatedly is expensive.

Modern frameworks use:

```text id="d8x3m7"
Connection pools
```

Example:

* HikariCP
* Apache DBCP

---

# ORM

Modern Java often uses:

* Hibernate
* JPA

instead of raw JDBC.

But JDBC is foundation underneath.

---

# Most Important Basic Example

---

# Complete JDBC Example

```java id="e1m7q4"
import java.sql.*;

class Test {

    public static void main(String args[]) {

        try {

            Class.forName(
            "com.mysql.cj.jdbc.Driver");

            Connection con =
            DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test",
            "root",
            "1234");

            Statement st =
            con.createStatement();

            ResultSet rs =
            st.executeQuery(
            "select * from student");

            while(rs.next()) {

                System.out.println(
                rs.getInt(1));

                System.out.println(
                rs.getString(2));
            }

            con.close();

        }
        catch(Exception e) {

            System.out.println(e);
        }
    }
}
```

---

# Most Important Viva Questions

## What is JDBC?

## Steps of JDBC connectivity

## Difference Between:

```java id="f4x2m9"
Statement
PreparedStatement
```

## Difference Between:

```java id="g7m1v5"
executeQuery()
executeUpdate()
```

## What is ResultSet?

## Why PreparedStatement preferred?

## What is SQL Injection?

---

# Most Important Exam Areas

Focus heavily on:

* JDBC architecture
* Connection steps
* PreparedStatement
* ResultSet
* CRUD operations
* executeQuery vs executeUpdate
* SQLException
* JDBC driver types

This is the bridge between:

```text id="h9x4q2"
Java applications ↔ databases
```
