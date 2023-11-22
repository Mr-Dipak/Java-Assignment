/*

ASSIGNMENT QUESTION - 8

Write a program to find greater among five using function within function

*/


import java.util.Scanner;

public class Question_8 {

    static void getNumber(){
        Scanner input = new Scanner(System.in);
        int [] arr = new int [5];

        for(int i =0; i<arr.length;i++){
        System.out.printf("Enter Number %d: ",i+1);
        arr [i] = input.nextInt();
        }
        int  x,y,z,w,v;
        x= arr [0];
        y= arr[1];
        z= arr[2];
        w = arr[3];
        v = arr[4];

        int result = findGreater(x,y,z,w,v);

        System.out.println(result+" is a greater number");
    


    }

    static int findGreater(int x, int y, int z,int w,int v){
        int result = 0 ;
        int result1 = 0;
        
        if(x>y){
            result = findGreater1(x,z);
        }
        else{
            result = findGreater1(y,z);
        }

        result1  = findGreater1(w, v);
        
        
        return findGreater1(result1, result);
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

    

