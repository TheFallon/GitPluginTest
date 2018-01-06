package chapter10;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * This program asks the user for a series of numbers
 * and then gets the sum of all of those numbers.
 */

public class SumOfDigits 
{
    public static void main(String[] args)
    {
        String input;       // To hold user input.
        int total = 0;      // Accumulator variable.
        
        // Create a Scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for a series of numbers
        System.out.println("Enter a series of numbers without spaces.");
        input = sc.nextLine();
        
        // Create an int array using the length field
        // of the input as the index
        int[] numbers = new int[input.length()];
        
        // Convert the String to an int array
        for (int index = 0; index < input.length(); index++)
        {
            numbers[index] = Character.digit(input.charAt(index), 10);
        }
        
        
        // Add the integers of the array using the total
        // variable as an accumulatir
        for (int index = 0; index < numbers.length; index++)
        {
            total += numbers[index];
        }
        
        // Display the sum off all the numbers.
        System.out.println(total);
    }
    
}
