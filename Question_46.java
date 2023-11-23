public class Question_46 {

    int ID;
    String Name;
    double percentage;

    Question_46(int ID, String Name, double percentage){ 

        this.ID = ID;
        this.Name = Name;
        this.percentage = percentage;

    }

    // set Method

    void setID(int ID){
        this.ID = ID;
    }

    void setName(String Name){
        this.Name = Name;
    }

    void setPercentage(double percentage){
        this.percentage =percentage;
    }

    // get Method

    int getID(){

        return ID;

    }

    String getName(){
        return Name;
    }

    double getPercentage(){
        return percentage;
    }

    public static void main(String args[]){

      
        

       Question_46 [] students = new Question_46[5];
      
       for(int i = 0;i<students.length;i++){
        students [i] = new Question_46(i+1,"student "+(i+1),65.0+i);
       }
       
       for(Question_46 student:students){

         System.out.println("ID: "+student.getID());
        System.out.println("Name: "+student.getName());
        System.out.println("Percentage: "+student.getPercentage());

       }
       



    }

}
