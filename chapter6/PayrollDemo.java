package chapter6;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author david_urijah
 * 
 * This program demonstrates the Payroll
 * class
 */

public class PayrollDemo
{
    public static void main(String[] args)
    {
        String empName;         // To hold the employee's name.
        int idNumber;           // To hold the employee's ID number.
        double hours;
        double payRate;
        
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Get the employye name and id number
        // from the user.
        System.out.println("What is the employee's name?");
        empName = sc.nextLine();
        System.out.println("What is the employee's ID number?");
        idNumber = sc.nextInt();
        
        // Create a Payroll object, passing ID number
        // and empName as arguments.
        Payroll employee = new Payroll(empName, idNumber);
        
        // Set the hours worked and payrate for the empoloyee.
        System.out.println("How many hours did the employee work?");
        hours = sc.nextDouble();
        System.out.println("What is the employee's hourly pay rate?");
        payRate = sc.nextDouble();
        employee.setHours(hours);
        employee.setPayrate(payRate);
        
        // Create a DecimalFormat object.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Display the emplyee's information,
        // including the grossPay.
        System.out.println();
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID number: " + employee.getId());
        System.out.println("Hourly pay rate: $" 
                            + dollar.format(employee.getPay()));
        System.out.println("Hours worked: " + employee.getHours());
        System.out.println("Gross pay: $" 
                            + dollar.format(employee.getGrossPay()));
        
        
        
    }
    
}
