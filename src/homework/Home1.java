package homework;

public class Home1 {

    String language = "Java";

    public String stringConcat(String lan){
     String myCompleteString = "Welcome to"+" "+lan;
     return myCompleteString;

    }

    public String name(String data){ //Here we are declaring variable type and variable name

        return data+" "+language;
    }

    //Example of Type casting
    public String addWithThreeParam(String data,int a,int b,String d){ //Here we are declaring variable type and variable name

        int p = 10;
        int c = a + b+Integer.parseInt(d);
        return data+" "+c;

    }






}
