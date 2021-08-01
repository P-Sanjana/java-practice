import java.applet.Applet;
import java.awt.*;
public class Hellojava extends Applet{
    /*<applet code="Hellojava.class" width="400" height="400">
    </applet>*/
    public void init(){}
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        Font f=new Font("VERDANA",Font.BOLD,20);
        g.setFont(f);
        g.drawString("Hello Java",10,100);
    }
}