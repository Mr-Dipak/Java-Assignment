import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;

public class Question_80 extends Frame {
    MenuBar mb;
    Label label ;
    Dialog dialog;
    Menu file, edit, format, view, help;
    MenuItem i1, i2, i3, i4, i5, i6, i7, i8,e1,e2,e3,e4,e5,e6,e7,e8,f1,f2,v1,v2,h1,h2,p1,p2,p3,p4,p5;
    OutsideClass80 obj = new OutsideClass80(this);
    PopupMenu popupMenu;
    Question_80() {

         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        setLayout(null);
        setSize(screenWidth, screenHeight);

        Image iconImage = new ImageIcon("icon.jpg").getImage();
        setIconImage(iconImage);

        dialog = new Dialog(this);
        dialog.setSize(200, 100);
        dialog.setVisible(false);
        label = new Label("This is a dialog box");
        dialog.add(label);

        // PopupMenu
        popupMenu = new PopupMenu();
        p1 = new MenuItem("Undo");
        p2 = new MenuItem("Cut");
        p3 = new MenuItem("Copy");
        p4 = new MenuItem("Paste");
        p5 = new MenuItem("Delete");

        popupMenu.add(p1);
        popupMenu.add(p2);
        popupMenu.add(p3);
        popupMenu.add(p4);
        popupMenu.add(p5);
        add(popupMenu);

        addMouseListener(obj);

        
        
        mb = new MenuBar();
        setMenuBar(mb);
        
        //Menu's

        
        file = new Menu("File");
        edit = new Menu("Edit");
        format = new Menu("Format");
        view = new Menu("View");
        help = new Menu("Help");

        Font f = new Font("Arial", Font.PLAIN,14);
        file.setFont(f);
        edit.setFont(f);
        format.setFont(f);
        view.setFont(f);
        help.setFont(f);
        
        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(view);
        mb.add(help);

        //Menu Item's of file menu

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
        
        //Munu Item's of Edit Menu
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


    
     void addActionListenerToMenuItems(Menu menu){
        for(int i=0; i<menu.getItemCount();i++){
            MenuItem menuItem = menu.getItem(i);
            menuItem.addActionListener(obj);
        }
    }




    public static void main(String[] args) {
        new Question_80();
    }

}


class OutsideClass80 implements ActionListener, MouseListener{
    Question_80 obj;
    OutsideClass80(Question_80 obj){
        this.obj = obj;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof MenuItem){
            MenuItem menuItme = (MenuItem) e.getSource();
            obj.label.setText(menuItme.getLabel()+" is Selected");
            obj.dialog.setVisible(true);
        }
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        obj.popupMenu.show(obj,e.getX(),e.getY());
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    
   

}
