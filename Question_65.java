import java.awt.*;
import java.awt.event.*;
public class Question_65 extends Frame{
    Label label = new Label();
    Question_65(){
        label = new Label();
        label.setBounds(50,50,200,30);
        add(label);
        OutsideClass obj = new OutsideClass(this);
        label.addMouseListener(obj);

        setLayout(null);
        setVisible(true);
        setSize(500,500);
    }
    
}

class OutsideClass extends MouseAdapter{
    Question_65 obj;

    OutsideClass(Question_65 obj){
        this.obj = obj;
    }

    public void mouseClicked(MouseEvent e){
        obj.label.setText("X cordinate is: " + e.getX()+"Y cordinate is: " + e.getY());
    }

}
