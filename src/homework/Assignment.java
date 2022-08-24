package homework;

public class Assignment {

    public static void main(String args[])throws Exception{
       StringAddress();
       SumOfFloatNumber(25.23, -09.85,30.80,28.09);
       SliptString();
        SliptWithSpace();
    }


// Assignment no. 1 - String address = “123 park street lane , Delhi, India 712334”
//Find length of the String address?
  public static void StringAddress(){
        String Address = "123 park street lane , Delhi, India 712334";
      System.out.println(Address.length());

  }

  //Assignment no. 2 Create a method to add 4 float numbers , all numbers should be passed through Parameter
  public static void SumOfFloatNumber(double f1, double f2, double f3, double f4){
        double f5 = f1 + f2 + f3 + f4;
      System.out.println(f5);
  }

  public static void SliptString(){

        String slpitString = "Welcome to Java";
        String[] newString = slpitString.split("\\s+");
        for(int i=0; i<newString.length; i++){
            System.out.println(newString[i]);

        }



  }

    public static void SliptWithSpace(){

        String WithSpace= "WelcomeToJavaToComputerToLaptop";
        String[] newSapce= WithSpace.split("To");
        System.out.println(newSapce[0]+" "+"To"+" "+newSapce[1]+" "+newSapce[2]+" "+newSapce[3]);
     String a = WithSpace.substring(0,7);// subsrtring is (index,lenght)
     String b = WithSpace.substring(7,9);
        System.out.println(a+" "+b);

    }







}


