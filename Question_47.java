import java.awt.*;
import java.applet.Applet;
public class Question_47 extends Applet {

    public void paint(Graphics g){

        int x=100, y=300, x2=800, y2=400;
        
        
        int colorR[] = {255, 0, 0, 0, 255, 0, 0, 0, 255, 255};
        int colorG[] = {0, 255, 0, 0, 0, 255, 0, 255, 255, 0};
        int colorB[] = {0, 0, 255, 255, 0, 0, 255, 255, 0, 255};

        for(int i = 0; i<10; i++){

            int red = colorR[i];
            int green = colorG[i];
            int blue = colorB[i];

            g.drawRect(x,y,x2,y2);
            g.setColor(new Color(red,green,blue));
            x=x+10;
            y=y+10;
            x2=x2-20;
            y2=y2-20;

        }

    }
    


}


/* <applet code="Question_47.class" width="1000" height="1000">
 </applet>
 */
