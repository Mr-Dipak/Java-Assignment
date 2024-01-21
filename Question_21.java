import java.awt.*;
import java.awt.event.*;



public class Question_21 extends Frame {

    Button b1, b2;
    TextField t1;

    Question_21(){

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

        b1 = new Button("Display");
        b2 = new Button("Hide");

        b1.setBounds(50, 100, 100, 30);
        b2.setBounds(250, 100, 100, 30);


        // Creating a object of outer class.
       OuterClass2 obj = new OuterClass2(this);

        b1.addActionListener(obj);
        b2.addActionListener(obj);


        //  defining Textfield

        t1 = new TextField();

        t1.setBounds(150, 50, 100, 30);


        // adding component on Frame

        add(b1);
        add(b2);
        
        add(t1);

      


    }

      



    public static void main(String args[]){
        new Question_21();
    }
    
}

class OuterClass2 implements ActionListener{
    Question_21 obj;
    OuterClass2(Question_21 obj){
        this.obj = obj;
    }

    public void actionPerformed(ActionEvent e){

        Button getBTS = (Button) e.getSource();

        if(getBTS == obj.b1 ){

            obj.t1.setText(" Hello User ! ");
        }

        else if(getBTS == obj.b2){

            obj.t1.setText(" ");
        }

      }
}
