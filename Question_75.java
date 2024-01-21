import java.awt.*;

import javax.swing.ImageIcon;

public class Question_75 extends Frame {
    MenuBar mb;
    Menu file, edit, format, view, help;

    Question_75() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        setLayout(null);
        setSize(screenWidth, screenHeight);

        Image iconImage = new ImageIcon("icon.jpg").getImage();
        setIconImage(iconImage);
        mb = new MenuBar();
        setMenuBar(mb);
        
        //Menu's
        
        file = new Menu("File");
        edit = new Menu("Edit");
        format = new Menu("Format");
        view = new Menu("View");
        help = new Menu("Help");

        Font menuFont = new Font("Arial", Font.PLAIN, 14);
        file.setFont(menuFont);
        edit.setFont(menuFont);
        format.setFont(menuFont);
        view.setFont(menuFont);
        help.setFont(menuFont);
        
        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(view);
        mb.add(help);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question_75();
    }

}
