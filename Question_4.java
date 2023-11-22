/*

ASSIGNMENT QUESTION - 4

Write a program to enter three number on console and print greater among them.

*/

import java.util.Scanner;
public class Question_4 {


    static int greaternumber(int a, int b){

        if (a>b){
            return a;
        }
        else{
            return b;
        }

    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Plase Enter The First number for cheking a greater number: ");
        int x = input.nextInt();
        
        System.out.print("Plase Enter The Second number for cheking a greater number: ");
        int y = input.nextInt();
        
        System.out.print("Plase Enter The Third number for cheking a greater number: ");
        int z = input.nextInt();

        int result;
        if (x>y){
           
       
         result = greaternumber(x,z);

    
        }


        else{

           result = greaternumber(y,z);
        }

          
       System.out.println(result + " is greater number");
        
       
    }
}
