import java.applet.Applet;
import java.awt.*;

public class Question_89 extends Applet {
    List fontList;

    public void init() {
        
        fontList = new List();

        
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();

       
        for (String fontName : fontNames) {
            fontList.add(fontName);
        }

       
        add(fontList);
    }
}

/*
 * <applet code="Question_89" width="500" height="500"></applet>
 */
