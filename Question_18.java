import java.awt.*;
import java.awt.event.*;



class OuterClass implements ActionListener{

    Question_18 obj;

    OuterClass(Question_18 obj){
        this.obj = obj;
    }


    public void actionPerformed(ActionEvent e) {
    
        Button getButton = (Button) e.getSource();

        int n1 = Integer.parseInt(obj.t1.getText());
        int n2 = Integer.parseInt(obj.t2.getText());
        int product = 0;

        if(getButton == obj.b1){

            product = n1 + n2;

        }

        if (getButton ==obj.b2){
            product = n1 - n2;
        }

        if (getButton == obj.b3){
            product = n1 * n2;
        }

        if (getButton == obj.b4){
            product = n1 / n2;
        }

        if (getButton == obj.b5){
            product = n1%n2;
        }

        obj.t3.setText(String.valueOf(product));

    }

}


public class Question_18 extends Frame {

    Label l1,l2,l3;
    TextField t1, t2,t3;
    Button b1,b2,b3,b4,b5;


    Question_18 (){

        setSize(400,400);
        setVisible(true);
        setResizable(false);
        setLayout(null);
     
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);

            }
        });


        // defining Labels

        l1 = new Label("Enter First No: ");
        l2 = new Label("Enter Second No: ");
        l3 = new Label("Result: ");

        l1.setBounds(20,40,100,30);
        l2.setBounds(20,80,100,30);
        l3.setBounds(20,160,80,30);
        
        
        // defining TextField
        
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        
        
        t1.setBounds(140,40,100,30);
        t2.setBounds(140,80,100,30);
        t3.setBounds(140,160,100,30);
        
        // defining Buttons 
        
        b1 = new Button("Add");
        b2 = new Button("Subtract");
        b3 = new Button("Multiply");
        b4 = new Button("Divide");
        b5 = new Button("Modulus");
        
        b1.setBounds(20,120,50,30);
        b2.setBounds(80,120,50,30);
        b3.setBounds(140,120,50,30);
        b4.setBounds(200,120,50,30);
        b5.setBounds(260,120,50,30);

        OuterClass obj = new OuterClass(this);
        b1.addActionListener(obj);
        b2.addActionListener(obj);
        b3.addActionListener(obj);
        b4.addActionListener(obj);
        b5.addActionListener(obj);

        // adding components on frame

        add(l1);
        add(l2);
        add(l3);

        add(t1);
        add(t2);
        add(t3);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);


    }


        
       

    public static void main(String args[]){
        new Question_18();
    }    
}
