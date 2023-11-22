
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Question_13 extends Frame implements ActionListener {



TextField textField;
TextField resultTextField;
Button grButton;
 Label l1; Label l2;
 

    Question_13(){

       

        setSize(400,200);
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setTitle("Table Generator");



         l1 = new Label("Enter Number: ");
        l1.setBounds(80, 40, 100, 30);
        add(l1);


        l2 = new Label("Table: ");
        l2.setBounds(80, 80, 100, 30);
        add(l2);


        textField = new TextField(10);
        textField.setBounds(190 ,40,150,30);
        add(textField);

        resultTextField = new TextField();
        resultTextField.setBounds(190,80,150,30);
        add(resultTextField);
        // resultTextArea.setEnabled(false);
       


        grButton = new Button("Generate Table");
        grButton.setBounds(155, 120, 100, 30);
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
         StringBuilder result = new StringBuilder();

            int product = 0;

            for ( int i= 1; i<=10;i++){
                 product = n *i;
            

            result.append(n +  " X " + i + " = "+ product+", " );
            }
            resultTextField.setText(result.toString());
            
        }

    public static void main(String args []){

        new Question_13();



    }
    
}
