import java.awt.*;

import javax.swing.border.Border;

public class Question_35 extends Frame {

    Button b1,b2;

    Question_35(){

        setVisible(true);
        setResizable(false);
        setSize(400,400);
        setLayout(new BorderLayout());

        add(new Button("North"),BorderLayout.NORTH);
        add(new Button("East"), BorderLayout.EAST);
        add(new Button("South"),BorderLayout.SOUTH);
        add(new Button("West"),BorderLayout.WEST);
        add(new Button("Center"),BorderLayout.CENTER);

        
    }

    public static void main(String args[]){
        new Question_35();
    }

    
}
