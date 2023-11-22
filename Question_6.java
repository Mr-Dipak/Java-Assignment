/*

ASSIGNMENT QUESTION - 6

 Write a program to print greater among three using function within a function

*/
import java.util.Scanner;


public class Question_6 {


static void getNumber(){

Scanner input = new Scanner(System.in);
int [] arr = new int[3];

int j =0;

for(int i = 0; i<arr.length;i++){

System.out.printf("Enter the number %d: ",i+1);
 arr [i]  = input.nextInt();

}

int x = arr [0];
int y = arr[1];
int z = arr[2];

int result = findGreater(x,y,z);
System.out.println(result + " is a greater number");


}





static int findGreater(int x, int y, int z){
    int result = 0;
    if(x>y){
        result = findGreater1(x,z);
    }
    else{
        result = findGreater1(y,z);
    }
    return result;

}


static int findGreater1(int x, int y){
    if(x>y){
        return x;
    }
    else{
        return y;
    }
}





public static void main (String args []){

// findGreater();

getNumber();




}




} 

