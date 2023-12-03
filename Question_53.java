import java.awt.*;
import java.applet.Applet;

public class Question_53 extends Applet {

    public void paint(Graphics g){

//  int a=500, b=100, a2=1000, b2=500;
//  g.drawLine(a+30,b+80,a2-70,b2-20);
  int x=700, y=100, x2=1400, y2=700;
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
            y=y+35;

            x2=x2-40;
            y2=y2-15;

             

            
        }

         int a=700, b=100, a2=1400, b2=700;

        for(int j = 0;j<10;j++){
            int red = colorR[j];
            int green = colorG[j];
            int blue = colorB[j];

              g.drawLine(a,b,a2,b2);
              g.setColor(new Color(red, green,blue));

              
           a+=40;
           a2-=17.5;
           b+=17.5;
           b2-=30;

        //    b+=35;
        //    b2+=-15;



              

      

            


            


        }

       
        

    }
    
}

/*
 * <applet code="Question_53.class" width="1000" height="1000">
 * </applet>
 */