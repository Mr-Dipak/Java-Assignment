public class Question_41 {

    void starIteration(){

        int asciiCharCodes [] = {65,66,67,68};

        // ?char Ch = (char) asciiCharCodes;

        for (int asciiCharCode:asciiCharCodes){
            char ch = (char)asciiCharCode;
             for (int i = 'A';i<='D';i++){
                System.out.print((char)i + " ");
            
        }
        System.out.println();

        }
        
    }

    public static void main(String args[]){
        new Question_41().starIteration();
    }
    
}
