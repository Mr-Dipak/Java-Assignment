import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;
public class Question_88  extends Frame{

    Question_88(){
        setLayout(null);
        setVisible(true);
        setSize(200,200);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);

            }
        });
    }
    public static void main(String[] args) {
        new Question_88();
    }
    
}
