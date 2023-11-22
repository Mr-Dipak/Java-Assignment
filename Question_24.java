import java.awt.*;
import java.awt.event.*;

public class Question_24 extends Frame {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextField t1;
    int size = 12;
    int fontStyle = Font.PLAIN;
     int red = 0, green = 0, blue = 0;
  

    Question_24(){

        setSize(400,300);
        setVisible(true);
        setResizable(false);
        setLayout(null);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        // defining buttons

        b1 = new Button("Bold");
        b2 = new Button("Iatlic");
        b3 = new Button("B&I");
        b4 = new Button("Plain");
        b5 = new Button("++");
        b6 = new Button("--");
        b7 = new Button("Red");
        b8 = new Button("Green");
        b9 = new Button("Blue");

        b1.setBounds(50, 150, 100, 30);
        b2.setBounds(170, 150, 100, 30);
        b3.setBounds(280, 150, 100, 30);
        b4.setBounds(50, 200, 100, 30);
        b5.setBounds(170, 200, 100, 30);
        b6.setBounds(280, 200, 100, 30);
        b7.setBounds(50, 250, 100, 30);
        b8.setBounds(170, 250, 100, 30);
        b9.setBounds(280, 250, 100, 30);

        // creating a object of OuterClass

        OuterClass obj = new OuterClass(this);

        b1.addActionListener(obj);
        b2.addActionListener(obj);
        b3.addActionListener(obj);
        b4.addActionListener(obj);
        b5.addActionListener(obj);
        b6.addActionListener(obj);
        b7.addActionListener(obj);
        b8.addActionListener(obj);
        b9.addActionListener(obj);

        //  defining Textfield

        t1 = new TextField();

        t1.setBounds(150, 50, 150, 50);


        // adding component on Frame

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        
        add(t1);

      


    }

     

     


    public static void main(String args[]){
        new Question_24();
    }
    
}


class OuterClass implements ActionListener{

    Question_24 obj;

    OuterClass(Question_24 obj){

        this.obj = obj;

    }

     public void actionPerformed(ActionEvent e){

        Button getBTS = (Button) e.getSource();

        if(getBTS == obj.b1 ){

        

            obj.fontStyle = Font.BOLD;
            updateFontAndColor();

        }

        if(getBTS == obj.b2 ){

            obj.fontStyle = Font.ITALIC;
            updateFontAndColor();



        }
        if(getBTS == obj.b3 ){

            obj.fontStyle = Font.BOLD | Font.ITALIC;
            updateFontAndColor();



          

        }
        if(getBTS == obj.b4 ){

        

           

            obj.size = 12; obj.fontStyle = Font.PLAIN;
            obj.red = 0; obj.green = 0; obj.blue = 0;
           
            updateFontAndColor();
           

          

        }
        if(getBTS == obj.b5 ){

            obj.size = obj.size + 2;

        updateFontAndColor();
           

          


        }
        if(getBTS == obj.b6 ){

            obj.size = obj.size - 2;

        updateFontAndColor();
           

          

        }

        if(getBTS == obj.b7 ){

            obj.red = 255;
            obj.green = 00;
            obj.blue = 00;
            
            updateFontAndColor();
             
           

          

        }
       else if (getBTS == obj.b8 ){

            obj.red = 00;
            obj. green = 255;
            obj.blue = 00;
            
            updateFontAndColor();
             
           

          

        }
       else if(getBTS == obj.b9 ){

            obj.red = 00;
            obj.green = 00;
            obj.blue = 255;
            
            updateFontAndColor();
             
           

          

        }


    
       
      }

        public void updateFontAndColor(){
            Font f = new Font("Dialog",obj.fontStyle,obj.size);
            obj.t1.setFont(f);
            Color textColor = new Color(obj.red, obj.green,obj.blue);
            obj.t1.setForeground(textColor);

        }




}