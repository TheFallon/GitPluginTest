package chapter5;

import java.util.Scanner;       // Needed for the Scanner class.

/**
 *
 * @author david_urijah
 * 
 * This program has a method that receives a String
 * and an integer from the main method. The accepting
 * method then displays the character at the position
 * indicated by the integer that was passed.
 */

public class showCharAt 
{
    public static void main(String[] args)
    {
        String input;           // To hold user input.
        int number;             // To hold user input.
        
        // Create a Scanner object to hold user input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get a City name form the user.
        System.out.println("Enter the name of a city.");
        input = keyboard.nextLine();
        
        // Get an integer from the user.
        System.out.println("Enter a number, less than ot equal " );
        System.out.println("the number of spaces and letters in ");
        System.out.println("the name of the city");
        number = keyboard.nextInt();
        
        // Calibrate the number variable.
        number = number - 1;
        
        // Pass the values in 'input' and 'number'
        // to the showCharAt method.
        showCharAt(input, number);
    }
    
    /**
     * The showCharAt method displays the character at a position
     * selected by the user.
     * @param city A city entered by the user.
     * @param position The position selected by the user.
     */
    
    public static void showCharAt(String city, int position)
    {
        char letter;        // A char variable.
        
        // Get the character at the position passed 
        // from the main method.
        letter = city.charAt(position);
        
        // Print the character.
        System.out.println(letter);
    }
}
