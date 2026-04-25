import java.util.Scanner;
public class volume {
    // rect
    final double pi = Math.PI;
    void calc(int a,int b,int c){
        System.out.println("The volume of the rect box : "+ (int)a*b*c);
    }
    // cube
    void calc(int a){
        System.out.println("The volume of the cube : "+ (long)Math.pow(a,3));
    }
    
    //cyl
    void calc(int r,int h){
        System.out.printf("The volume of the cylinder : %.3f \n",(double)pi*Math.pow(r, 2)*h);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int r = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();

        volume vl = new volume();
        vl.calc(a, b, c);
        vl.calc(r,h);
        vl.calc(s);
        sc.close();
    }
}
