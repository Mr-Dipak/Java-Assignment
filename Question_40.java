public class Question_40 {

    void starIteration(){
        for (int i = 1; i<=5;i++){
             for (int j = 1; j<i;j++){
                System.out.print(j+" ");
            
        }
        System.out.println();

        }
        
    }

    public static void main(String args[]){
        new Question_40().starIteration();
    }
    
}