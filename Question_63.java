import java.awt.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Question_63 extends MouseAdapter {
    Label label;
    Question_63(){
        Frame f = new Frame();
        label = new Label();
        label.setBounds(50,50,200,30);
        f.add(label);
    
        f.addMouseListener(this);
        f.setLayout(null);
        f.setSize(500,500);
        f.setTitle("X,Y Cordinate");
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("X Cordinate is: "+e.getX()+" Y Cordinate is: "+e.getY());
    
    }

   public static void main(String[] args) {
    new Question_63();
   }
}

