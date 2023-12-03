import java.awt.*;
import java.applet.Applet;

public class Question_51 extends Applet {

    public void paint(Graphics g){
        int x=100, y=100, x2=100, y2=800;

        int colorR[] = {255, 0, 0, 0, 255, 0, 0, 0, 255, 255};
        int colorG[] = {0, 255, 0, 0, 0, 255, 0, 255, 255, 0};
        int colorB[] = {0, 0, 255, 255, 0, 0, 255, 255, 0, 255};


        for(int i = 0; i<10; i++){
            int red = colorR[i];
            int green = colorG[i];
            int blue = colorB[i];
            g.drawLine(x,y,x2,y2);
            g.setColor(new Color(red,green,blue));

            x=x+20;
            y=y+30;

            x2=x2+20;
            y2=y2-30;

        }
        

    }
    
}

/*
 * <applet code="Question_51.class" width="1000" height="1000">
 * </applet>
 */