import java.awt.*;
import java.awt.event.*;
public class Question_57 extends Frame {

    TextField textField;
    TextArea textArea;
    OutSideClass obj = new OutSideClass(this);

    Question_57(){
        setVisible(true);
        setLayout(null);
        setSize(300,400);
        
        textField = new TextField();
        textField.setBounds(50,50,200,30);
        add(textField);
        textField.addActionListener(obj);

        textArea = new TextArea();
        textArea.setBounds(50,100,200,200);
        add(textArea);
        
    }

    public static void main(String[] args) {
        new Question_57();
    }
    
}

class OutSideClass implements ActionListener{
    Question_57 obj;
    OutSideClass(Question_57 obj){
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent e){
        String data = obj.textField.getText();
        obj.textArea.append(data+"hi\n");
    }

}
