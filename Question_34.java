import java.awt.*;
public class Question_34 extends Frame {


    Question_34(){
        setVisible(true);
        setSize(400,100);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setResizable(false);
        dynamicButtons();
        
    }
    
    void dynamicButtons(){
    Color [] buttonColors = {Color.white,Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.GRAY,Color.RED,Color.ORANGE,Color.MAGENTA,Color.PINK,Color.YELLOW};

    Button [] buttons = new Button[10];

    for(int i = 0; i<10;i++){
        buttons [i] = new Button("Button"+(i+1));
        buttons[i].setBackground(buttonColors[i]);
        add(buttons[i]);
    }

    }

    public static void main(String args[]){
        new Question_34();
    }
}
