package chapter15;

import java.util.Scanner;

/**
 *
 * @author david-urijah
 * 
 * his program uses recursion to raise a number
 * x, to the power of y.
 */

public class RecursivePowerMethod
{
    public static void main(String[] args)
    {
        int number;
        int exponent;
        int result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer to multiply:");
        number = sc.nextInt();
        
        System.out.println("Enter an exponent:");
        exponent = sc.nextInt();
        exponent = exponent -1;
        
        result = multiply(number, exponent);
        
        System.out.println(number + " raised to the power of " +
                (exponent + 1) + " equals " + result);
        
    }
    
    public static int multiply(int x, int y)
    {
        if (y > 0)
        {
            x = x * multiply(x, (y - 1));
     
        }
        return x;
    }
    
}
