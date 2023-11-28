/*

ASSIGNMENT QUESTION - 5

Write a program to enter Five names on console and print it.

*/

import java.util.Scanner;

public class Question_5 {



static void nameArray( ){
    Scanner input = new Scanner(System.in);


    String []arr = new String[5];
    

    for (int i = 0; i<arr.length;i++){

        System.out.print("Enter Name"+ (i+1)+":");
        arr [i] = input.nextLine();


    }

     for (int i = 0; i<arr.length;i++){

        System.out.println(arr[i].toUpperCase());


    }


}


public static void main (String args[]){
  
   

    nameArray();
 


   


}
    
}
