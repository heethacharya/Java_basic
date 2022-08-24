package training;

public class Constructor_learn {// Constructor is special kind method which initialies object
int emplpyeeId;
String emplyeeName;

    public Constructor_learn(int EID, String ENAME){
        //System.out.println("This is default constructor");
        emplpyeeId = EID;
        emplyeeName = ENAME;
        //System.out.println();

    }


    public void pintValueAndName(){
        System.out.println(emplpyeeId+"   "+ emplyeeName);
    }





    public static void main(String args[])throws Exception{
       Constructor_learn ojb = new Constructor_learn(1, "Hetal");

        Constructor_learn ojb1 = new Constructor_learn(2, "Chintu");
        ojb.pintValueAndName();
        ojb1.pintValueAndName();

        Parameteraization_Constructor newFullAddress= new Parameteraization_Constructor("Kandivali Mumbai 400001");
        newFullAddress.printTheAddress();
        newFullAddress.printTheRollnumber(501);

        Default_Constructor Default= new Default_Constructor();



    }
}
