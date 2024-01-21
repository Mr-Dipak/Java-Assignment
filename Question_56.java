import java.awt.*;
import java.awt.event.*;


public class Question_56 extends Frame implements ActionListener {
    TextField textField;
    TextArea textArea;
    Question_56(){

        textField = new TextField();
        textArea = new TextArea();
        textField.setBounds(50,50,200,30);
        textField.addActionListener(this);
        textArea.setBounds(50,100,200,200);
        add(textField);
        add(textArea);

        setLayout(null);
        setSize(300,400);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);

            }
        });


        


    }

    public void actionPerformed(ActionEvent e){
        String data = textField.getText();
        textArea.append(data+"\n");
    }

    public static void main(String[] args) {
        new Question_56();
    }
    
}
