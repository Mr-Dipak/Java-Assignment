public class Question_45 {

    int ID;
    String Name;
    double percentage;

    Question_45(int ID, String Name, double percentage){ 

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

        Question_45 student = new Question_45(0, null, 0);
       

        // setting value using set method
        student.setID(1);
        student.setName("Dipak");
        student.setPercentage(65);


        // getting value using get method
        System.out.println("ID: "+student.getID());
        System.out.println("Name: "+student.getName());
        System.out.println("Percentage: "+student.getPercentage());



    }

}
