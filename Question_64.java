import java.awt.*;
import java.awt.event.*;


public class Question_64 extends Frame {
    Label label;
    Question_64(){
        label = new Label();
        label.setBounds(50,50,300,200);
        add(label);
        
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                label.setText("X cordinate is: "+ e.getX()+" Y cordinate is: "+ e.getY());
                
            }

        });
        setLayout(null);
        setVisible(true);
        setSize(500,500);
    }
    public static void main(String[] args) {
        new Question_64();
    }

    
}
