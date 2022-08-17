package training;
import homework.Home1;// This is example of Importing another package



public class Java_basic {

    int roll = 5; // This is class level variable
    String newName = "Google";


    public static void main(String args[])throws Exception{
        Java_basic obj = new Java_basic(); // this is creating object of class(it is blueprint of the class)
        Home1 Home1= new Home1(); // This is example of calling class from another package and creating obj of it

        obj.add(10,10);
        System.out.println(obj.roll);


        System.out.println(Home1.stringConcat("Python"));// Here we are passing value for variable
        System.out.println(Home1.name("Welcome to"));// Here we are passing value for variable

    }





// This is the method
    public void add(int a,int b){
        String name_add = "Hetal"; // This is string type method level variable
        int sum = a+b;

        System.out.println(sum);

    }
    public void subtract(){
        String name = "Acharya"; // This is string type method level variable
        int street = 3;

        //System.out.println(name_add);
        System.out.println(newName);

    }
}
