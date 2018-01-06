package chapter6;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author david_urijah
 * 
 * This program uses the SavingsAccount
 * class to store and calculate the user's
 * savings account information.
 */

public class SavingsAccountDemo
{
    public static void main(String[] args)
    {
        double balance;              // The starting balance of the user.
        double interestRate;         // The user's annual interest rate.
        double earnedInterest = 0;   // To hold the earned interest
        double withdrawl;            // A withdrawl.
        double totWithdrawls = 0;    // To hold the total number of withdrawls.
        double deposit;              // A deposit
        double totDeposits = 0;      // To hold the total number of deposits.
        int months = 0;              // The number of periods.
        String input;                // To hold user input.
        
        // Get the starting balacne from the user.
        input = JOptionPane.showInputDialog("What is your starting balance?");
        balance = Double.parseDouble(input);
        
        // Get the number of months the user has data for.
        input = JOptionPane.showInputDialog("For how many months do you " + 
                                            "have data?");
        months = Integer.parseInt(input);
        
        // Get the annual interest rate from the user.
        input = JOptionPane.showInputDialog("What is your annual interest " +
                                            "rate");
        interestRate = Double.parseDouble(input);
        
        // Create a SavingsAccount object, passing the
        // starting balance as an argument.
        SavingsAccount account = new SavingsAccount(balance);
        
        // Set the annual interest rate.
        account.setInterest(interestRate / 100);
        
        // Aggregate the deposits, withdrawls, and interest
        // payments for the user.
        for (int index = 1; index <= months; index++)
        {
            // Prompt the user to enter the amount deposited.
            input = JOptionPane.showInputDialog("How much money " + 
                    "did you deposit during month " + index);
            deposit = Double.parseDouble(input);
            
            // Add the deposit to the account object.
            account.deposit(deposit);
            totDeposits += deposit;
            
            // Prompt the user to enter the amount withdrawn
            input = JOptionPane.showInputDialog("How much money " + 
                    "did you withdraw this month?");
            withdrawl = Double.parseDouble(input);
            
            // Substract the withdrawls from the balance
            account.withdraw(withdrawl);
            totWithdrawls += withdrawl;
            
            // Calculate the balance plus interest.
            balance = account.getBalancePlusInterest();
            
            // Accumulate the earned interest.
            earnedInterest += account.getEarnedInterest();
            
            // Reset the starting balance.
            account.setBalance(balance);
        }
        
        // Create a DecimalFormat object.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Display the results to the user.
        JOptionPane.showMessageDialog(null, "Your account totals are as"
                                    + " follows:\n" + 
                                    "Balance: $" + 
                dollar.format(account.getBalance()) +
                                    "\nDeposits: $" + 
                dollar.format(totDeposits) +
                                    "\nWithdrawls: $" + 
                dollar.format(totWithdrawls) +
                                    "\nEarned interest: $" + 
                dollar.format(earnedInterest));
    }   
}
