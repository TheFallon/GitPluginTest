package chapter15;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * The sumOfNumbers method accepts
 * an integer argument and sums all
 * of the integers between n and 1.
 */

public class SumOfNumbers 
{
    public static void main(String[] args)
    {
        // A number to pass to the sumOfNumbers
        // method
        int number;
        
        // Create a Scanner object.
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number.
        System.out.println("Enter a number greater than zero");
        number = sc.nextInt();
        
        // Print the results
        System.out.println(sumOfNumbers(number));
        
    }
    
    public static int sumOfNumbers(int number)
    {  
        //
        if (number > 0)
        {
             number += sumOfNumbers(number - 1);
        }
       
        return number;
    }
}
