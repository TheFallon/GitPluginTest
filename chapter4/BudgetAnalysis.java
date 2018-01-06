package chapter4;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author david_urijah
 * 
 * This program determines if the user is over
 * or under their given budget.
 */

public class BudgetAnalysis 
{
    public static void main(String[] args)
    {
        double budget;               // The user's budget.
        double overUnder;            // An expense of the user.
        double expense;              // The amount of each expense
        double accumExpense = 0;     // The accumulated value of the expenses.
        int index = 1;               // To keep count of the number of expenses
        char nextBill;               //  To hold 'y' or 'Y'
        String input;
        
        // Create a Scanner object to get user input.
        Scanner sc = new Scanner(System.in);
        
        // Get the budget from the user
        System.out.println("What is your total budget?");
        budget = sc.nextDouble();
        
        // Consume the remaining newline.
        sc.nextLine();
        
        // Get the expenses from the user
        do
        {
            // Get the amount of the expense
            System.out.println("Please enter the total for expense #" + index);
            expense = sc.nextDouble();
            
            // Consume the remaining newline
            sc.nextLine();
            
            // Add the expense to the running total
            accumExpense += expense;
            
            // Does the user have another expense?
            System.out.println("Do you have another expense?");
            System.out.println("Enter 'Y' for yes or 'N' for no.");
            input = sc.nextLine();
            nextBill = input.charAt(0);
            index++;
        } while (nextBill == 'y' || nextBill == 'Y');
        
        // Create a DecimalFormat object dor dollar formatting
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Determine if the user is over or under budget, and
        // display the results to the user.
        if (budget > accumExpense)
        {
            overUnder = budget - accumExpense;
            System.out.println("You are under budget by $" + 
                    dollar.format(overUnder));
        }
        else if (accumExpense > budget)
        {
            overUnder = accumExpense - budget;
            System.out.println("You are over budget by $" + 
                    dollar.format(overUnder));
        }
        else
        {
            System.out.println("You expenses are exactly equal to " + 
                    "your budget.");
        }
    }  
}
