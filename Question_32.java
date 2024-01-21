import java.awt.*;
import java.applet.Applet;
public class Question_32 extends Applet {

    String number;

    public void init(){

        number = getParameter("number");
        // number = Integer.parseInt(parseNumber);

    }

    public void paint(Graphics g){

        g.drawString("Number: "+number,20,20);

        Font f = new Font("Arial",Font.ITALIC,18 );


        g.setFont(f);
         g.drawString("Number: "+number,20,50);
         


    }
    
}
