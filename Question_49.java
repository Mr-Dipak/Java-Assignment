import java.awt.*;
import java.applet.Applet;

public class Question_49 extends Applet{
    
    public void paint(Graphics g){

        int x=200, y=200, x2=800, y2=200;

        int colorR[] = {255, 0, 0, 0, 255, 0, 0, 0, 255, 255};
        int colorG[] = {0, 255, 0, 0, 0, 255, 0, 255, 255, 0};
        int colorB[] = {0, 0, 255, 255, 0, 0, 255, 255, 0, 255};


        for(int i=0; i<10;i++){

            int red = colorR[i];
            int green = colorG[i];
            int blue = colorB[i];

            g.setColor(new Color(red,green,blue));

            g.drawLine(x,y,x2,y2);

            x=x+30;
            x2=x2-30;

            y=y+30;
            y2=y2+30;


        }
        




    }
    
}

/*
 <applet code="Question_49.class" width="1000" height="1000">
 </applet>
 */