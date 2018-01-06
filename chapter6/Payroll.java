package chapter6;


/**
 *
 * @author david_urijah
 * 
 * This class stores data about an employee.
 */
public class Payroll 
{
    private String empName;         // The employee's name.
    private int idNumber;           // The employee's ID number.
    private double payRate;         // The hourly pay rate.
    private double hoursWorked;     // The number of hours worked.
    
    /**
     * Constructor
     * @param name The employee's name
     * @param id The employee's id number
     */
    
    public Payroll(String name, int id)
    {
        empName = name;
        idNumber = id;
    }
    
    /**
     * The setName method sets the employee's name
     * @param name The employee's name
     */
    
    public void setName(String name)
    {
        empName = name;
    }
    
    /**
     * The set Id method sets the employees ID number
     * @param id The employee's ID number
     */
    
    public void setId(int id)
    {
        idNumber = id;
    }
    
    /**
     * The setPayrate method sets the employees pay rate
     * @param pay The employee's hourly pay rate.
     */
    
    public void setPayrate(double pay)
    {
        payRate = pay;
    }
    
    /**
     *  The setHours method sets the hours worked by the employee
     * @param hours The hours worked by the employee
     */
    
    public void setHours(double hours)
    {
        hoursWorked = hours;
    }
    
    /**
     * The getName method returns the employee's name.
     * @return The employee's name.
     */
    
    public String getName()
    {
        return empName;
    }
    
    /**
     * The getiD method returns the employee's ID number
     * @return The employee's ID number.
     */
    
    public int getId()
    {
        return idNumber;
    }
    
    /**
     *  The getPay method returns the employee's hourly rate of pay
     * @return  The employee's hourly pay rate.
     */
    
    public double getPay()
    {
        return payRate;
    }
    
    /**
     *  The getHours method returns the hours worked by the employee
     * @return The hours worked by the employee
     */
    
    public double getHours()
    {
        return hoursWorked;
    }
    
    /**
     * The getGrossPay method returns the employee's gross pay
     * @return The employee's gross pay.
     */
    
    public double getGrossPay()
    {
        return payRate * hoursWorked;
    }
}
