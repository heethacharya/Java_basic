package training;

public class Java_Arrya {


    public static void main(String args[])throws Exception{
    learningStringTypeArray();
    learningIntTypeArray();

    }

    public static void learningStringTypeArray() {

        String[] mobile = {"Iphone", "Samsung", "Anroid", "RedMe", "SmartPhone"}; //Array always start with 0 index
        System.out.println(mobile[0]);
        for (int a = 0; a < mobile.length; a++) {
            System.out.println(mobile[a]);
        }

    }
        public static void learningIntTypeArray(){

        int[] employeeId = {10, 20 ,30, 40, 50, 60, 70, 80, 90, 100};

        //int Totalemplyee  = employeeId.length;
                for(int i=0;i<employeeId.length;i++){
                    System.out.println(employeeId[i]);
                }


        }










}
