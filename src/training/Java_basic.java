package training;
import homework.*;// This is example of Importing another package and all multiple classes inside the package




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
        System.out.println(Home1.addWithThreeParam("The addition is",10,20,"30"));// Here we are passing value for variable and it is example of Type Casting
      Java_loop loop = new Java_loop();
      loop.ifElseLearning();
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
//Below Method is example of Method overloading where method name is same as above but the parameter is different
    public void add(int a,int b,int c){
        String name_add = "Hetal"; // This is string type method level variable
        int sum = a+b;

        System.out.println(sum);

    }
}
