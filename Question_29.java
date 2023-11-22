
import java.util.*;
public class Question_29 {

    void evenAndOddFind(){


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = Integer.parseInt(input.nextLine());
        int arr [] = new int[size];

        for(int i = 0;i<arr.length;i++ ){
            System.out.printf("Enter Number %d: ",i+1);
            arr [i] = input.nextInt();

        }
      
        for(int i = 0; i<arr.length;i++){
        String  result = ( arr[i] % 2 == 0 ) ? arr[i] + " is even number " : arr [i] +" is a odd number";

        System.out.println(result);
        }

     



    }

    public static void main(String args[]){
        new Question_29().evenAndOddFind();
    }
    
}
