import java.awt.*;
import java.awt.event.*;

public class Question_67 extends Frame {
    Label l1, l2;

    Question_67() {
        setLayout(null); 
        setSize(500, 500);
        setVisible(true);

        l1 = new Label();
        l2 = new Label();
        l1.setBounds(50, 50, 300, 30);
        l2.setBounds(50, 80, 300, 30);
        add(l1);
        add(l2);
    }

}

class OutsideClass implements MouseMotionListener {
    Question_67 obj;

    OutsideClass(Question_67 obj) {
        this.obj = obj;
    }

    public void mouseDragged(MouseEvent e) {
        obj.l1.setText("Mouse Dragged: x cordinate: " + e.getX() + " y cordinate: " + e.getY());
        Graphics g = obj.getGraphics();
        g.setColor(Color.PINK);
        g.fillOval(e.getX(), e.getY(), 20, 20);

    }

    public void mouseMoved(MouseEvent e) {
         obj.l2.setText("Mouse Moved: x cordinate: "+e.getX() + " y cordinate: "+ e.getY());

    }

}
