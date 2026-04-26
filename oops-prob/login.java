import java.awt.*;
import java.awt.event.*;
public class login {
    public static void main(String[] args) {
        Frame f = new Frame("Login Window");

        Label l1 = new Label("Username");
        TextField t1 = new TextField(20);

        Label l2 = new Label("Password");
        TextField t2 = new TextField(20);
        t2.setEchoChar('*');

        Button b = new Button("Submit");
        Label res = new Label("                        ");

        b.addActionListener(e->{
            if(t1.getText().equals("admin") && t2.getText().equals("123")){
                res.setText("Hello Admin");
            }else{
                res.setText("INVALID");
            }
        });

        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(res);
        f.setSize(400,200);
        f.setVisible(true);
    }
}
