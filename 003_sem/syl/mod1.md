# Module 1 : Object Oriented Design (OOD)

This module is basically the “philosophy + structure” behind Java and most modern programming languages.
Instead of writing only functions and data separately, OOP combines **data + behavior** into objects.

---

# Object

>An **object** is a real instance of a class that contains:

* data (state/properties)
* functions (behavior/methods)

It represents an actual thing in memory.

## Example

```java
class Car {
    String color;

    void drive() {
        System.out.println("Car is driving");
    }
}
```

```java
Car c1 = new Car();
```

Here:

* `c1` is an object
* it is created from `Car` class

`c1` now has:

* its own data
* its own behavior

---

# Class

>A **class** is a blueprint/template used to create objects.

It defines:

* what data objects will have
* what actions objects can perform

## Example

```java
class Student {
    String name;
    int roll;

    void study() {
        System.out.println("Studying...");
    }
}
```

`Student` is a class.

Objects created from it:

```java
Student s1 = new Student();
Student s2 = new Student();
```

---

# Easy Analogy

```text
Class  = Blueprint of a house
Object = Actual house built from blueprint
```

or

```text
Class  = Cookie cutter
Object = Actual cookies
```

One class can create many objects 🍪


# 1. Concepts of Object Oriented Programming Language

OOP revolves around modeling real-world things as software objects.

Example:

* Car → object
* Student → object
* BankAccount → object

Each object has:

* **State** → data/attributes
* **Behavior** → methods/functions

Example in Java:

```java
class Car {
    String color;     // state
    int speed;        // state

    void accelerate() {   // behavior
        speed += 10;
    }
}
```

---

# Core Pillars of OOP

These are extremely important.

## 1. Encapsulation

Binding data and methods together.

```java
class Bank {
    private int balance;

    public void deposit(int amt) {
        balance += amt;
    }
}
```

Why:

* Protects data
* Prevents direct misuse

---

## 2. Abstraction

Showing only essential details.

Example:
You drive a car without knowing engine internals.

In Java:

* Abstract class
* Interface

---

## 3. Inheritance

One class acquiring another class properties.

```java
class Animal { }
class Dog extends Animal { }
```

Purpose:

* Reusability
* Hierarchical structure

---

## 4. Polymorphism

“One thing, many forms.”

Example:

```java
Animal a = new Dog();
```

Method overloading + overriding come here.

---

# 2. Major and Minor Elements of OOP

This comes from classic Booch methodology.

---

## Major Elements

These define true OOP systems.

### a) Abstraction

Focus on important features only.

### b) Encapsulation

Data hiding and controlled access.

### c) Modularity

Breaking software into smaller modules/classes.

### d) Hierarchy

Inheritance relationships.

---

## Minor Elements

Supportive concepts.

### a) Typing

Defining data types/classes.

```java
int x;
String s;
```

### b) Concurrency

Multiple tasks running simultaneously.

Important later in Java threads.

### c) Persistence

Object data survives after program ends.

Example:

* File storage
* Database storage
* Serialization

---

# 3. Object

An object is an instance of a class.

Example:

```java
Car c1 = new Car();
```

`c1` is object.

---

## Object has:

### State

Attributes/data

### Behavior

Methods

### Identity

Unique existence in memory

Even two objects with same data are different objects.

---

# 4. Class

Blueprint/template for objects.

```java
class Student {
    String name;
    int roll;
}
```

Objects created from class:

```java
Student s1 = new Student();
Student s2 = new Student();
```

---

# 5. Relationships Among Objects

Objects interact with each other.

Example:

```text
Customer uses Account
Teacher teaches Student
```

---

# 6. Aggregation

Special “HAS-A” relationship.

One object contains another object.

Example:

```text
Car HAS-A Engine
Department HAS-A Professor
```

Java:

```java
class Engine { }

class Car {
    Engine e = new Engine();
}
```

---

## Important:

Aggregation ≠ inheritance

Inheritance:

```text
Dog IS-A Animal
```

Aggregation:

```text
Car HAS-A Engine
```

Very important distinction.

---

# 7. Links

A physical/runtime connection between objects.

Example:

```text
Student object linked to Course object
```

Think of links as actual object references in memory.

```java
student.course = javaCourse;
```

---

# 8. Relationships Among Classes

Very exam-important.

---

## a) Association

General relationship.

Example:

```text
Teacher teaches Student
```

Objects know/interact with each other.

Can be:

* One-to-one
* One-to-many
* Many-to-many

---

## b) Aggregation

Weak ownership.

Example:

```text
Library HAS books
```

Books can exist independently.

---

## c) Using Relationship

Temporary usage dependency.

Example:

```java
class Printer {
    void print(Document d) { }
}
```

Printer uses Document temporarily.

Also called:

* Dependency relationship

---

## d) Instantiation

Creating object from class.

```java
Car c = new Car();
```

Class → object creation relationship.

---

## e) Meta-class

Class of a class.

Very theoretical but interesting.

In Java:
Every class itself is represented internally as an object of `Class`.

Example:

```java
Class c = String.class;
```

Reflection API uses this heavily.

Frameworks like:

* Spring
* Hibernate
* JUnit

use meta-programming concepts.

Tiny compiler-goblin inside JVM 🧠⚙️

---

# 9. Grouping Constructs

Mechanisms to organize classes and objects.

In Java:

* Packages
* Modules
* Interfaces

Example:

```java
package banking.accounts;
```

Purpose:

* Organization
* Avoid naming conflicts
* Better maintainability

---

# 10. State Modeling

Very important in software design.

Objects change states over time.

Example: ATM

```text
Idle → Card Inserted → PIN Verified → Transaction → Exit
```

This is modeled using:

* State diagrams
* Finite State Machines (FSM)

---

## State Components

### State

Current condition

### Event

Something happens

### Transition

Movement from one state to another

---

## Example

Traffic Light:

```text
Red → Green → Yellow → Red
```

---

# Related Important Concepts

These are often indirectly connected.

---

## UML (Unified Modeling Language)

Used to visually represent OOP systems.

Important diagrams:

* Class diagram
* Object diagram
* State diagram
* Use case diagram

---

## Composition vs Aggregation

Very commonly asked.

### Aggregation

Weak ownership.

```text
School HAS teachers
```

Teacher can exist separately.

---

### Composition

Strong ownership.

```text
House HAS rooms
```

Destroy house → rooms conceptually destroyed.

---

# Real-World Importance

Everything modern uses OOP ideas:

* Android apps
* Games
* Web backends
* Spring Boot
* GUI systems
* Enterprise software

Even React components have OOP-like design thinking despite functional style dominance nowadays.

---

# Most Important Exam Topics Here

Focus extra on:

* Encapsulation
* Inheritance
* Polymorphism
* Aggregation vs Association
* Object vs Class
* State modeling
* Major/minor elements
* Relationships among classes
