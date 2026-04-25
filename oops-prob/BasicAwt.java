import java.awt.*;

public class Basicawt {
    public static void main(String args[]){
        Frame f  = new Frame("Basic Awt!!");

        f.setSize(400 ,300);
        f.setLayout(new FlowLayout());
        f.add(new Label("Hello from this side !!!"));
        f.setVisible(true);

    }
}
