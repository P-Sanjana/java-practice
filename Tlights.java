import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class A extends JFrame implements ItemListener{
     public JPanel p,p1;
     public JRadioButton r1,r2,r3;
     public ButtonGroup bg;
     public JLabel l1,l2;
     public A(){
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(400,800);
         setLayout(new GridLayout(2,1));
         p=new JPanel(new FlowLayout());
         p1=new JPanel(new FlowLayout());
         l1=new JLabel();
         Font f=new Font("VERDANA",Font.BOLD,15);
         l1.setFont(f);
         add(l1);
         p.add(l1);
         add(p);
         l2=new JLabel();
         p1.add(l2);
         r1=new JRadioButton("Red Lights");
         r1.addItemListener(this);
         r1.setBackground(Color.RED);
         p1.add(r1);
         r2=new JRadioButton("Yellow Lights");
         r2.setBackground(Color.YELLOW);
         r2.addItemListener(this);
         p1.add(r2);
         r3=new JRadioButton("Green Lights");
         r3.addItemListener(this);
         r3.setBackground(Color.GREEN);
         p1.add(r3);
         add(p1);
         bg=new ButtonGroup();
         bg.add(r1);
         bg.add(r2);
         bg.add(r3);
         setVisible(true);
     }
     public void itemStateChanged(ItemEvent i){
         JRadioButton jb=(JRadioButton)i.getSource();
         switch(jb.getText()){
             case "Red Lights":{l1.setText("STOP");
             l1.setForeground(Color.RED);
         }
break;
case "Yellow Lights":{l1.setText("READY");
l1.setForeground(Color.YELLOW);
        }
        break;
        case "Green Lights":{
            l1.setText("GO");
            l1.setForeground(Color.GREEN);
        }
        break;
         }
     }
}
public class Tlights{
    public static void main(String args[]){
A a=new A();
    }
}