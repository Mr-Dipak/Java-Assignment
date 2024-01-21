import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;


public class Question_62 extends Applet {
    int circleX = -1; 
    int circleY = -1; 
    final int circleRadius = 30;

    public void init() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                circleX = e.getX();
                circleY = e.getY();
                repaint(); 
            }
        });
    }

    public void paint(Graphics g) {
        if (circleX != -1 && circleY != -1) {
            
            g.fillOval(circleX - circleRadius, circleY - circleRadius, 2 * circleRadius, 2 * circleRadius);
        }
    }
}

/*
 * <applet code="Question_62.java" width="500" height="500"></applet>
 */
