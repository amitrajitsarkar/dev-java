# Dynamic Method Dispatch (DMD)

**Definition:** Same parent reference, different child object = different behavior at runtime.

## Example:
```java
Shape s;

s = new Circle();     // runtime → Circle
s.draw();             // Drawing Circle

s = new Rectangle();  // runtime → Rectangle
s.draw();             // Drawing Rectangle
```

## Key Points:
- Parent reference → child object
- Method decided at **runtime** not compile time
- Basis of **dynamic polymorphism**

## Rule:
> Same reference + different object = different behavior
> Uncertain about what object is coming — DMD handles it at runtime automatically 
no need of 100 edge cases.