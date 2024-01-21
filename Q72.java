import java.awt.event.*;
import java.awt.*;

 public class Q72 implements ActionListener
{
    Question_72 obj;

    Q72(Question_72 obj)
    {
        this.obj=obj;
    }
    public void actionPerformed(ActionEvent e)
    {
      String s=e.getActionCommand();
      if(s.equals("Delete1"))
      {
        obj.t1.setText("");
    }
      if(s.equals("Display2"))
       {
        obj.t1.setText("");
        obj.t2.setText("Rutuja");
         obj.t3.setText("Mca");
         obj.t4.setText("");
        }
         if(s.equals("Display3"))
       {
        obj.t1.setText("Welcome");
        obj.t2.setText("");
        obj.t3.setText("");
        obj.t4.setText("1st sem");
        }
         if(s.equals("Display"))
       {
        obj.t1.setText("Welcome");
        obj.t2.setText("Rutuja");
        obj.t3.setText("Mca");
        obj.t4.setText("1st sem");
        }
        
        if(s.equals("Add"))
        {
        
        obj.t2.setText("Sonali");
        }
        if(s.equals("Delete"))
        {
         obj.t1.setText("");
        obj.t2.setText("");
        obj.t3.setText("");
        obj.t4.setText(""); 
        }
       }
    
}
