class Dimention{
    void area(){
        System.out.println("The area ");
    }
}

class Rectangle extends Dimention{
    int l,w;
    Rectangle(int l,int w){
        this.l= l;
        this.w =w ;
    }
    @Override
    void area(){
        System.out.println("The area of the rect : "+l*w);
    }
}

class triangle extends Dimention{
    int b,h;
    triangle(int b,int h){
        this.b= b;
        this.h =h ;
    }
    @Override
    void area(){
        System.out.println("The area of the rect : "+0.5*b*h);
    }
}

public class Dimentionmain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 05);
        r.area();// 50

        triangle t = new triangle(10, 04);
        t.area(); // 20
    }
}
