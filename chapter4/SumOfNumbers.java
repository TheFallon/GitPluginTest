package chapter4;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * This program asks the user for an integer value
 * greater than 0, and than sums all of the integers
 * between 1, and the numbered entered by the user.
 */

public class SumOfNumbers 
{
    public static void main(String[] args)
    {
        int number;             // Loop control variable.
        int maxValue;           // A number entered by the user.
        int endValue = 0;       // Accumulator
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a positive, non-negative, value "); 
        System.out.println("and I will add all the integers below it " + 
                           " and greater than zero.");
        maxValue = keyboard.nextInt();
        
        if (maxValue < 1)
        {
            System.out.println("The value must be greater " +
                               "than zero.");
            System.exit(0);
        }
         
         for (number = 0; number <= maxValue; number++)
         {
             endValue += number;
         }
         
         System.out.println(endValue);
        
    }
    
}
