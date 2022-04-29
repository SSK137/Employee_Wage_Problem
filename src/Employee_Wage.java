import java.util.*;
public class Employee_Wage<Employee_Type> {

    public static final int FULL_TIME = 2;
    public static final int PART_TIME = 1;
    public static int MAX_WORKING_DAYS = 20;
    public static int WAGE_PER_HR = 20;
    public static int MAX_WORKING_HRS = 100;
    public static String Company_Name;
    int TotalWage;

    Employee_Wage(String CompanyName,int WagePerHR,int Max_WorkingDays,int Max_WorkingHrs){

        Company_Name=CompanyName;
        WAGE_PER_HR=WagePerHR;
        MAX_WORKING_DAYS=Max_WorkingDays;
        MAX_WORKING_HRS=Max_WorkingDays;
        TotalWage=0;
    }

    int EmployeeWorkType(){
        return (int) (Math.random()*100) % 3;
    }

    int workingHRS(int Employee_Type){
        return switch (Employee_Type) {
            case FULL_TIME -> 8;
            case PART_TIME -> 4;
            default -> 0;
        };
    }

    public void calculateTotalWage()
    {
        System.out.println("Computation of total wage of " + Company_Name + " employee");
        int workingHrs;
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int Employee_Type = EmployeeWorkType();
            workingHrs= workingHRS(Employee_Type);
            int wage = workingHrs * WAGE_PER_HR;
            TotalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs , workingHrs);
        }

    }

    public String toString()
    {
        System.out.println("Details of " + Company_Name + " employee");
        System.out.println("Wage per hour:" + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage for a month of " + Company_Name + " employee is " + TotalWage + "";
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        /*
        Creating Employee_Wage Class Objects and calling the CalculateTotalWage();
         */
        Employee_Wage amazon = new Employee_Wage("Amazon", 40, 15, 200 );

        //Total Wage Using object amazon
        amazon.calculateTotalWage();
        System.out.println(amazon);

        Employee_Wage zensar = new Employee_Wage("Zensar",20,10,100);
        //Total Wage Using 3rd object zensar
        zensar.calculateTotalWage();
        System.out.println(zensar);


        Employee_Wage IBM = new Employee_Wage("IBM", 20, 20, 100);
        //Total Wage Using 3rd object IBM
        IBM.calculateTotalWage();
        System.out.println(IBM);

    }
}
