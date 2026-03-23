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
