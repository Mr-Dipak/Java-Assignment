import java.awt.*;
import java.awt.event.*;

public class Question_73 extends Frame 
  {
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Button b1,b2,b3,b4,b5,b6;
    Question_73()
    {
        setLayout(null);
        setSize(600,600);
        setVisible(true);
        l1 =new Label("Text:-");
        l1.setBounds(10,30,60,30);
        l2 =new Label("Name:-");
        l2.setBounds(10,70,60,30);
        l3 =new Label("Course:-");
        l3.setBounds(10,110,60,30);
        l4 =new Label("Sem:-");
        l4.setBounds(10,150,60,30);
        t1=new TextField();
        t1.setBounds(75,30,150,30);
        t2=new TextField();
        t2.setBounds(75,70,150,30);
        t3=new TextField();
        t3.setBounds(75,110,150,30);
        t4=new TextField();
        t4.setBounds(75,150,150,40);
        b1=new Button("Delete1");
        b1.setBounds(240,40,60,30);
        b2=new Button("Display2");
        b2.setBounds(240,90,60,30);
         b3=new Button("Display3");
        b3.setBounds(240,140,60,30);
         b4=new Button("Display");
        b4.setBounds(30,200,60,30);
         b5=new Button("Add");
        b5.setBounds(115,200,60,30);
         b6=new Button("Delete");
        b6.setBounds(200,200,60,30);
         
        b1.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e)
    {
      String s=e.getActionCommand();
      if(s.equals("Delete1"))
      {
        t1.setText("");
    }
} });
 b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
    {
      String s=e.getActionCommand();
      if(s.equals("Display2"))
       {
        t1.setText("");
        t2.setText("Sonali");
         t3.setText("Mca");
         t4.setText("");
        }
    } });
     b3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
      String s=e.getActionCommand();
         if(s.equals("Display3"))
       {
        t1.setText("Welcome");
        t2.setText("");
        t3.setText("");
        t4.setText("1st sem");
        }
    }});
    b4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
      String s=e.getActionCommand();
         if(s.equals("Display"))
       {
        t1.setText("Welcome");
        t2.setText("Sonali");
        t3.setText("Mca");
        t4.setText("1st sem");
        }
    }});
     b5.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
      String s=e.getActionCommand();
        
        if(s.equals("Add"))
        {
        
        t2.setText("Rutuja");
        }
    } });
    b6.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
      String s=e.getActionCommand();
        if(s.equals("Delete"))
        {
         t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText(""); 
        }

    }  });
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);   
    }
   
    
    public static void main(String x[])
    {
        new Question_73();

    }
  }