import java.awt.*;
import java.applet.Applet;
public class Question_31 extends Applet {

    String fontFamily;
    int fontStyle;
    int fontSize;

    public void init(){

        fontFamily = getParameter("fontFamily");
        String Style = getParameter("fontStyle");
        fontStyle = Font.PLAIN;

        if(Style != null){
            if(Style.equalsIgnoreCase("bold")){
                fontStyle = Font.BOLD;

            }
            else if(Style.equalsIgnoreCase("italic")){
                fontStyle = Font.ITALIC;
            }
        }

         String fontSizeString = getParameter("fontSize");

         fontSize = Integer.parseInt(fontSizeString);



    }

    public void paint(Graphics g){

        Font f = new Font(fontFamily,fontStyle,fontSize);
        g.setFont(f);
        g.drawString("Hey Hi UDMS!",20,20);

    }
}
