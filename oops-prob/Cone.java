import java.util.Scanner;

public class Cone {
    final double pi = Math.PI;
    private int r ,h;
    Cone(int r , int h){
        this.r = r;
        this.h = h;
        System.out.printf("The volueme of cone from given vals : %.3f\n",(double)(pi*h*Math.pow(r, 2))/3);
    }
    Cone(){
        this.r =3;
        this.h =2;
        System.out.printf("The volueme of cone from fixed vals : %.3f\n",(double)(pi*h*Math.pow(r, 2))/3);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Cone c1 = new Cone(a ,b);
        Cone c2 = new Cone();
        sc.close();
    }
}