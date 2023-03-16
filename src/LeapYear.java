
public class LeapYear {


    static void leapYear(int year){

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not leap year");
    }
}
