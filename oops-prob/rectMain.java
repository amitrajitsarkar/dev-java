class Rectangle{
    int l,w ;
    Rectangle(int l,int w){
        this.l = l;
        this.w = w;
    }
    void area(){
        System.out.println("The area of the rectangle is : "+w*l);
    }
}


class RectBox extends Rectangle{
    int h;
    RectBox(int l,int w,int h){
        super(l,w);
        this.h = h;
    }
    
    void vol(){
        System.out.println("The volume of the rectangle is : "+w*l*h);
    }
}


public class rectMain {
    public static void main(String[] args) {
        Rectangle re = new Rectangle(10, 5);
        re.area();

        RectBox reb = new RectBox(10, 5,2);
        reb.vol();
        
    }
}
