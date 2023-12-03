import java.awt.*;
import java.applet.Applet;

public class Question_48 extends Applet {

    public void paint(Graphics g){

        int x = 100, y = 100, x2=800, y2=800;

        int colorR[] = {255, 0, 0, 0, 255, 0, 0, 0, 255, 255};
        int colorG[] = {0, 255, 0, 0, 0, 255, 0, 255, 255, 0};
        int colorB[] = {0, 0, 255, 255, 0, 0, 255, 255, 0, 255};



        for(int i=0; i<10;i++){

            int red = colorR[i];
            int green = colorG[i];
            int blue = colorB[i];

            g.setColor(new Color(red,green,blue));

            g.drawOval(x,y,x2,y2);
            x =x+20;
            y=y+20;

            x2=x2-40;
            y2=y2-40;



        }

        

    }


    
}
/* <applet code="Question_48.class" width="1000" height="1000">
 </applet>
 */
