
import java.util.Scanner;

public class Question_26 {

   

    void ternary(){

        Scanner input = new Scanner(System.in);

        int [] arr = new int[3];

    

        for (int i = 0; i<3; i++){
            System.out.printf("Enter Number %d: ",i+1);
            arr [i] = input.nextInt();
         }

         int x, y, z, result;

         x = arr[0];
         y = arr[1];
         z = arr[2];

         System.out.println("You Entered: " + x  + ", " + y + ", " + z);;
        

         result = (x>y) ? ((x>z)? x : z):((y>z)? y : z);
         
         System.out.println(result + " is greater number");

    }

    

    
    public static void main(String args[]){

    new Question_26().ternary();

    }
    
}
