
public class Question_28 {

    void evenAndOddFind(){

        int arr [] = {1,2,3,4,5,6,7,8,9,10};
      
        for(int i = 0; i<arr.length;i++){
        String  result = ( arr[i] % 2 == 0 ) ? arr[i] + " is even number " : arr [i] +" is a odd number";

        System.out.println(result);
        }

     



    }

    public static void main(String args[]){
        new Question_28().evenAndOddFind();
    }
    
}
