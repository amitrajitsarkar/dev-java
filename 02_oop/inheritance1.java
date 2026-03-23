// parent class
class Vehicle {
    String brand;
    int speed;
    String thing ;
    Vehicle(String brand, int speed ,String thing) {
        this.brand = brand;
        this.speed = speed;
        this.thing = thing;
    }

    void move() {
        System.out.println("this is a "+ thing+" "+brand + " is moving at " + speed + " km/h");
    }
}

// child class - inherits everything from Vehicle
class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed,"car");  // calls parent constructor
        this.doors = doors;
    }

    void showDoors() {
        System.out.println(brand + " has " + doors + " doors");
    }
}

// another child class
class Bike extends Vehicle {
    boolean hasSidecar;

    Bike(String brand, int speed, boolean hasSidecar) {
        super(brand, speed ,"bike");
        this.hasSidecar = hasSidecar;
    }

    void showSidecar() {
        System.out.println(brand + " sidecar: " + hasSidecar);
    }
}

public class inheritance1 {
    public static void main(String args[]) {
        Car car = new Car("Honda", 120, 4);
        Bike bike = new Bike("Yamaha", 100, false);

        // inherited from Vehicle ✅
        car.move();       // Honda is moving at 120 km/h
        bike.move();      // Yamaha is moving at 100 km/h

        // own methods
        car.showDoors();      // Honda has 4 doors
        bike.showSidecar();   // Yamaha sidecar: false
    }
}
/*

**Output:**
```
this is a car Honda is moving at 120 km/h
this is a bike Yamaha is moving at 100 km/h
Honda has 4 doors
Yamaha sidecar: false

*/