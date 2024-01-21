import java.awt.*;
import java.awt.event.*;

public class Question_86 extends Frame {
    List myList;

    public Question_86() {
        setTitle("List Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());

       
        myList = new List();
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");
        myList.add("Item 4");

        myList.add("Item 5", 2);
        myList.add("Item 6", 0);

      
        myList.select(1);

       
        myList.setMultipleMode(true);

      
        add(myList);

       
        Button printButton = new Button("Print Selected Items");
        Button clearSelectionButton = new Button("Clear Selection");


        add(printButton);
        add(clearSelectionButton);
    

      
        printButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printSelectedItems();
            }
        });

        clearSelectionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearSelection();
            }
        });

 

      
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

     void printSelectedItems() {
        String[] selectedItems = myList.getSelectedItems();
        System.out.print("Selected Items: ");
        for (String item : selectedItems) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

     void clearSelection() {
        myList.deselect(myList.getSelectedIndex());
        System.out.println("Selection cleared");
    }


    public static void main(String[] args) {
        new Question_86();
    }
}
