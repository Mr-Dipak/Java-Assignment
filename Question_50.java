import java.awt.*;
import java.applet.Applet;

public class Question_50 extends Applet {

    public void paint(Graphics g){

        int x=350, y=400, x2=650, y2=400;
        int colorR[] = {255, 0, 0, 0, 255, 0, 0, 0, 255, 255};
        int colorG[] = {0, 255, 0, 0, 0, 255, 0, 255, 255, 0};
        int colorB[] = {0, 0, 255, 255, 0, 0, 255, 255, 0, 255};


        for(int i = 0; i<10; i++){
            int red = colorR[i];
            int green = colorG[i];
            int blue = colorB[i];

            g.setColor(new Color(red,green,blue));

            g.drawLine(x,y,x2,y2);
            x=x-20;
            y=y+20;

            x2=x2+20;
            y2=y2+20;







        }

      
    }
    
}

/*
 <applet code="Question_50.java" width="1000" height="1000">
 </applet>
 */