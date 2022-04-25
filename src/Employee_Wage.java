import java.util.*;
public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Problems");

        Random rdm = new Random();           //rdm is veriable to store random number
        int present = rdm.nextInt(2);
        //Check if employee is present
        int WagePerHr =20;
        int wrkHrs = 8;
        int dailyWage = present * WagePerHr * wrkHrs;
        if (present == 1)
            System.out.println("Employee is present."+dailyWage);
        else
            System.out.println("Employee is absent."+dailyWage);
    }
}
