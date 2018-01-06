package chapter4;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * This program displays a square constructed from
 * the letter 'X'; it's size is determined by input
 * entered by the user.
 */

public class SquareDisplay
{
    public static void main(String[] args)
    {
        int userInput;          // To hold user input
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get a number form the user.
        System.out.println("Enter a value less than 15");
        userInput = keyboard.nextInt();
        
        // Verify that the number entered by the user
        // is between 1-15.
        if (userInput > 0 && userInput <= 15)
        {
       
             for (int index = 1; index <= userInput; index++)
             {
                 System.out.println(" ");
            
                 for (int i = 1; i <= userInput; i++)
                 {
                      System.out.print('X');
                 }
             }
        }
        else
        {
            System.out.println("Please enter a number between");
            System.out.println("1 and 15.");
            
        }
    }
    
}
