import java.awt.*;
import java.awt.event.*;

public class Question_76 extends Frame implements ActionListener {
    MenuBar mb;
    Label label ;
    Dialog dialog;
    Menu file, edit, format, view, help;
    MenuItem i1, i2, i3, i4, i5, i6, i7, e1, e2, e3, e4, e5, f1, f2, v1, v2, h1, h2;

    Question_76() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        setLayout(null);
        setSize(screenWidth, screenHeight);

        
        dialog = new Dialog(this);
        dialog.setSize(200, 100);
        dialog.setVisible(false);
        label = new Label("This is a dialog box");
        dialog.add(label);
        dialog.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        mb = new MenuBar();
        setMenuBar(mb);

        // Initialize menus
        file = new Menu("File");
        edit = new Menu("Edit");
        format = new Menu("Format");
        view = new Menu("View");
        help = new Menu("Help");

        // Add menus to MenuBar
        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(view);
        mb.add(help);

        // Menu Items of file menu
        i1 = new MenuItem("New");
        i2 = new MenuItem("Open..");
        i3 = new MenuItem("Save");
        i4 = new MenuItem("Save As..");
        i5 = new MenuItem("Page SetUp..");
        i6 = new MenuItem("Print..");
        i7 = new MenuItem("Exit");

        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        file.addSeparator();
        file.add(i5);
        file.add(i6);
        file.addSeparator();
        file.add(i7);

        // Menu Items of Edit Menu
        e1 = new MenuItem("Undo");
        e2 = new MenuItem("Cut");
        e3 = new MenuItem("Paste");
        e4 = new MenuItem("Delete");
        e5 = new MenuItem("Select All");

        edit.add(e1);
        edit.addSeparator();
        edit.add(e2);
        edit.add(e3);
        edit.add(e4);
        edit.addSeparator();
        edit.add(e5);

        // MenuItem's of Formate
        f1 = new MenuItem("Word Wrap");
        f2 = new MenuItem("Font...");

        format.add(f1);
        format.add(f2);

        // MenuItem's of View
        v1 = new MenuItem("Zoom");
        v2 = new MenuItem("Status Bar");

        view.add(v1);
        view.add(v2);

        // MenuItem's of Help
        h1 = new MenuItem("View Help");
        h2 = new MenuItem("About Notepad");

        help.add(h1);
        help.add(h2);

        addActionListenerToMenuItems(file);
        addActionListenerToMenuItems(edit);
        addActionListenerToMenuItems(format);
        addActionListenerToMenuItems(view);
        addActionListenerToMenuItems(help);

        setVisible(true);
    }

    void addActionListenerToMenuItems(Menu a) {
        for (int i = 0; i < a.getItemCount(); i++) {
            MenuItem menuItem = a.getItem(i);
            menuItem.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof MenuItem) {
            MenuItem menuItem = (MenuItem) e.getSource();
            label.setText("Selected: " + menuItem.getLabel());
            dialog.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Question_76();
    }
}
