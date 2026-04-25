import java.util.Scanner;

public class Calculator {
    int add(int a ,int b){
        return a+b;
    }
    
    int sub(int a ,int b){
        return a - b;
    }

    long mul(int a ,int b){
        return a*b;
    }

    float div(int a ,int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b =sc.nextInt();

        Calculator cal = new Calculator();

        System.out.println("The addition : " + cal.add(a,b));
        System.out.println("The subtraction : " + cal.sub(a,b));
        System.out.println("The multipliation : " + cal.mul(a,b));
        System.out.println("The division : " + cal.div(a,b));

        sc.close();
    }
}
