/*

ASSIGNMENT QUESTION - 5

Write a program to enter Five names on console and print it.

*/

import java.util.Scanner;

public class Question_5 {



static void nameArray( ){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the size of the array");
    int size = Integer.parseInt(input.nextLine());

    String []arr = new String[size];
    

    for (int i = 0; i<arr.length;i++){

        System.out.print("Enter Name"+ (i+1)+":");
        arr [0] = input.nextLine();


    }

     for (int i = 0; i<arr.length;i++){

        System.out.println(arr[0].toUpperCase());


    }


}


public static void main (String args[]){
  
   

    nameArray();
 


   


}
    
}
