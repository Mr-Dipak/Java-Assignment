import java.awt.*;
import java.awt.event.*;


public class Question_82 extends Frame implements MouseListener{
    PopupMenu popupMenu;
    MenuItem p1,p2,p3,p4,p5; 

    Question_82() {
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        
         popupMenu = new PopupMenu();
          p1 = new MenuItem("Undo");
          p2 = new MenuItem("Cut");
          p3 = new MenuItem("Copy");
          p4 = new MenuItem("Paste");
          p5 = new MenuItem("Delete");
  
          popupMenu.add(p1);
          popupMenu.add(p2);
          popupMenu.add(p3);
          popupMenu.add(p4);
          popupMenu.add(p5);
          add(popupMenu);

        addMouseListener(this);

          

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        popupMenu.show(Question_82.this,e.getX(),e.getY());
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    public static void main(String[] args) {
        new Question_82();
    }
    
}
