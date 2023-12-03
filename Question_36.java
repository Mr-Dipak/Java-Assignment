import java.awt.*;

import java.applet.Applet;

public class Question_36 extends Applet {

    Panel north, east, south, west, center;
    Checkbox ch1, ch2,ch3,ch4,ch5,ch6;
    Label l1, l2, l3, l4, l5, l6;
    Button b1;

    TextArea tA;

    public void init() {

        setLayout(new BorderLayout());

        north = new Panel();
        north.setLayout(new GridBagLayout());
        north.setPreferredSize(new Dimension(1000, 200));
        north.setBackground(Color.pink);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;

        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 1;
        gbc1.gridy = 1;
        gbc1.gridheight = 1;
        gbc1.gridwidth = 1;

        GridBagConstraints gbcl1 = new GridBagConstraints();
        gbcl1.gridx = 0;
        gbcl1.gridy = 0;
        gbcl1.gridheight = 1;
        gbcl1.gridwidth = 1;

        GridBagConstraints gbcl2 = new GridBagConstraints();
        gbcl2.gridx = 0;
        gbcl2.gridy = 1;
        gbcl2.gridheight = 1;
        gbcl2.gridwidth = 1;

        ch1 = new Checkbox();
        ch1.setFont(new Font("Arial",Font.PLAIN,18));
        north.add(ch1, gbc);

        ch2 = new Checkbox();
        north.add(ch2, gbc1);

        l1 = new Label("Table 1");
        l1.setFont(new Font("Arial",Font.PLAIN,18));
        north.add(l1, gbcl1);

        l2 = new Label("Table 2");
        l2.setFont(new Font("Arial",Font.PLAIN,18));
        north.add(l2, gbcl2);

        // end of north Panel

        east = new Panel();
        east.setBackground(Color.pink);
        east.setLayout(new GridBagLayout());
        east.setPreferredSize(new Dimension(200, 100));

        GridBagConstraints gbcc3 = new GridBagConstraints();
        gbcc3.gridx=0;
        gbcc3.gridy=0;


        GridBagConstraints gbcc4 = new GridBagConstraints();
        gbcc4.gridx=0;
        gbcc4.gridy=1;

        GridBagConstraints gbcl3 = new GridBagConstraints();
        gbcl3.gridx = 1;
        gbcl3.gridy = 0;
        
       

        GridBagConstraints gbcl4 = new GridBagConstraints();
        gbcl4.gridx = 1;
        gbcl4.gridy = 1;


       
       
        ch3 = new Checkbox();
        ch4 = new Checkbox();

        l3 = new Label("Tea");
        l3.setFont(new Font("Arial",Font.PLAIN,18));

        l4 = new Label("Coffee");
        l4.setFont(new Font("Arial",Font.PLAIN,18));

        east.add(l3,gbcl3);
        east.add(l4,gbcl4);
        east.add(ch3,gbcc3);
        east.add(ch4,gbcc4);

        // end of east Panel

        south = new Panel();
        south.setBackground(Color.pink);
        south.setLayout(new GridBagLayout());
        south.setPreferredSize(new Dimension(100, 200));

        b1 = new Button("Place Order");
        b1.setFont(new Font("Arial",Font.PLAIN,18));
        south.add(b1);

        // end of south Panel

        west = new Panel();
        west.setBackground(Color.pink);
        west.setLayout(new GridBagLayout());
        west.setPreferredSize(new Dimension(200, 100));

        GridBagConstraints gbcc5 = new GridBagConstraints();
        gbcc5.gridx=1;
        gbcc5.gridy=0;


        GridBagConstraints gbcc6 = new GridBagConstraints();
        gbcc6.gridx=1;
        gbcc6.gridy=1;

        GridBagConstraints gbcl5 = new GridBagConstraints();
        gbcl5.gridx = 0;
        gbcl5.gridy = 0;
        
       

        GridBagConstraints gbcl6 = new GridBagConstraints();
        gbcl6.gridx = 0;
        gbcl6.gridy = 1;

        ch5 = new Checkbox();
        ch6 = new Checkbox();

        l5 = new Label("N1");
        l5.setFont(new Font("Arial",Font.PLAIN,18));
        l6 = new Label("N2");
        l6.setFont(new Font("Arial",Font.PLAIN,18));

        west.add(l5,gbcl5);
        west.add(l6,gbcl6);
        west.add(ch5,gbcc5);
        west.add(ch6,gbcc6);


        // end of west Panel

        center = new Panel();
        center.setLayout(new GridBagLayout());
        center.setPreferredSize(new Dimension(600, 600));

        GridBagConstraints gbcT = new GridBagConstraints();
        gbcT.gridx = 0;
        gbcT.gridy= 0;
        gbcT.gridwidth = 1;
        gbcT.gridheight = 1;
        gbcT.fill = GridBagConstraints.BOTH;
        gbcT.weightx = 1.0;
        gbcT.weighty = 1.0;
        
        tA = new TextArea();
        center.add(tA,gbcT);  // Add the TextArea to the center panel

        // end of center Panel

        add(north, BorderLayout.NORTH);
        add(east, BorderLayout.EAST);
        add(south, BorderLayout.SOUTH);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);

    }
}


/*
 <applet code="Question_36.class" width="1000" height="1000">
 </applet>
 */


