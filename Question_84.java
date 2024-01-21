import java.awt.*;
import java.awt.event.*;


public class Question_84 extends Frame{
    PopupMenu popupMenu;
    MenuItem p1,p2,p3,p4,p5; 

    Question_84() {
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

        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                popupMenu.show(Question_84.this,e.getX(),e.getY());
            }
        });

          

    }

   

    public static void main(String[] args) {
        new Question_84();
    }
    
}
