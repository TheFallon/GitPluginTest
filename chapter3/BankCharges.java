package chapter3;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author david_urijah
 * This program determines the fees associated
 * with a checking account.
 */

public class BankCharges 
{
    public static void main(String[] args)
    {
        final double baseFee = 10.00;    // The base fee for an account
        double checkFee;                 // The fee for writing a single check
        double totalCheckFee;            // Total fees for checks.
        double totalFees;                // The total fee.
        int numChecks;                   // The number of checks written.
        
        // Create a Scanner object fort user input.
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for the number of
        // checks written
        System.out.println("How many checks did you write " + 
                            "this month?");
        numChecks = sc.nextInt();
        
        // Determine the total charges for the user
        if (numChecks < 20)
        {
            checkFee = .10;
            totalCheckFee = checkFee * numChecks;
            totalFees = totalCheckFee + baseFee;
        }
        else if (numChecks >= 20 && numChecks < 40)
        {
            checkFee = .08;
            totalCheckFee = checkFee * numChecks;
            totalFees = totalCheckFee + baseFee;
        }
        else if (numChecks >= 40 && numChecks < 60)
        {
            checkFee = .06;
            totalCheckFee = checkFee * numChecks;
            totalFees = totalCheckFee + baseFee;
        }
        else
        {
            checkFee = .04;
            totalCheckFee = checkFee * numChecks;
            totalFees = totalCheckFee + baseFee;
        }
        
        // Create a DecimalFormat object
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        System.out.println("Your total charges for the month "
                + "are $" + dollar.format(totalFees));
    }
}
