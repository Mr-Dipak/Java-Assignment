/*

ASSIGNMENT QUESTION - 2

Write a program to enter two number on console and greater among them.

*/

import java.util.Scanner;

public class Question_3 {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Desire number for output: ");
        int first = input.nextInt();
        System.out.print("Enter the Desire number for output: ");
        int second = input.nextInt();

        if(first>second){
            System.out.printf("%d is greater than %d",first,second);
        }
        else{
            System.out.printf("%d is greater than %d",second,first);
        }
    
}
}