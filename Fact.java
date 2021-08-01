import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Fact extends Applet implements ActionListener{
    /*<applet code="Fact.class"width="4"height="4">
    </applet>*/
    public Label l1,l2,l3;
    public Button b;
    public TextField tf1,tf2,tf3;
    public void init(){
        setSize(400,400);
        setLayout(new FlowLayout());
        l1=new Label("Enter Number");
        l1.setForeground(Color.BLUE);
        add(l1);
        tf1=new TextField(10);
        add(tf1);
        b=new Button("Compute");
        b.addActionListener(this);
        add(b);
        l3=new Label();
        add(l3);
        l2=new Label("Factorial");
        l2.setForeground(Color.BLUE);
        add(l3);
        tf2=new TextField(10);
        add(tf2);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int n=Integer.parseInt(tf1.getText());
        int f=1;
        while(n!=0){
            f=f*n;
            n--;
        }
        tf2.setText(String.valueOf(f));
    }
}