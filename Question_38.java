public class Question_38 {

    void starIteration(){
        for (int i = 0; i<5;i++){
             for (int j = 0; j<i;j++){
                System.out.print("*");
            
        }
        System.out.println();

        }
    }

    public static void main(String args[]){
        new Question_38().starIteration();
    }
    
}
