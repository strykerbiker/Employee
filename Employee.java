/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if (age >= 16) { 
            return ("You can drive");
        }
            else{
            return ("You must wait () years to drive");
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        Get value for unpaidHours and HourlyWage
        set taxes to 30%
        set hoursWorked to hoursInDay-unpaidHours 
        set total salary to hoursWorkedxhourlyWage
        set net pay to total salary-(total salary/taxes)
        print net pay
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        Get values for unpaidHours, hourlyWage and fullname 
        set taxes to 30%
        set hoursWorked to hoursInDay-unpaidHours
        set total salary to hoursWorkedxhourlyWage
        set net pay to total salary-(total salary/taxes)
        print ("fullname is going to be paied "net pay""
        set unpaidHours to 0
    }
}