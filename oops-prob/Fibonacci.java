import java.util.Scanner;

/*
public class Fibonacci {
    
    void fib(int a, int b ,int c){
        if(c<=0) return;
        System.out.print(a + " ");
        fib(b, a+b, c-1);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fib(0, 1, 8);
    }
}
*/

public class Fibonacci{
    Fibonacci(int N){
        int a =0,b=1;
        int temp;
        for(int i=0;i<N;i++){
            System.out.print( a + " ");
            temp =a;
            a = b;
            b=temp+b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int N = sc.nextInt();
        if(N<=0){
            System.err.print("Invalid length");
            return;
        }
        Fibonacci f = new Fibonacci(N);
        sc.close();
    }
}