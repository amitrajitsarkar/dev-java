import java.util.*;

class St{
    int[] arr = new int[5] ;
    int top = -1;

    void push(int x){
        if(top == 4){
            System.out.println("Stack Overflow!!");
        }else{
            arr[++top] = x;
        }
    }
    void pop(){
        if(top ==-1){
            System.out.println("Stack Underflow!!");
        }else{
            System.out.println("Poped value : "+arr[top--]);
        }
    }
    void show(){
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class stack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        St s = new St();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value: ");
            s.push(sc.nextInt());
        }

        s.show();
        s.pop();
        s.show();
        sc.close();
    }
}
