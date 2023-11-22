
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Question_14 extends Frame implements ActionListener {



TextField textField;
TextArea resultTextArea;
Button grButton;
 Label l1; Label l2;
 

    Question_14(){

       

        setSize(400,400);
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setTitle("Table Generator");



         l1 = new Label("Enter Number: ");
        l1.setBounds(110, 40, 100, 20);
        add(l1);


        // l2 = new Label("Enter Number");
        // l2.setBounds(300, 40, 30, 20);
        // add(l2);


        textField = new TextField(10);
        textField.setBounds(210 ,40,60,20);
        add(textField);

        resultTextArea = new TextArea(10,30);
        resultTextArea.setBounds(100,80,200,250);
        add(resultTextArea);
        // resultTextArea.setEnabled(false);
       


        grButton = new Button("Generate Table");
        grButton.setBounds(155, 350, 100, 20);
        add(grButton);
        grButton.addActionListener(this);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                // dispose();
                System.exit(0);
            }
        }
        );


    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Generate Table")){
            generateTable();
        }

        

    }

     void generateTable(){

         
         int n = Integer.parseInt(textField.getText());
         StringBuilder result = new StringBuilder("Table for "+n+":\n");

            int product = 0;

            for ( int i= 1; i<=10;i++){
                 product = n *i;
            

            result.append(n +  " X " + i + " = "+ product+"\n" );
            }
            resultTextArea.setText(result.toString());
            
        }

    public static void main(String args []){

        new Question_14();



    }
    
}
