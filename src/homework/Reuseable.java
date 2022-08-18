package homework;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.LocalDate; // import the LocalDate class

//This is parent class for Inheritance class
public class Reuseable {

    public String country = "USA";//

    public void getCurrentDateAndTime(){
        //String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

    }
}
