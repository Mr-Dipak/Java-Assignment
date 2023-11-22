
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Question_12 extends Frame {

    Question_12(){

     
        setSize(400,300);
        setVisible(true);
        setLayout(null);

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }

        } );



        


        TextField t =new TextField();
        TextField t2 =new TextField();


        // Creating a Label 
        Label l1 = new Label("Email Id: ");
        Label l2 = new Label("Password: ");


        // adding a label to frame
        add(l1);
        add(l2);
        l1.setBounds(20,80, 80, 30);
        l2.setBounds(20, 120, 80, 30);

        // adding a textfield to frame
        add(t);
        add(t2);
        t.setBounds(120,80, 80, 30);
        t2.setBounds(120, 120, 80, 30);

        // Buttons
        Button b = new Button("SUBMIT");

        // adding a Button on frame

        add(b);
        b.setBounds(60,160,80,30);


    }

    public static void main(String[] args) {
        new Question_12();
}
}
