class a{
        String name;
    a(){
        name = "unknown";
    }
    a(String name){
        this.name = name;
    }
}

public class x{
    a a1 = new a();
}

// static method can be called directly ..........

class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    void eats(){
        sop("eats!!");
    }

    void sound(){
        sop("Animal sound!!!");
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name);//doggy
    }
    void bark(){
        sop("barks!!");
    }

    @Override 
    void sound(){
        sop("VOW VOW");
    }
}

abstract class Car{
    abstract void name();
}

class Thiago extends Car{
    @Override 
    void name(){
        System.out.println("This is the new 2026 model of TATA Thiago !!!");
    }
}

// DMD

class Animals {
    void sound() {
        System.out.println("Animal");
    }
}

class Dogs extends Animals {
    void sound() {
        System.out.println("Dog");
    }
}

Animal a = new Dogs();
a.sound(); // DOG


final void().... // cant be overriden