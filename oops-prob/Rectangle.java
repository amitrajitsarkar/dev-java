import java.util.Scanner;

public class Rectangle {
    int len, wid;

    Rectangle(int len, int wid) {
        this.len = len;
        this.wid = wid;
    }

    void area() {
        System.out.println("The area of this rectangle is : " + len * wid);
    }

    void perimeter() {
        System.out.println("The perimiter of this rectangle is : " + 2 * (len + wid));

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int len, wid;
        System.out.println("Enter length and width : ");

        len = sc.nextInt();
        wid = sc.nextInt();

        rectangle r = new rectangle(len, wid);

        r.area();
        r.perimeter();
        sc.close();
        
    }

}
