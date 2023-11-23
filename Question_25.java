import java.awt.*;
import java.awt.event.*;

public class Question_25 extends Frame {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextField t1;
    int size = 12;
    int fontStyle = Font.PLAIN;
     int red = 0, green = 0, blue = 0;

     
  

    Question_25(){

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



 

        b1.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operation(e);

            }
        });

        b2.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operation(e);

            }
        });
        
        b3.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operation(e);

                int font = Font.BOLD;

            }
        });

        b4.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operation(e);

            }
        });

        b5.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operation(e);

            }
        });

        b6.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operation(e);

            }
        });

        b7.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operation(e);

            }
        });

        b8.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                operation(e);

            }
        });

        b9.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){

                operation(e);

            }
        });


      

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

    public void operation(ActionEvent e){

        Button getBTS = (Button) e.getSource();

        if(getBTS == b1 ){

        

            fontStyle = Font.BOLD;
            updateFontAndColor();

        }

        if(getBTS == b2 ){

            fontStyle = Font.ITALIC;
            updateFontAndColor();



        }
        if(getBTS == b3 ){

            fontStyle = Font.BOLD | Font.ITALIC;
            updateFontAndColor();



          

        }
        if(getBTS == b4 ){

        

           

            size = 12; fontStyle = Font.PLAIN;
            red = 0; green = 0; blue = 0;
           
            updateFontAndColor();
           

          

        }
        if(getBTS == b5 ){

            size = size + 2;

        updateFontAndColor();
           

          


        }
        if(getBTS == b6 ){

            size = size - 2;

        updateFontAndColor();
           

          

        }

        if(getBTS == b7 ){

            red = 255;
            green = 00;
            blue = 00;
            
            updateFontAndColor();
             
           

          

        }
       else if (getBTS == b8 ){

            red = 00;
            green = 255;
            blue = 00;
            
            updateFontAndColor();
             
           

          

        }
       else if(getBTS == b9 ){

            red = 00;
            green = 00;
            blue = 255;
            
            updateFontAndColor();
             
           

          

        }



       
      }

       public void updateFontAndColor(){
            Font f = new Font("Dialog",fontStyle,size);
            t1.setFont(f);
            Color textColor = new Color(red, green,blue);
            t1.setForeground(textColor);

        }

     

     


    public static void main(String args[]){
        new Question_25();
    }
    
}
