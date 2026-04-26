import java.awt.*;
import java.awt.event.*;

public class Registration {
    public static void main(String[] args) {
        Frame f = new Frame("Register Form");

        Label a = new Label("Name");
        TextField name = new TextField(20);

        Label b = new Label("Email");
        TextField email = new TextField(20);

        Label c = new Label("Password");
        TextField pass = new TextField(20);

        pass.setEchoChar('*');

        Button btn = new Button("Submit");
        Label res = new Label("                                      ");

        btn.addActionListener(e -> {
            if (!name.getText().equals("")) {
                res.setText("Registered : " + name.getText());
            } else {
                res.setText("Can't be blank");
            }
        });
        f.setLayout(new FlowLayout());
        f.add(a);
        f.add(name);
        f.add(b);
        f.add(email);
        f.add(c);
        f.add(pass);
        f.add(btn);
        f.add(res);

        f.setSize(400, 200);
        f.setVisible(true);

    }
}
