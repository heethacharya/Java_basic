package training;

public class Parameteraization_Constructor {


    int rollNumber;
   String Add = null;
   public Parameteraization_Constructor(String fullAddress){
      this.Add=fullAddress;
   }
    public void printTheAddress(){
        System.out.println(Add);
    }

    public void printTheRollnumber(int rollNumber){
        System.out.println(rollNumber);
    }
}
