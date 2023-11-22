/*

ASSIGNMENT QUESTION - 1

Write a program on console to enter a number and prints its table by using CMD

*/

import java.util.Scanner;

class Question_1 {


    // defining a method for table of useer desire input 
    void table(int n){
    for (int i = 1; i<=10;i++){
        System.out.println(n +"X"+i+"="+(n*i));
    }
    }
    

    public static void main(String args[]){

    Question_1 table1 = new Question_1();
    Scanner input = new Scanner(System.in);


    System.out.print("Enter the Desire Number: ");
    int userInput = input.nextInt();

    // having solution by using a table method
    // table(userInput);
        table1.table(userInput);

}

}