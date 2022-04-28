import java.util.*;
public class Employee_Wage {

    public static final int FULL_TIME = 2;
    public static final int PART_TIME = 1;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int WAGE_PER_HR = 20;
    public static final int MAX_WORKING_HRS = 100;
    public void Compute_Wage(String Companyname, int WagePerHR, int MAX_WORKING_Days, int MAX_WORKING_HRs){

        System.out.println("Details of " + Companyname + " employee");
        System.out.println("Wage per hour:" + WagePerHR);
        System.out.println("Maximum working days:" + MAX_WORKING_Days);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRs);


        Random rdm = new Random();           //rdm is veriable to store random number
        //Check if employee is present
        int totalWage = 0;
        int dailyWage;
        int workingHrs = 0;
        int day = 1, totalWorkingHrs = 0;

        for (day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
            int present = rdm.nextInt(3);

            switch (present) {
                case FULL_TIME:
                    workingHrs = 8;
                    System.out.println("Employee Working Fullday");
                    break;
                case PART_TIME:
                    workingHrs = 4;
                    System.out.println("Employee Working Part Time");
                    break;
                default:
                    workingHrs = 0;
                    System.out.println("Employee Absent");
                    break;
            }

            dailyWage = workingHrs * WAGE_PER_HR;
            System.out.println("Day " + day + " workingHrs is " + workingHrs + " wage is: " + dailyWage);
            totalWage += dailyWage;
        }
        System.out.println("Total wage for a month is " + totalWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Problems");
        Employee_Wage Emp_Wage = new Employee_Wage();
        Emp_Wage.Compute_Wage("Amazon",20,20,100);
        Emp_Wage.Compute_Wage("FlipKart",20,15,200);

    }
}
