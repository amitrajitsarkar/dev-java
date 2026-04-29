import java.util.Scanner;

abstract class Person {
    abstract void read();

    abstract void print();
}

class Teacher extends Person {
    int std, roll;
    String name;

    void read() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        std = sc.nextInt();
        roll = sc.nextInt();

        sc.close();
    }

    void print() {
        System.out.println(name + " " + roll + " " +std);
    }
}

public class personMain {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.read();
        t.print();
    }
}
