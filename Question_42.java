public class Question_42 {

    void starIteration(){

        char asciiCharCodes [] = {65,66,67,68};
        for(int asciiCharCode:asciiCharCodes){
            char ch =(char)asciiCharCode;
            for(int i ='A';i<=ch;i++){
                System.out.print((char)i+" ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        new Question_42().starIteration();
    }
    
}
