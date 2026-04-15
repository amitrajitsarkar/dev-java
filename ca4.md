Here’s a **compact, exam-oriented breakdown** of the three topics. Enough to write answers + basic understanding.

---

# 1. PACKAGE (Java)

## What is a Package?

* A **package = namespace** that groups related classes/interfaces.
* Prevents naming conflicts and improves organization.

## Types

* **Built-in packages** → `java.lang`, `java.util`, `java.io`
* **User-defined packages**

## How to create

```java
package mypack;

public class A {
    public void show() {
        System.out.println("Hello");
    }
}
```

## Compile & run

```bash
javac -d . A.java
java mypack.A
```

## Accessing package

```java
import mypack.A;
```

or

```java
import mypack.*;
```

## Key points

* Default package = no package declared
* `java.lang` imported automatically
* Access control matters:

  * `public` → everywhere
  * `protected` → same package + subclass
  * `default` → same package only
  * `private` → same class only

---

# 2. INTERFACE

## What is Interface?

* A **blueprint of a class** (like pure abstraction).
* Contains **only abstract methods** (before Java 8).
* Cannot create object directly.

## Syntax

```java
interface Animal {
    void sound();   // abstract method
}
```

## Implementation

```java
class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```

## Important features

* Methods are **public + abstract by default**
* Variables are **public + static + final**
* Supports **multiple inheritance**

```java
interface A { void show(); }
interface B { void display(); }

class C implements A, B {
    public void show() {}
    public void display() {}
}
```

## Java 8+

* Can have:

  * `default` methods
  * `static` methods

---

# 3. EXCEPTION HANDLING

## What is Exception?

* Runtime error that disrupts program flow.

## Types

* **Checked** → compile-time (IOException, SQLException)
* **Unchecked** → runtime (ArithmeticException, NullPointerException)

## Keywords

### try-catch

```java
try {
    int a = 10/0;
} catch (ArithmeticException e) {
    System.out.println("Error");
}
```

### multiple catch

```java
catch (Exception e)
```

### finally

* Always executes

```java
finally {
    System.out.println("Cleanup");
}
```

### throw

```java
throw new ArithmeticException("Error");
```

### throws

```java
void fun() throws IOException {
}
```

## Example

```java
class Test {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Done");
        }
    }
}
```

---

# Quick Revision Table

| Topic     | Key Idea                  |
| --------- | ------------------------- |
| Package   | Group of classes          |
| Interface | 100% abstraction (mostly) |
| Exception | Error handling mechanism  |

---

# What to write in exam (important lines)

* **Package** → “Used to organize classes and avoid name conflicts”
* **Interface** → “Used to achieve abstraction and multiple inheritance”
* **Exception Handling** → “Maintains normal flow of program even after runtime errors”

---

# Last-minute tips

* Write **syntax + 1 example** → easy marks
* Mention **advantages** → examiner likes that
* Don’t forget **keywords list** in exception

---
Got it—here’s the **simplest possible `throws` example** 👇

---

# Easy Example

```java
class Test {

    // method using throws
    void divide() throws ArithmeticException {
        int a = 10 / 0;   // error
    }

    public static void main(String[] args) {
        Test obj = new Test();

        try {
            obj.divide();   // calling method
        } catch (ArithmeticException e) {
            System.out.println("Error handled");
        }
    }
}
```

---

# What’s happening (very simple)

* `divide()` → says *“I might give error”* using `throws`
* `main()` → handles it using `try-catch`

---

# One line for exam

> "`throws` is used to declare an exception so that it can be handled by the calling method."

---
