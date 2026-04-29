interface Sales {
    void getSalesFigure(double s);
    void displaySales();
}
class item{
    String title;
    int price;

    void Setitem(String t ,int p){
        title = t;
        price = p;
    }

    void displayItem() {
        System.out.println("Title: " + title + " Price: " + price);
    }
}
class HardWare extends item implements Sales{
    int id;
    String man;
    double sales;

    void setHardware(int id,String man){
        this.id = id;
        this.man=man;
    }

    public void getSalesFigure(double s){
        this.sales = s;
    }
    public void displaySales(){
        displayItem();
        System.out.println("id :"+id+" manufacturer: "+man+" sales: "+sales);
    }
}

public class HardSoft {
    public static void main(String[] args) {
        HardWare h = new HardWare();
        h.Setitem("Laptop", 100000);
        h.setHardware(101,"vivobook");
        h.getSalesFigure(1000);
        h.displaySales();
    }
}
