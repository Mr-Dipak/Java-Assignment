import java.awt.*;
import java.awt.event.*;
public class Q69 implements ActionListener
{
      Question_69 obj;
     
      Q69(Question_69 obj)
      {
        this.obj=obj;
      }
      public void actionPerformed(ActionEvent e)
      {
          Button bn=(Button)e.getSource();
          if(obj.b1==obj.b1)
          {
              obj.t1.setText("Rutuja");
              obj.t2.setText("Mca");
              obj.t3.setText("1st sem");
          }
      }
};
