
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Question_54 {
    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);

        try{
            FileOutputStream output = new FileOutputStream("demoOutput.text");
            System.out.println("Please Enter Text");
            String data = input.nextLine();
            byte b[] = data.getBytes();
            output.write(b);
            output.close();
            System.out.println("success");

        }
        
        catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
