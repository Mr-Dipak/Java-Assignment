import java.applet.Applet;
import java.awt.Graphics;

public class Question_30 extends Applet{
    int number;

    public void init(){
        String numberParam = getParameter("number");

        number = Integer.parseInt(numberParam);



    }

    public void paint(Graphics g){
        g.drawString("The number is: "+ number,20,20);
    }

    
}
