package chapter5;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * This program accepts a value from the user, 
 * and then uses the isPrime method to determine
 * if it is prime.
 */

public class IsPrime 
{
    public static void main(String[] args)
    {
        // Craete a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get a number form the user.
        System.out.println("Enter a number.");
        int number = keyboard.nextInt();
        
        // Test to see if the number is prime.
        if (isPrime(number))
        {
            System.out.println("The number is prime.");
        }
        else
        {
            System.out.println("The number is not prime.");
        } 
    }
    
    /**
     * The isPrime method accept a value and then 
     * tests to see it it is prime
     * @param number The number to test
     * @return true if the number is prime,
     *         false otherwise.
     */
    
    public static boolean isPrime(int number)
    {
        if (number % 2 == 0)
        {
            return false;
        }
        else if (number == 1)
        {
            return false;
        }
        else if (number == 0)
        {
            return false;
        }
        
        for  (int i = 3; i * i <= number; i += 2)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
}
