import java.util.*;
public class Employee_Wage {

    public static final int FULL_TIME = 2;
    public static final int PART_TIME = 1;
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Problems");


        Random rdm = new Random();           //rdm is veriable to store random number
        int present = rdm.nextInt(2);
        //Check if employee is present
        int WagePerHr = 20;
        int dailyWage, workingHrs;

        switch (present){
            case FULL_TIME :
                workingHrs = 8;
                System.out.println("Employee Working Fullday");
                break;
            case PART_TIME:
                workingHrs =4;
                System.out.println("Employee Working Part Time");
                break;
            default:
                workingHrs = 0;
                System.out.println("Employee Absent");
        }
        dailyWage = workingHrs * WagePerHr;
        System.out.println("Daily wage is " + dailyWage);
    }
}
