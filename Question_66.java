import java.awt.*;
import java.awt.event.*;
public class Question_66 extends Frame {
    Label l1, l2;
    Question_66(){

        setVisible(true);
        setLayout(null);
        setSize(500,500);


        l1 = new Label();
        l2 = new Label();
        l1.setBounds(50,80,300,30);
        l2.setBounds(50,50,300,30);
        add(l1);
        add(l2);
        

        addMouseMotionListener(new MouseMotionListener() {

           public void mouseDragged(MouseEvent e){
            l1.setText("Mouse Dragged: x cordinate: "+e.getX() + " y cordinate: "+ e.getY());
            Graphics g=getGraphics(); 
            g.setColor(Color.PINK);
            g.fillOval(e.getX(),e.getY(),20,20);

           }

           public void mouseMoved(MouseEvent e){
             l2.setText("Mouse Moved: x cordinate: "+e.getX() + " y cordinate: "+ e.getY());

           }
            
        });

    }

    public static void main(String[] args) {
        new Question_66();
    }


   
    
    
}
