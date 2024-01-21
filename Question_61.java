import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Question_61 extends Applet implements MouseListener {
    String message = "Mouse Event: ";
    String clickMessage, pressMessage, releaseMessage, enterMessage, exitMessage;

    @Override
    public void init() {
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 50, 50);
        g.drawString(clickMessage, 50, 70);
        g.drawString(pressMessage, 50, 90);
        g.drawString(releaseMessage, 50, 110);
        g.drawString(enterMessage, 50, 130);
        g.drawString(exitMessage, 50, 150);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        clickMessage = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        pressMessage = "Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        releaseMessage = "Mouse Released at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        enterMessage = "Mouse Entered at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        exitMessage = "Mouse Exited at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }
}


/*
 * <applet code="Question_61.class" width="500" height="500"></applet>
 */