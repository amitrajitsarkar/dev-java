# module 2 : Features of Object-Oriented Programming (OOP)

These are the core characteristics that make OOP powerful and organized.

---

# 1. Objects and Classes

## Class

A class is a blueprint/template.

```java id="g1r2q8"
class Student {
    String name;

    void study() {
        System.out.println("Studying");
    }
}
```

---

## Object

An object is an instance of a class.

```java id="2o1x6o"
Student s1 = new Student();
```

Here:

* `Student` → class
* `s1` → object

---

## Why Important?

* Organizes code properly
* Represents real-world entities
* Makes large software manageable

---

# 2. Abstraction

Abstraction means:

> Showing essential features while hiding internal complexity.

Example:
You use:

* mobile phone
* ATM
* car

without knowing internal circuitry.

---

## In Java

Achieved using:

* abstract classes
* interfaces

Example:

```java id="4v3djk"
abstract class Animal {
    abstract void sound();
}
```

User only knows:

```text id="5v5s2s"
animal makes sound
```

not internal implementation.

---

## Advantages

* Reduces complexity
* Improves security
* Easier maintenance

---

# 3. Encapsulation

Encapsulation means:

> Wrapping data and methods together into a single unit and restricting direct access.

Usually achieved using:

* private variables
* public getter/setter methods

---

## Example

```java id="kcr6sq"
class Bank {
    private int balance;

    public void deposit(int amt) {
        balance += amt;
    }

    public int getBalance() {
        return balance;
    }
}
```

Here:

* `balance` cannot be accessed directly
* controlled access provided

---

## Why Important?

* Data protection
* Prevents accidental modification
* Better control

Tiny vault around variables 🔐

---

# 4. Inheritance

Inheritance means:

> One class acquires properties and methods of another class.

---

## Example

```java id="5n4gv8"
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

`Dog` inherits `eat()` from `Animal`.

---

## Types of Inheritance in Java

### Supported directly

* Single
* Multilevel
* Hierarchical

### Not supported using classes

* Multiple inheritance

(Java uses interfaces for that.)

---

## Advantages

* Code reuse
* Reduces duplication
* Creates hierarchy

---

# 5. Polymorphism

Polymorphism means:

> One entity behaves in multiple forms.

---

# Types

## a) Compile-time Polymorphism

(Method Overloading)

```java id="b8izmh"
class Math {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

Same method name, different parameters.

---

## b) Runtime Polymorphism

(Method Overriding)

```java id="2ez7f5"
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

---

## Important Concept

```java id="rf8eb4"
Animal a = new Dog();
```

Reference type:

* `Animal`

Actual object:

* `Dog`

JVM decides method at runtime.

---

## Advantages

* Flexibility
* Dynamic behavior
* Cleaner code

---

# 6. Modularity

Modularity means:

> Dividing a program into smaller independent modules/classes.

Instead of giant spaghetti-code volcano 🌋:

```text id="ft6r92"
One huge file with everything
```

you split it into:

```text id="xt5psn"
User class
Database class
Payment class
Login class
```

---

## In Java

Achieved using:

* classes
* packages
* modules

Example:

```java id="fd2k8h"
package banking.accounts;
```

---

## Advantages

* Easier debugging
* Better maintenance
* Reusable components
* Team development becomes easier

---

# Quick Summary Table

| Feature           | Meaning                               |
| ----------------- | ------------------------------------- |
| Objects & Classes | Blueprint and actual instance         |
| Abstraction       | Hide unnecessary details              |
| Encapsulation     | Protect data using controlled access  |
| Inheritance       | Reuse properties from another class   |
| Polymorphism      | One thing behaves differently         |
| Modularity        | Divide program into independent parts |

---

# Most Important Interview/Exam Areas

Focus extra on:

* Encapsulation vs Abstraction
* Overloading vs Overriding
* Inheritance types
* Runtime polymorphism
* IS-A vs HAS-A relationship
* Access modifiers (`private`, `public`, `protected`)
