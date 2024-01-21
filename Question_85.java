import java.awt.*;
import java.awt.event.*;

public class Question_85 extends Frame {
    Panel east, south, west, center;
    CheckboxGroup cbg;
    Checkbox ch1, ch2, ch3, ra1, ra2, ra3;
    List list;
    Label name;
    TextArea result;
    Dialog dialog;
    Button order;
    GridLayout centerl, westl, eastl;

    Question_85() {
        setLayout(new BorderLayout());
        setSize(600, 600);

        // west side
        west = new Panel();
        west.setBackground(Color.yellow);
        west.setPreferredSize(new Dimension(200, 1000));

        name = new Label("Select Name");
        west.add(name);

        list = new List();
        list.add("Dipak");
        list.add("Ganesh");
        list.add("Prakhar");
        west.add(list);

        center = new Panel();
        center.setLayout(centerl = new GridLayout(3, 1));
        centerl.setVgap(20);
        
        ch1 = new Checkbox("wadapav");
        ch2 = new Checkbox("samosa");
        ch3 = new Checkbox("bhaje");

        center.add(ch1);
        center.add(ch2);
        center.add(ch3);

        east = new Panel();
        east.setLayout(new GridLayout(3, 1));

        cbg = new CheckboxGroup();
        ra1 = new Checkbox("Table 1", cbg, false);
        ra2 = new Checkbox("Table 2", cbg, false);
        ra3 = new Checkbox("Table 3", cbg, false);

        east.add(ra1);
        east.add(ra2);
        east.add(ra3);

        south = new Panel();
        order = new Button("Place Order");
        south.add(order);

        // Initialize and configure the dialog
        dialog = new Dialog(this, "Order Details", false);
        result = new TextArea("Order Details will be displayed here");
        dialog.setSize(300, 200);
        dialog.add(result);
        dialog.addWindowListener( new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dialog.setVisible(false);
            }
        });

        // action listener for the "Place Order" button
        order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                String selectedName = list.getSelectedItem();
                StringBuilder selectedFood = new StringBuilder("Food: ");
                
                if (ch1.getState()) selectedFood.append("wadapav, ");
                if (ch2.getState()) selectedFood.append("samosa, ");
                if (ch3.getState()) selectedFood.append("bhaje, ");

              
               

                String selectedTable = cbg.getSelectedCheckbox().getLabel();
                result.setText("Name: " + selectedName + ",\n" + selectedFood + ",\nTable: " + selectedTable);

                // Show the dialog
                dialog.setVisible(true);
            }
        });

        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
        add(east, BorderLayout.EAST);
        add(south, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Question_85();
    }
}
