/*

ASSIGNMENT QUESTION - 2

Write a Program to enter a number and print it's square and cube using CMD.

*/

import java.util.Scanner;

public class Question_2 {

   static void squareAndCube(int num){

        int square = num * num;
        int cube = num * num * num;

        System.out.printf("The Square of %d is %d and cube is %d ",num,square,cube);
        
    }

public static void main(String args[]){

    Scanner input = new Scanner(System.in);


    System.out.print("Enter the desire number for output of square and cube of the number: ");
    int userInput = input.nextInt();



    Question_2 obj = new Question_2();
    obj.squareAndCube(userInput);



}

}
