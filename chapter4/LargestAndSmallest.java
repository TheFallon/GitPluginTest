package chapter4;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * This program asks the user for an integer value, and
 * then displays the first and last values entered by the user.
 */

public class LargestAndSmallest 
{
    public static void main(String[] args)
    {
        int number;         // A number entered by the user.
        int firstNumber;    // The first number entered by the user.
        int lastNumber = 0;     // The last number entered by the user.
        
        // Create a Scanner object for user input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get a number from the user
        System.out.println("Enter a number: ");
        number = keyboard.nextInt();
        
        // Set firstNumber equal to number
        firstNumber = number;
        
        // Continue to get input from the user until
        // -99 is entered.
        while (number != -99)
        {
            System.out.println("Enter another number: ");
            number = keyboard.nextInt();
            
            if (number != -99)
            {
                lastNumber = number;
            }
        }
        
        // Display the first and last number entered
        // by the user.
        System.out.println("The fist number you entered was " + 
                            firstNumber);
        System.out.println("The last number you entered was " + 
                            lastNumber);
    }
}
