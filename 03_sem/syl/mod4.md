# Module 4 : Reusability Properties in Java

This module is mainly about:

> Reusing existing code using inheritance and interfaces.

Instead of rewriting code repeatedly, Java allows classes to extend and reuse behavior.

---

# 1. Superclass and Subclass

---

## Superclass

Parent/base class whose properties are inherited.

```java id="2xjlwm"
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
```

---

## Subclass

Child/derived class inheriting superclass properties.

```java id="u6ggop"
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

`Dog` gets:

* `eat()`
* plus its own methods

---

# Important Relationship

```text id="pc8e3r"
Dog IS-A Animal
```

This is inheritance.

---

# Advantages

* Code reuse
* Less duplication
* Better organization
* Easier maintenance

---

# 2. Multilevel Hierarchy

Inheritance chain.

```java id="91e92m"
class Animal { }

class Mammal extends Animal { }

class Dog extends Mammal { }
```

Hierarchy:

```text id="0zj2pq"
Animal
   ↓
Mammal
   ↓
Dog
```

`Dog` inherits from both upper levels.

---

# Types of Inheritance in Java

| Type               | Supported |
| ------------------ | --------- |
| Single             | Yes       |
| Multilevel         | Yes       |
| Hierarchical       | Yes       |
| Multiple (classes) | No        |

Java avoids multiple inheritance with classes to prevent:

```text id="83bx1h"
Diamond Problem
```

---

# 3. Constructor Calling in Inheritance

Very important topic.

When subclass object is created:

> superclass constructor executes first.

---

## Example

```java id="6s2y9k"
class A {
    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    B() {
        System.out.println("B constructor");
    }
}
```

Output:

```text id="w2q8q8"
A constructor
B constructor
```

---

# Why?

Subclass depends on superclass initialization first.

Like:

```text id="pkm0v2"
Building foundation before upper floors
```

---

# 4. super Keyword

`super` refers to immediate parent class object.

---

# Uses of super

---

## a) Access Parent Variable

```java id="9n14e2"
super.x;
```

---

## b) Access Parent Method

```java id="59imgh"
super.show();
```

---

## c) Call Parent Constructor

```java id="4m33m7"
super();
```

Very important.

---

# 5. super() Method

Calls superclass constructor.

---

## Example

```java id="8t2o8o"
class A {
    A(int x) {
        System.out.println(x);
    }
}

class B extends A {
    B() {
        super(10);
    }
}
```

---

# Important Rules

* Must be first statement in constructor
* If not written, Java inserts default `super()`

---

# 6. final Keyword

Used to restrict modification.

---

# final Variable

Constant value.

```java id="m7a92r"
final int x = 10;
```

Cannot change later.

---

# final Method

Cannot be overridden.

```java id="0w5v1s"
final void show() { }
```

---

# final Class

Cannot be inherited.

```java id="9ncr6u"
final class Test { }
```

Example:

```text id="m2ik13"
String class
```

---

# Why final?

Security + immutability + optimization.

---

# 7. Dynamic Method Dispatch

Very important runtime polymorphism topic.

---

# Meaning

Method call resolved during runtime, not compile time.

---

## Example

```java id="wvy5yc"
class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

Animal a = new Dog();
a.sound();
```

Output:

```text id="m4ms3n"
Bark
```

---

# Key Concept

Reference type:

```java id="33z9uv"
Animal
```

Object type:

```java id="i91tfj"
Dog
```

JVM decides actual method during runtime.

This powers:

* runtime polymorphism
* flexible APIs
* framework architecture

---

# 8. Abstract Classes

Class declared using `abstract`.

Cannot create objects directly.

---

## Example

```java id="d1dsg9"
abstract class Shape {
    abstract void draw();
}
```

---

# Purpose

Provide:

* partial implementation
* common structure

---

# Features

Abstract class can contain:

* abstract methods
* normal methods
* constructors
* variables

---

# 9. Abstract Methods

Methods without body.

```java id="u7nvxa"
abstract void draw();
```

Subclass MUST implement them.

---

## Example

```java id="0ibcll"
class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}
```

---

# Why Abstract Classes?

Used when:

```text id="iqp0xr"
Some behavior common,
some behavior different
```

---

# 10. Interfaces

Very important Java concept.

Interface defines:

> contract/rules classes must follow.

---

## Example

```java id="s09ibq"
interface Animal {
    void sound();
}
```

Implementation:

```java id="3zn0c7"
class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```

---

# Interface vs Abstract Class

| Interface                     | Abstract Class      |
| ----------------------------- | ------------------- |
| Pure contract                 | Partial abstraction |
| Multiple inheritance possible | Single inheritance  |
| No object                     | No object           |
| `implements` keyword          | `extends` keyword   |

---

# Important Modern Java Note

Interfaces can now contain:

* default methods
* static methods

(after Java 8)

---

# Why Interfaces Matter?

Huge in real-world Java:

* Spring Boot
* JDBC
* Collections
* Android
* Dependency Injection

Interfaces are like:

```text id="6n1d4s"
USB ports of software design
```

Anything following the contract can plug in.

---

# 11. Packages

Package = group of related classes.

Used for:

* organization
* namespace management
* access control

---

## Creating Package

```java id="zdxb8u"
package banking;
```

---

# File Structure

```text id="ph5q9m"
banking/
   Account.java
```

---

# Advantages

* Avoid class-name conflicts
* Better modularity
* Security

---

# 12. Importing Packages

Use `import`.

```java id="jlwmcr"
import java.util.Scanner;
```

or

```java id="ng9v8z"
import java.util.*;
```

---

# Common Packages

| Package   | Purpose      |
| --------- | ------------ |
| java.lang | Core classes |
| java.util | Utilities    |
| java.io   | Input/output |
| java.net  | Networking   |

---

# 13. Member Access for Packages

Access depends on:

* access modifiers
* package location

---

# Important Rules

## default access

Accessible only inside same package.

---

## public

Accessible everywhere.

---

## protected

Accessible:

* same package
* subclasses outside package

---

# Most Important Topics in This Module

Focus heavily on:

* Inheritance
* super keyword
* Constructor chaining
* final keyword
* Dynamic method dispatch
* Abstract class vs Interface
* Package creation/importing
* Runtime polymorphism

---

# Extremely Common Viva Question

## Difference Between Abstract Class and Interface

### Abstract Class

Used when classes share common behavior.

### Interface

Used when classes share common capability/contract.

Example:

```text id="ef2oxh"
Bird and Airplane both can Fly
```

So:

```java id="a1i7rq"
interface Flyable
```

Cleaner design.
