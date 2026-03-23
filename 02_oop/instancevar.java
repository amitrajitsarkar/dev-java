class Person{
    //? instance variable - belongs to each object separately
    String name;
    int age;

    // static variable - belongs to all object - shared accross ALL object
    static String dept ;
    // constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println(name + " " + age + " " + (dept == null? "Not in a dept" : dept));
    }
}
public class instancevar {
    public static void main(String args[]) {
        //Object -- instances of the classes
        Person p1 = new Person("Alice", 18);
        Person p2 = new Person("Bob", 20);

        p1.show();
        p2.show();
        // changing the all instances of that class
        Person.dept = "finance" ;
        
        System.err.println("After setting the dept");
        
        p1.show();
        p2.show(); 
    }
     
}