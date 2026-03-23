class Accord {
    // class definition
    String color = "black";
    int speed = 100;
    void drive() {
        System.out.println("The car is running at "
            +speed+
            " km/s"
        );
    }
} 
// class is the blue print for creating an object .
// it defines structure and behaviour 
// 1 structure --> attributes
// 1 behaviour --> methods

public class Car{
    public static void main(String args[]) {
        // object is the instance of the class 
        // a proper realization of the blueprint

        Accord myFirstAccord = new Accord();

        // accessig the attributes
        System.out.println(myFirstAccord.color);
        System.out.println(myFirstAccord.speed);

        // call method
        myFirstAccord.drive();
        
    }
}