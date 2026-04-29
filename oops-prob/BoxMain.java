import java.util.Scanner;

class Box {
    int l, w, h;

    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    int vol() {
        return l * h * w;
    }
}

class BoxWeight extends Box {
    int weight;
    
    BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h);
        this.weight = weight;
    }
}

class Shipment extends BoxWeight {
    int costpv, costpw;
    
    Shipment(int l, int w, int h, int weight, int costpv, int costpw) {
        super(l, w, h, weight);
        this.costpv = costpv;
        this.costpw = costpw;
    }
    
    void Shipping_Cost() {
        System.out.println("The shipping cost is : " + (vol() * costpv) + (weight * costpw));
    }
}

public class BoxMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        Shipment ship = new Shipment(l, w, h, 10, 4, 5);
        System.out.println("Box volume : "+ ship.vol());
        ship.Shipping_Cost();
    }

}
