package chapter2;

import java.text.DecimalFormat;

/**
 *
 * @author david_urijah
 * 
 * This program displays the users name, age, 
 * and desired annual income
 */
public class NameAgeAnnualIncome 
{
    public static void main(String[] args)
    {
        // Literals to hold value
        String name = "Terrence";       // My name
        int age = 34;                   // My age
        double income = 85000;          // My desired annual income.
        
        // Create a DecimalFormat object to 
        // format dollar input.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Display the output
        System.out.println("My name is " + name + 
                        ", my age is " + age + " and");
        System.out.println("I hope to earn $" + 
                dollar.format(income) + " per year.");
    }
    
}
