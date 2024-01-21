/*

ASSIGNMENT QUESTION - 6

Write a program to find greater among four using function within function

*/


import java.util.Scanner;

public class Question_7 {

    static void getNumber(){
        Scanner input = new Scanner(System.in);
        int [] arr = new int [4];

        for(int i =0; i<arr.length;i++){
        System.out.printf("Enter Number %d: ",i+1);
        arr [i] = input.nextInt();
        }
         
      

        int result = findGreater(arr[0],arr[1],arr[2],arr[3]);

        System.out.println(result+" is a greater number");
    


    }

    static int findGreater(int x, int y, int z,int w){
        int result = 0 ;
   if(x>y){
    result= findGreater1(x,z);
   }

   else if (y>w){
    result = findGreater1(y,z);
   }
   else{
    result = findGreater1(z,w);
    
   }
   return result;
}
    
    
    static int findGreater1(int x, int y){
        if (x>y) {
            return x;
            
        }
        else{
            return y;
        }
    }

    public static void main(String args[]){


    getNumber();


    }


    
}
