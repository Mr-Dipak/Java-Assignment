import java.awt.*;
import java.awt.event.*;

public class Question_87 extends Frame {
    Label name, listl1, listl2;
    TextField userInput;
    List list1, list2;
    Button addButton, movelist1, movelist2, moveMulti1, movemulti2, moveall1, moveall2, remove1, remove2, removeall1,
            removeall2;

    Question_87() {
        setLayout(null);
        setSize(800, 600);
        setVisible(true);

        // name label
        name = new Label("Name");
        name.setBounds(50, 50, 50, 30);
        add(name);

        // textfiled - userInput
        userInput = new TextField();
        userInput.setBounds(120, 50, 100, 30);
        add(userInput);

        // list 1
        list1 = new List();
        list1.setMultipleMode(true);
        list1.setBounds(50, 100, 170, 230);
        add(list1);

        // label list 1
        listl1 = new Label("List 1");
        listl1.setBounds(50, 300, 170, 30);
        add(listl1);

        // list 2
        list2 = new List();
        list2.setMultipleMode(true);
        list2.setBounds(500, 100, 170, 230);
        add(list2);

        // label list 2
        listl2 = new Label("List 2");
        listl2.setBounds(500, 300, 170, 30);
        add(listl2);

        // buttons
        addButton = new Button("Add");
        addButton.setBounds(250, 50, 50, 30);
        add(addButton);

        movelist1 = new Button(">");
        movelist2 = new Button("<");
        movelist1.setBounds(250, 100, 50, 30);
        movelist2.setBounds(400, 100, 50, 30);
        add(movelist1);
        add(movelist2);

        moveMulti1 = new Button(">>");
        movemulti2 = new Button("<<");
        moveMulti1.setBounds(250, 150, 50, 30);
        movemulti2.setBounds(400, 150, 50, 30);
        add(moveMulti1);
        add(movemulti2);

        moveall1 = new Button(">>>");
        moveall2 = new Button("<<<");
        moveall1.setBounds(250, 200, 50, 30);
        moveall2.setBounds(400, 200, 50, 30);
        add(moveall1);
        add(moveall2);

        remove1 = new Button("Remove");
        remove2 = new Button("Remove");
        remove1.setBounds(250, 250, 50, 30);
        remove2.setBounds(400, 250, 50, 30);
        add(remove1);
        add(remove2);

        removeall1 = new Button("Remove all 1");
        removeall2 = new Button("Remove all 2");
        removeall1.setBounds(250, 300, 100, 30);
        removeall2.setBounds(350, 300, 100, 30);
        add(removeall1);
        add(removeall2);

        // Add action listeners to the buttons
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String item = userInput.getText();
                if (!item.isEmpty()) {
                    list1.add(item);
                    userInput.setText("");
                }
            }
        });

        movelist1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = list1.getSelectedItem();
                if (selectedItem != null) {
                    list1.remove(selectedItem);
                    list2.add(selectedItem);
                }
            }
        });

        movelist2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = list2.getSelectedItem();
                if (selectedItem != null) {
                    list2.remove(selectedItem);
                    list1.add(selectedItem);
                }
            }
        });

        moveMulti1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] selectedItems = list1.getSelectedItems();
                for (String item : selectedItems) {
                    list1.remove(item);
                    list2.add(item);
                }
            }
        });

        movemulti2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] selectedItems = list2.getSelectedItems();
                for (String item : selectedItems) {
                    list2.remove(item);
                    list1.add(item);
                }
            }
        });

        moveall1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] items = list1.getItems();
                for (String item : items) {
                    list1.remove(item);
                    list2.add(item);
                }
            }
        });

        moveall2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] items = list2.getItems();
                for (String item : items) {
                    list2.remove(item);
                    list1.add(item);
                }
            }
        });

        remove1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = list1.getSelectedItem();
                if (selectedItem != null) {
                    list1.remove(selectedItem);
                }
            }
        });

        remove2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = list2.getSelectedItem();
                if (selectedItem != null) {
                    list2.remove(selectedItem);
                }
            }
        });

        removeall1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                list1.removeAll();
            }
        });

        removeall2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                list2.removeAll();
            }
        });
    }

    public static void main(String[] args) {
        new Question_87();
    }
}
