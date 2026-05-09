# Module 5 : Exception Handling and Multithreading

This module is where Java starts behaving like a serious industrial language ⚙️
You learn:

* how programs handle errors safely
* how multiple tasks run simultaneously

These concepts are heavily used in:

* backend servers
* Android apps
* games
* browsers
* Spring Boot
* operating-system-like systems

---

# PART 1: Exception Handling

---

# 1. What is Exception Handling?

Exception handling is a mechanism to handle runtime errors gracefully without crashing the program.

Without exception handling:

```text id="az0zwp"
Program crashes abruptly
```

With exception handling:

```text id="4z77wa"
Program handles problem safely
```

---

# Example

```java id="w53c48"
int a = 10;
int b = 0;

System.out.println(a / b);
```

Output:

```text id="a77jlwm"
ArithmeticException
```

Program crashes.

---

# With Exception Handling

```java id="uljlwm"
try {
    int a = 10 / 0;
}
catch(ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

Output:

```text id="agjlwm"
Cannot divide by zero
```

---

# 2. Types of Exception Classes

Hierarchy:

```text id="o8jlwm"
Throwable
 ├── Error
 └── Exception
       ├── Checked Exception
       └── Unchecked Exception
```

---

# a) Checked Exceptions

Checked during compile time.

Examples:

* IOException
* SQLException
* ClassNotFoundException

Must handle using:

* try-catch
* throws

---

# b) Unchecked Exceptions

Occur during runtime.

Examples:

* ArithmeticException
* NullPointerException
* ArrayIndexOutOfBoundsException

---

# Very Important Examples

## NullPointerException

```java id="1jlwm2"
String s = null;
System.out.println(s.length());
```

---

## ArrayIndexOutOfBoundsException

```java id="2jlwm3"
int arr[] = {1,2,3};
System.out.println(arr[5]);
```

---

## NumberFormatException

```java id="3jlwm4"
int x = Integer.parseInt("abc");
```

Tiny runtime landmines 💣

---

# 3. try and catch

Used to catch exceptions.

---

## Syntax

```java id="4jlwm5"
try {
    // risky code
}
catch(ExceptionType e) {
    // handling code
}
```

---

# Multiple catch Blocks

```java id="5jlwm6"
try {
    int a = 10/0;
}
catch(ArithmeticException e) {
    System.out.println("Math error");
}
catch(Exception e) {
    System.out.println("General error");
}
```

---

# Important Rule

Specific exception catch first.

Wrong:

```text id="6jlwm7"
Exception
ArithmeticException
```

because parent class catches everything already.

---

# 4. throw Keyword

Used to manually throw exception.

---

## Example

```java id="7jlwm8"
throw new ArithmeticException("Invalid");
```

---

# Important Example

```java id="8jlwm9"
int age = 15;

if(age < 18) {
    throw new ArithmeticException("Not eligible");
}
```

---

# 5. throws Keyword

Declares exception responsibility.

---

## Example

```java id="9jlwm0"
void readFile() throws IOException {
}
```

Meaning:

```text id="0jlwm1"
This method may generate exception
```

Caller must handle it.

---

# throw vs throws

| throw                   | throws                       |
| ----------------------- | ---------------------------- |
| Used inside method      | Used in method declaration   |
| Throws actual exception | Declares possibility         |
| Singular object         | Multiple exceptions possible |

---

# 6. finally Block

Always executes.

Used for:

* cleanup
* closing files
* database connections

---

## Example

```java id="ajlwm2"
try {
    int x = 10/0;
}
catch(Exception e) {
    System.out.println("Error");
}
finally {
    System.out.println("Always executes");
}
```

---

# Important

`finally` executes even if exception occurs.

---

# 7. User Defined Exception

Custom exceptions created by programmer.

---

## Example

```java id="bjlwm3"
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
```

Usage:

```java id="cjlwm4"
if(age < 18) {
    throw new InvalidAgeException("Too young");
}
```

---

# Why Needed?

Real applications need domain-specific errors:

* InvalidTransactionException
* PaymentFailedException
* UserNotFoundException

---

# PART 2: Multithreading

---

# 8. Basics of Multithreading

Multithreading means:

> multiple tasks executing simultaneously.

Example:
Browser:

* music playing
* downloading
* scrolling

all together.

---

# Process vs Thread

| Process             | Thread                 |
| ------------------- | ---------------------- |
| Independent program | Smaller execution unit |
| Heavyweight         | Lightweight            |
| Separate memory     | Shared memory          |

---

# 9. Main Thread

Every Java program starts with:

```java id="djlwm5"
main()
```

This is main thread.

---

## Example

```java id="ejlwm6"
Thread t = Thread.currentThread();
System.out.println(t);
```

---

# 10. Thread Life Cycle

States:

```text id="fjlwm7"
New
 ↓
Runnable
 ↓
Running
 ↓
Blocked/Waiting
 ↓
Terminated
```

---

# 11. Creating Threads

Very important.

---

# Method 1: Extending Thread Class

```java id="gjlwm8"
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
```

Start:

```java id="hjlwm9"
MyThread t = new MyThread();
t.start();
```

---

# Important

Use:

```java id="ijlwm0"
start()
```

NOT:

```java id="jjlwm1"
run()
```

because `start()` creates new thread internally.

---

# Method 2: Implementing Runnable

Preferred approach.

```java id="kjlwm2"
class MyThread implements Runnable {
    public void run() {
        System.out.println("Running");
    }
}
```

Usage:

```java id="ljlwm3"
Thread t = new Thread(new MyThread());
t.start();
```

---

# Why Runnable Better?

Java supports single inheritance only.

So:

```text id="mjlwm4"
implement Runnable
```

is more flexible.

---

# 12. Multiple Threads Example

```java id="njlwm5"
class A extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("A");
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("B");
        }
    }
}
```

Outputs interleave unpredictably.

Thread scheduler chaos goblin activated ⚡

---

# 13. Thread Priorities

Priority range:

```text id="ojlwm6"
1 to 10
```

Constants:

```java id="pjlwm7"
MIN_PRIORITY
NORM_PRIORITY
MAX_PRIORITY
```

Example:

```java id="qjlwm8"
t.setPriority(10);
```

Higher priority → more CPU preference.

Not guaranteed though.

---

# 14. Thread Synchronization

Used to avoid data inconsistency.

---

# Problem Example

Two threads updating same bank account.

Without synchronization:

```text id="rjlwm9"
Race condition occurs
```

---

# Solution

```java id="sjlwm0"
synchronized void withdraw() {
}
```

Only one thread enters at a time.

---

# Important Example

```java id="tjlwm1"
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}
```

---

# 15. Inter-thread Communication

Threads communicate using:

* wait()
* notify()
* notifyAll()

---

# Example Scenario

Producer-consumer problem.

One thread:

```text id="ujlwm2"
Produces data
```

Another:

```text id="vjlwm3"
Consumes data
```

---

# Important Methods

| Method      | Purpose          |
| ----------- | ---------------- |
| wait()      | Pause thread     |
| notify()    | Wake one thread  |
| notifyAll() | Wake all threads |

---

# 16. Deadlock

Very important theory topic.

Deadlock occurs when:

> two threads wait forever for each other’s resources.

---

# Example

```text id="wjlwm4"
Thread 1 holds Resource A
waiting for Resource B

Thread 2 holds Resource B
waiting for Resource A
```

System freezes.

---

# Real-Life Analogy

```text id="xjlwm5"
Two people blocking narrow hallway waiting for each other
```

---

# Prevention

* resource ordering
* timeout handling
* avoiding circular waits

---

# 17. Suspending and Resuming Threads

Old methods:

```java id="yjlwm6"
suspend()
resume()
stop()
```

Deprecated now because unsafe.

Can cause:

* deadlocks
* resource locking issues

---

# Modern Alternative

Use:

* wait()
* sleep()
* interrupt()
* flags/conditions

---

# sleep() Example

```java id="zjlwm7"
Thread.sleep(1000);
```

Pauses thread for 1 second.

---

# Most Important Examples to Practice

---

# Exception Handling

## Practice:

* divide by zero
* null pointer
* array index
* multiple catch
* finally block
* custom exception

---

# Multithreading

## Practice:

* creating thread
* Runnable interface
* synchronization
* producer-consumer
* deadlock theory
* sleep()
* priorities

---

# VERY Important Viva Questions

## Difference Between throw and throws

## Difference Between Process and Thread

## Why synchronization needed?

## Why Runnable preferred over Thread?

## Checked vs Unchecked Exception

## What is deadlock?

## Difference Between wait() and sleep()

| wait()                  | sleep()               |
| ----------------------- | --------------------- |
| Releases lock           | Does not release lock |
| Used in synchronization | Simple delay          |
| Object class            | Thread class          |

---

# Real-World Importance

Multithreading powers:

* web servers
* multiplayer games
* IDEs
* browsers
* async APIs
* backend concurrency

Exception handling powers:

* fault tolerance
* stable applications
* production-grade software

Without them:

```text id="0jlwm8"
software becomes a glass cannon
```

fast but explodes under pressure.
