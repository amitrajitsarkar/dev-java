class Calculator {
    // same method name - different parameters

    // two ints
    int add(int a, int b) {
        return a + b;
    }

    // three ints
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // two doubles
    double add(double a, double b) {
        return a + b;
    }

    // string + int
    String add(String a, int b) {
        return a + b;
    }
    String add(String a, String b) {
        return a + b;
    }
}

public class methodOverloading {
    public static void main(String args[]) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));           // 30
        System.out.println(calc.add(10, 20, 30));       // 60
        System.out.println(calc.add(10.5, 20.5));       // 31.0
        System.out.println(calc.add("Score: ", 100));   // Score: 100
        System.out.println(calc.add("Hello ", "World !"));   // Hello World !
    }
}

/*

**Output:**
```
30
60
31.0
Score: 100
Hello World !

*/