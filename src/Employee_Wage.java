import java.util.*;
public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Problems");

        Random rdm = new Random();           //rdm is veriable to store random number
        int present = rdm.nextInt(2);
        //Check if employee is present
        int WagePerHr = 20;
        int dailyWage, workingHrs;
        if (present == 0) {
            //Employee is absent
            workingHrs = 0;
            System.out.println("Employee is absent");
        } else if (present == 1) {
            //Employee working as part-time
            workingHrs = 8;
            System.out.println("Employee working as part-time");
        } else {
            //Employee working as full time
            workingHrs = 16;
            System.out.println("Employee working as full time");
        }
        dailyWage = workingHrs * WagePerHr;
        System.out.println("Daily wage is " + dailyWage);

    }
}
