import java.awt.*;
import java.awt.event.*;

public class Question_22 extends Frame {

    Button b1, b2;
    TextField t1;

    Question_22(){

        setSize(400,300);
        setVisible(true);
        setResizable(false);
        setLayout(null);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        // defining buttons

        b1 = new Button("Disply");
        b2 = new Button("Hide");

        b1.setBounds(50, 100, 100, 30);
        b2.setBounds(250, 100, 100, 30);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                operation(e);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operation(e);
            }
        });

        //  defining Textfield

        t1 = new TextField();

        t1.setBounds(150, 50, 100, 30);


        // adding component on Frame

        add(b1);
        add(b2);
        
        add(t1);

      


    }

      public void operation(ActionEvent e){

        Button getBTS = (Button) e.getSource();

        if(getBTS == b1 ){

            t1.setText(" Hello User ! ");
        }

        else if(getBTS == b2){

            t1.setText(" ");
        }

      }



    public static void main(String args[]){
        new Question_22();
    }
    
}
