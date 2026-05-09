# Module 7 : Generic Programming in Java

Generics allow Java to write:

```text id="1gq1su"
type-safe reusable code
```

Instead of writing separate code for:

* integers
* strings
* objects

you write one flexible version.

Introduced in:

```text id="v5t3kw"
Java 5
```

Very important in:

* Collections Framework
* Spring
* Hibernate
* APIs

---

# Why Generics Needed?

Before generics:

```java id="o7z6v9"
ArrayList list = new ArrayList();

list.add("Hello");

Integer x = (Integer) list.get(0);
```

Runtime error possible:

```text id="i1o3r8"
ClassCastException
```

---

# With Generics

```java id="d3m5u1"
ArrayList<String> list =
new ArrayList<String>();
```

Now:

* only String allowed
* safer
* no manual casting needed

Compiler becomes a security guard 🛡️

---

# 1. Generic Classes

Class that works with different data types.

---

# Syntax

```java id="x9n2q4"
class Test<T> {
}
```

`T` = Type parameter.

---

# Example

```java id="y4p8k2"
class Box<T> {

    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}
```

Usage:

```java id="z7f6r1"
Box<Integer> b1 = new Box<Integer>();

b1.set(10);

System.out.println(b1.get());
```

---

# Same Class with Different Types

```java id="n2v1c5"
Box<String>
Box<Double>
Box<Character>
```

Reusable without duplication.

---

# Common Generic Type Names

| Symbol | Meaning |
| ------ | ------- |
| T      | Type    |
| E      | Element |
| K      | Key     |
| V      | Value   |
| N      | Number  |

Convention only.

---

# 2. Generic Methods

Methods that use generic types independently.

---

# Syntax

```java id="j8w4t0"
<T> returnType methodName()
```

---

# Example

```java id="m1k7x3"
class Demo {

    <T> void print(T data) {
        System.out.println(data);
    }
}
```

Usage:

```java id="r3h9b6"
Demo d = new Demo();

d.print(100);
d.print("Java");
```

---

# Important Point

Generic method can exist even inside non-generic class.

---

# 3. Bounded Types

Restrict generic types.

Sometimes:

```text id="c6q2y7"
Any type is too flexible
```

You may want:

```text id="s5l1m4"
Only Number subclasses allowed
```

---

# Syntax

```java id="a2x7n8"
<T extends ClassName>
```

---

# Example

```java id="f4w9z2"
class Test<T extends Number> {

    T num;
}
```

Allowed:

```java id="u6p3k1"
Integer
Double
Float
```

Not allowed:

```java id="q9e8v0"
String
```

---

# Important Example

```java id="l5b2n7"
class Calculator<T extends Number> {

    T value;
}
```

Makes mathematical operations safer.

---

# Multiple Bounds

```java id="h1v4c6"
<T extends A & B>
```

Meaning:

* must inherit A
* must implement B

---

# Wildcards (Related Important Topic)

Very important related concept.

---

# Unbounded Wildcard

```java id="g7x1m9"
List<?>
```

Any type allowed.

---

# Upper Bounded Wildcard

```java id="w8n6r3"
List<? extends Number>
```

Read-only style flexibility.

---

# Lower Bounded Wildcard

```java id="k3c5v2"
List<? super Integer>
```

Accept Integer or parent types.

---

# PECS Rule

Very famous Java rule.

```text id="p9j4s8"
Producer → extends
Consumer → super
```

---

# 4. Restrictions and Limitations of Generics

Very important exam topic.

Generics are powerful but have limitations because of:

```text id="y2m7q5"
Type Erasure
```

---

# Type Erasure

Java removes generic type info during compilation.

At runtime:

```java id="t4r8x1"
ArrayList<String>
ArrayList<Integer>
```

both become:

```text id="u1f6c9"
ArrayList
```

Generic magic disappears behind compiler curtain 🎭

---

# Important Restrictions

---

# a) Cannot Create Object of Type Parameter

Wrong:

```java id="v7n2m4"
T obj = new T();
```

Not allowed.

---

# b) Cannot Create Generic Arrays

Wrong:

```java id="x5p1z6"
T arr[] = new T[10];
```

---

# c) Cannot Use Primitive Types

Wrong:

```java id="r8w3y2"
Box<int>
```

Correct:

```java id="b4m7n1"
Box<Integer>
```

Uses wrapper classes.

---

# d) Static Members Cannot Use Type Parameter

Wrong:

```java id="d6x9q8"
static T value;
```

Because static belongs to class, not object.

---

# e) Cannot Use instanceof with Generic Types

Wrong:

```java id="n3k5r7"
if(obj instanceof List<String>)
```

---

# f) Exception Classes Cannot Be Generic

Wrong:

```java id="c1v8m2"
class MyException<T> extends Exception
```

Not allowed.

---

# Advantages of Generics

| Advantage          | Meaning                  |
| ------------------ | ------------------------ |
| Type safety        | Fewer runtime errors     |
| Reusability        | Same code for many types |
| No casting         | Cleaner code             |
| Better readability | Easier maintenance       |

---

# Most Important Real-World Use

Collections Framework.

Example:

```java id="e7b2q4"
ArrayList<String>
HashMap<Integer, String>
```

Without generics, collections would be chaos soup 🍜

---

# Important Examples to Practice

---

# Generic Class

```java id="f9k1w3"
class Box<T>
```

---

# Generic Method

```java id="m2v6x8"
<T> void display(T value)
```

---

# Bounded Type

```java id="j4n7r1"
<T extends Number>
```

---

# Wildcards

```java id="s8q3m5"
<?>
<? extends Number>
<? super Integer>
```

---

# Most Important Viva Questions

## What are Generics?

## Why Generics introduced?

## Difference Between Generic Class and Generic Method

## What is Type Erasure?

## Why primitive types not allowed in Generics?

## What is Bounded Type?

## Difference Between:

```java id="t1m5x9"
<? extends T>
<? super T>
```

---

# Important Interview Concept

## Compile-Time Safety

Generics catch errors earlier.

Without generics:

```text id="w6k2r4"
Runtime explosion
```

With generics:

```text id="z3p8n7"
Compile-time protection
```

Compiler acts like airport security for data types ✈️
