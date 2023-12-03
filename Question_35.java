import java.awt.*;

import java.applet.Applet;

public class Question_35 extends Applet {

    Button north, east,south,west,center;


    public void init(){

        setLayout(new BorderLayout());

        north = new Button("North");
        north.setPreferredSize(new Dimension(1000,200));
        

        east = new Button("East");
        east.setPreferredSize(new Dimension(200,100));

        south = new Button("South");
        south.setPreferredSize(new Dimension(100,200));

        west = new Button("West");
        west.setPreferredSize(new Dimension(200,100));

        center = new Button("Center");
        

        add(north,BorderLayout.NORTH);
        add(east, BorderLayout.EAST);
        add(south,BorderLayout.SOUTH);
        add(west,BorderLayout.WEST);
        add(center,BorderLayout.CENTER);

    }
    
}

/*
 <applet code="Question_35.class" width="1000" height="1000">
 </applet>
 */


