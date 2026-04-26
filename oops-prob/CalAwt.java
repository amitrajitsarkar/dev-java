import java.awt.*;
import java.awt.event.*;

public class CalAwt {
    public static void main(String[] args) {
        
    Frame f = new Frame("Calculator");
    Label x = new Label("A :");
    TextField t1 = new TextField(10);

    Label y = new Label("B :");
    TextField t2 = new TextField(10);

    Button add  = new Button("+");
    Button sub  = new Button("-");
    Button mul  = new Button("*");
    Button div  = new Button("/");
    Label res = new Label("                                                    ");

    ActionListener calc = e ->{
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        String op = e.getActionCommand();

        switch (op) {
            case "+":
                res.setText("Result : "+(a+b));
                break;
            case "-":
                res.setText("Result : " + (a-b));
                break;
            case "*":
                res.setText("Result : " + (a*b));
                break;
            case "/":
                res.setText("Result : " + (a/b));
                break;
            default:
                break;
        }

    };

     add.addActionListener(calc);
        sub.addActionListener(calc);
        mul.addActionListener(calc);
        div.addActionListener(calc);
    
        f.setLayout(new FlowLayout());
        f.add(x);
        f.add(t1);
        f.add(y) ;
        f.add(t2);
        f.add(add); f.add(sub); f.add(mul); f.add(div);
        f.add(res);

        f.setSize(300,200);
        f.setVisible(true);
    }
    
}
