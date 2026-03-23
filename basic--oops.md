## 1. **Class**
A class is a blueprint for creating objects. It defines the structure (attributes) and behavior (methods) that objects will have.

```java
public class Car {
    // Class definition
    String color;
    void drive() { }
}
```

## 2. **Object**
An object is an instance of a class a concrete realization of the blueprint.

```java
Car myCar = new Car();  // myCar is an object
```

## 3. **Instance Variable**
Variables that belong to individual objects. Each object has its own copy of instance variables.

```java
public class Person {
    String name;  // Instance variable
    int age;      // Instance variable
}
```

## 4. **Static Variables**
Variables shared by all instances of a class. They belong to the class, not individual objects.

```java
public class Student {
    static int totalStudents = 0;  // Shared by all Student objects
    String name;
}
```


## 5. **Taking Input Through Command Line**
Passing data to a program through command-line arguments.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);  // args[0] is first argument
    }
}
// Run: java Main HelloWorld
```

## 6. **Abstraction**
Hiding implementation details and showing only essential features to the user.

```java
public abstract class Animal {
    abstract void makeSound();  // Hide how sound is made
    // have to override this in the cild mandetory.
}
```


## 7. **Encapsulation**
Bundling data and methods together, controlling access using access modifiers (private, public, protected).

```java
public class BankAccount {
    private double balance;  // Hide balance from direct access
    
    public void deposit(double amount) {
        balance += amount;
    }
}
```

## 8. **Inheritance**
A class (child) inherits properties and methods from another class (parent).

```java
public class Vehicle {
    void start() { }
}

public class Car extends Vehicle {
    // Car inherits start() method
}
```

## 9. **Method Overloading**
Multiple methods with the same name but different parameters (compile-time/static polymorphism).

```java
public class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}
```
## 10. **Method Overriding**
A child class provides its own implementation of a method from the parent class.

```java
public class Animal {
    void makeSound() { System.out.println("Generic sound"); }
}

public class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Bark"); }
}
```


## 11. **Dynamic Method Dispatch**
The decision of which method to call is made at runtime based on the actual object type (runtime/dynamic polymorphism).

```java
Animal animal = new Dog();
animal.makeSound();  // Calls Dog's makeSound() at runtime, not Animal's
```

## 12. **Abstract Class**
A class that cannot be instantiated and is meant to be extended by subclasses. It can contain both abstract and concrete methods.

```java
public abstract class Shape {
    abstract double getArea();  // Must be implemented by subclasses
    
    void display() { System.out.println("Shape"); }  // Concrete method
}

public class Circle extends Shape {
    @Override
    double getArea() { return 3.14 * 5 * 5; }
}
```
