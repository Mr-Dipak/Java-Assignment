import java.awt.*;
import java.awt.event.*;


public class Question_83 extends Frame{
    PopupMenu popupMenu;
    MenuItem p1,p2,p3,p4,p5; 

    Question_83() {
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

          Outside obj = new Outside(this);

        addMouseListener(obj);

        

          

    

  
    }

    public static void main(String[] args) {
        new Question_83();
    }
    
}


class Outside implements MouseListener{
    Question_83 obj;

    Outside(Question_83 obj){
        this.obj = obj;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        obj.popupMenu.show(obj,e.getX(),e.getY());
       
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
}
