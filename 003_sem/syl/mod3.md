# Module 3 : Basic Concepts of OOP using Java

This module is basically:

> “Java programming foundations + beginner OOP.”

A lot of important interview and coding concepts start here.

---

# 1. Basic Concepts of Java Programming

## What is Java?

Java is:

* high-level
* object-oriented
* platform-independent
  programming language.

Created by James Gosling at Sun Microsystems.

Now maintained by [Oracle](https://www.oracle.com/java/?utm_source=chatgpt.com)

---

# 2. Advantages of Java

## a) Platform Independent

```text
Write Once, Run Anywhere (WORA)
```

Java code runs on:

* Windows
* Linux
* Mac

without recompiling.

Reason:

* JVM

---

## b) Object Oriented

Supports:

* encapsulation
* inheritance
* polymorphism
* abstraction

---

## c) Secure

* No direct pointer manipulation
* Bytecode verification
* JVM sandboxing

---

## d) Robust

* Exception handling
* Garbage collection
* Strong type checking

---

## e) Multithreading

Java can run multiple tasks simultaneously.

Very important in:

* servers
* games
* modern apps

---

# 3. Bytecode and JVM

Very important topic.

---

# How Java Runs

```text
Java Source Code (.java)
        ↓
Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM executes it
```

---

# Bytecode

Intermediate machine-independent code.

Example:

```text
Hello.class
```

Not directly machine language.

---

# JVM (Java Virtual Machine)

Acts like a virtual computer.

Responsibilities:

* executes bytecode
* memory management
* garbage collection
* platform independence

Tiny invisible cyber-engine inside your OS ⚙️☕

---

# JDK vs JRE vs JVM

Very commonly asked.

| Term | Meaning                 |
| ---- | ----------------------- |
| JVM  | Runs bytecode           |
| JRE  | JVM + libraries         |
| JDK  | JRE + development tools |

---

# 4. Data Types

## Primitive Types

| Type    | Size       |
| ------- | ---------- |
| byte    | 1 byte     |
| short   | 2 bytes    |
| int     | 4 bytes    |
| long    | 8 bytes    |
| float   | 4 bytes    |
| double  | 8 bytes    |
| char    | 2 bytes    |
| boolean | true/false |

---

## Non-Primitive Types

* String
* Arrays
* Classes
* Interfaces

---

# 5. Access Specifiers

Controls visibility/access.

| Modifier  | Same Class | Same Package | Subclass | Outside Package |
| --------- | ---------- | ------------ | -------- | --------------- |
| private   | Yes        | No           | No       | No              |
| default   | Yes        | Yes          | No       | No              |
| protected | Yes        | Yes          | Yes      | No              |
| public    | Yes        | Yes          | Yes      | Yes             |

---

# 6. Operators

## Types

* Arithmetic
* Relational
* Logical
* Assignment
* Unary
* Bitwise
* Ternary

Example:

```java
a + b
a > b
a && b
```

---

# 7. Control Statements and Loops

## Decision Making

```java
if
if-else
switch
```

---

## Loops

```java
for
while
do-while
```

Used for repetition.

---

# 8. Array

Collection of similar data types.

```java
int arr[] = {1,2,3};
```

---

## Important

Arrays in Java:

* fixed size
* stored continuously
* objects internally

2D arrays also important:

```java
int matrix[][];
```

---

# 9. Creation of Class and Object

## Class

Blueprint.

```java
class Student {
    int roll;
}
```

---

## Object

Instance of class.

```java
Student s1 = new Student();
```

---

# 10. Constructor

Special method used to initialize object.

Same name as class.

No return type.

---

## Example

```java
class Student {
    Student() {
        System.out.println("Constructor called");
    }
}
```

---

# Types

* Default constructor
* Parameterized constructor
* Copy constructor (conceptually in Java)

---

# 11. finalize() and Garbage Collection

---

# Garbage Collection

Automatic memory cleanup.

Java removes unused objects automatically.

```java
Student s = new Student();
s = null;
```

Object becomes eligible for GC.

---

# finalize()

Method called before object destruction.

```java
protected void finalize() {
}
```

BUT:

* deprecated now
* unreliable
* rarely used modernly

Exam-wise still important.

---

# 12. Method Overloading

Multiple methods with same name but different parameters.

```java
class Math {
    int add(int a, int b) { }

    double add(double a, double b) { }
}
```

Compile-time polymorphism.

---

# 13. this Keyword

`this` refers to current object.

---

## Uses

### a) Distinguish local and instance variables

```java
this.name = name;
```

---

### b) Call current class constructor

```java
this();
```

---

### c) Pass current object

```java
display(this);
```

---

# 14. Objects as Parameters & Methods Returning Objects

---

## Passing Object

```java
void show(Student s)
```

Object reference passed.

---

## Returning Object

```java
Student create() {
    return new Student();
}
```

Very common in:

* builder patterns
* APIs
* frameworks

---

# 15. Call by Value & Call by Reference

Important confusing topic.

---

# Java is technically ONLY call by value.

But:

* object references are passed by value.

---

## Primitive Example

```java
int x = 5;
```

Copy passed.

---

## Object Example

```java
Student s
```

Reference copy passed.

You can modify object contents but not original reference variable itself.

Java creates illusion of call-by-reference 👀

---

# 16. Static Variables and Methods

Belong to class instead of objects.

---

## Static Variable

Shared among all objects.

```java
static int count;
```

---

## Static Method

```java
static void show()
```

Can be called without object.

Example:

```java
Math.sqrt()
```

---

# Important

Static methods:

* cannot access non-static members directly
* cannot use `this`

---

# 17. Nested and Inner Classes

Class inside another class.

---

# Types

## a) Static Nested Class

```java
class Outer {
    static class Inner { }
}
```

---

## b) Inner Class

Non-static nested class.

Can access outer class members directly.

---

Useful in:

* GUI
* event handling
* frameworks

---

# 18. String Handling

Very important Java topic.

---

# String is Immutable

```java
String s = "Hello";
s.concat("World");
```

Original string unchanged.

Reason:

* security
* thread safety
* string pool optimization

---

# Mutable Strings

Using:

* StringBuilder
* StringBuffer

```java
StringBuilder sb = new StringBuilder();
```

Can modify without creating new objects.

---

# String Pool

Java stores repeated string literals efficiently.

```java
String a = "hi";
String b = "hi";
```

Both may point same memory.

---

# 19. Command Line Arguments

Arguments passed during program execution.

```java
public static void main(String args[])
```

Example:

```bash
java Test hello
```

`args[0] = "hello"`

---

# 20. Basics of I/O Operations

Input/Output operations.

---

# BufferedReader

Fast character input.

```java
BufferedReader br =
new BufferedReader(
new InputStreamReader(System.in));
```

Input:

```java
String s = br.readLine();
```

Needs exception handling.

---

# Scanner Class

Simpler input handling.

```java
Scanner sc = new Scanner(System.in);
```

Input:

```java
int x = sc.nextInt();
```

---

# BufferedReader vs Scanner

| BufferedReader | Scanner           |
| -------------- | ----------------- |
| Faster         | Slower            |
| More complex   | Easier            |
| String-based   | Parses primitives |

---

# Most Important Topics in This Module

Focus heavily on:

* JVM & bytecode
* Constructor
* `this` keyword
* Method overloading
* Static keyword
* Garbage collection
* String immutable vs mutable
* Access specifiers
* Arrays
* Scanner vs BufferedReader
* Call by value/reference confusion

This module is the “starter engine” of almost all advanced Java topics later:

* inheritance
* collections
* multithreading
* Spring Boot
* Android
* JVM internals
