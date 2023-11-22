

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;



public class Question_16 extends Frame {

    TextField t1, t2;
    Button button;
    Label l1, l2;
    TextArea textArea;


    Question_16(){

        // defining frame

        setSize(400,600);
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setTitle("Q. 16) Table Genenrator");
        addWindowListener(new WindowAdapter(){
            public void windowClosing( WindowEvent e ){

                System.exit(0);
                
            }
        });

        // adding component to frame
        


       


        // defing Lable
            
        l1 = new Label("Enter Number: ");
        l1.setBounds(80, 40, 100, 30);
        
 
 
        l2 = new Label("Table: ");
        l2.setBounds(80, 80, 100, 30);
         

        // defining TextFiel
        
         t1 = new TextField(10);
         t1.setBounds(190 ,40,150,30);
       
 
          textArea = new TextArea();
         textArea.setBounds(190,80,200,250);
         add(textArea);

        
        
        // defining buttons 
        button = new Button("Generate Table");
        button.setBounds(155, 350, 100, 30);
        EventHandler obj = new EventHandler(this);
        button.addActionListener(obj);
        add(button);
        add(l1);
        add(l2);
        add(t1);
        
    }

    public static void main(String[] args) {
        new Question_16();
    }
}

class EventHandler implements ActionListener {

    Question_16 obj;

    EventHandler(Question_16 obj){
        this.obj = obj;
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Generate Table")){

           generateTable();
            
        }

    

    }

        void generateTable(){


             int n = Integer.parseInt(obj.t1.getText());
             StringBuilder result = new StringBuilder("Table for "+n+":\n");

            int product = 0;

              for ( int i= 1; i<=10;i++){
                 product = n *i;
            

            result.append(n +  " X " + i + " = "+ product+"\n" );
            }
            obj.textArea.setText(result.toString());
        }
      
}




