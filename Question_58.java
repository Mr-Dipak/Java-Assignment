import java.awt.*;
import java.awt.event.*;

public class Question_58 extends Frame {
    TextArea textArea;

    Question_58(){
        TextField textField = new TextField();
        textField.setBounds(50,50,200,30);
        add(textField);
        textField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data = textField.getText();
                textArea.append(data+"\n");
                textField.setText(null);

            }
        });

        textArea = new TextArea();
        textArea.setBounds(50,100,200,200);
        add(textArea);

        setLayout(null);
        setSize(300,400);
        setVisible(true);
        setTitle("Question_58");

    }

    public static void main(String[] args) {
        new Question_58();
    }
    
}
