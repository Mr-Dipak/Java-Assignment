

import java.util.Scanner;
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
        int even[] = new int[size];
        int odd [] = new int[size];
        int evenCount = 0;
        int oddCount = 0;
      
        for(int i = 0; i<arr.length;i++){
        int result = ( arr[i] % 2 == 0 ) ? (even[evenCount++]=arr[i]) :(odd[oddCount++]= arr [i]) ;
        }
        System.out.print("Even Number: ");
        for(int i = 0; i<evenCount;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();

        System.out.print("Odd Number: ");
        for(int i = 0; i<oddCount;i++){
            System.out.print(odd[i]+" ");
        }
        
     



    }

    public static void main(String args[]){
        new Question_29().evenAndOddFind();
    }
    
}
