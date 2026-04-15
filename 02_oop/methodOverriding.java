// parent
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// child - overrides parent method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {    
        System.out.println("Meow!");
    }
}

class Snake extends Animal {    
    // no override - uses parent's version
}

public class methodOverriding {
    public static void main(String args[]) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        Animal s = new Snake();

        a.makeSound();  // Some generic sound
        d.makeSound();  // Woof!
        c.makeSound();  // Meow!
        s.makeSound();  // Some generic sound - uses parent
    }
}
/*

**Output:**
```
Some generic sound
Woof!
Meow!
Some generic sound
*/