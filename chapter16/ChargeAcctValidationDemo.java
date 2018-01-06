package chapter16;

import java.util.Scanner;

/**
 *
 * @author david-urijah
 */

public class ChargeAcctValidationDemo 
{
    public static void main(String[] args)
    {
        int[] accounts = {5658845, 4520125, 7895122, 8777541,
                          8451277, 1302850, 8080152, 4562555, 
                          5552012, 5050552, 7825877, 1250255,
                          1005231, 6545231, 38522085, 7576651, 
                          7881200, 4581002 };
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an account number "
                                  + "to search for: ");
        int number = sc.nextInt();
        
        if (ChargeAcctValidation.search(accounts, number))
        {
            System.out.println("The account number you "
                                   + "entered was valid");
        }
        else
        {
            System.out.println("That account number you "
                             + "entered was NOT valid.");
        }
    }
    
}
