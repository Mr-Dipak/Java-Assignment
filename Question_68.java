import java.awt.*;
import java.awt.event.*;

class Question_68 extends Frame implements ActionListener
{
    TextField t1 ,t2,t3;
    Button b1;
    Label l1,l2,l3;

    Question_68()
    {
        setLayout(null);
        setSize(300,300);
        setTitle("Display");
        setVisible(true);
        l1=new Label("Name:-");
        l1.setBounds(10,50,60,30);
        l2=new Label("Course:-");
        l2.setBounds(10,100,60,30);
        l3=new Label("Semester:-");
        l3.setBounds(10,150,60,30);
        t1=new TextField();
        t1.setBounds(75,50,100,30);
        t2=new TextField();
        t2.setBounds(75,100,150,30);
        t3=new TextField();
        t3.setBounds(75,150,150,30);
        b1=new Button("Display");
        b1.setBounds(100,200,100,30);
        b1.addActionListener(this);
       add(t1);
       add(t2);
       add(t3);
       add(l1);
       add(l2);
       add(l3);
       add(b1);
       
    }
    public void actionPerformed(ActionEvent e)
    {
        Button bn=(Button)e.getSource();
        if(bn==b1)
        {
            t1.setText("Dipak");
            t2.setText("Mca");
            t3.setText("1st sem");
        }
    }

    public static void main(String x[])
    {
        Question_68 Di=new Question_68();
    }
}