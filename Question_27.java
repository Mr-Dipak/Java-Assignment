public class Question_27 {

    void ternary(){
        int arr [] = new int[100];
        
        for(int i = 0; i<arr.length;i++){
            arr[i]= i+1;

        }

        //  for(int i = 0; i<=arr.length-1;i++){
        //     System.out.print(arr[i]+" ");

        // }

         for(int i = 0; i<=arr.length-1;i++){
            String result = (arr[i]%2==0)? arr[i]+"  is even number": arr[i]+"  is odd number";
            System.out.println(result);

        }

    }
    
    public static void main(String args[]){
        new Question_27().ternary();
    }
}
