package chapter15;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * This program uses recursion to raise a number
 * x, to the power of y.
 */

public class RecursiveMultiplication 
{
    public static void main(String[] args)
    {
        int number;
        int number2;
        int result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer to multiply:");
        number = sc.nextInt();
        
        System.out.println("Enter another integer to multiply:");
        number2 = sc.nextInt();
        number2 = number2 -1;
        
        result = add(number, number2);
        
        System.out.println(number + " multiplied by " +
                (number2 + 1) + " equals " + result);
        
    }
    
    public static int add(int x, int y)
    {
        if (y > 0)
        {
            x = x + add(x, (y - 1));
     
        }
        return x;
    }
    
}
