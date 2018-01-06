package chapter6;

/**
 *
 * @author david_urijah
 * 
 * The SavingsAccount class stores data about
 * a user's savings account.
 */

public class SavingsAccount
{
    private double interestRate;        // Annual interest rate.
    private double startingBalance;     // The starting balance.
    
    /**
     * Constructor
     * @param balance The account balance. 
     */
    
    public SavingsAccount(double balance)
    {
        startingBalance = balance;
    }
    
    /**
     * The setInterest method sets the annual interest
     * rate of the account
     * @param rate The accounts annual interest rate.
     */
    
    public void setInterest(double rate)
    {
        interestRate = rate;
    }
    
    /**
     * The set balance method sets the balance of the account
     * @param balance The account balance
     */
    
    public void setBalance(double balance)
    {
        startingBalance = balance;
    }
    
    /**
     * The getInterest method returns the annual interest
     * rate of the account
     * @return The annual interest rate from the account
     */
    
    public double getInterest()
    {
        return interestRate;
    }
    
    /**
     * The getBalance method returns the balance of
     * the account
     * @return The balance of the account
     */
    
    public double getBalance()
    {
        return startingBalance;
    }
    
    /**
     * The deposit method accepts a double argument
     * and deducts that amount from the account
     * @param amount The amount to deduct from the account
     */
    
    public void deposit(double amount)
    {
        startingBalance += amount;
    }
    
    /**
     * The deposit method accepts a String argument
     * and deducts that amount from the account balance
     * @param str The amount to deduct from the account.
     */
    
    public void deposit(String str)
    {
        startingBalance += Double.parseDouble(str);
    }
    
    /**
     * The withdraw method accepts a double argument
     * and deducts that amount from the account balance
     * @param amount The amount to deduct form the balance.
     */
    
    public void withdraw(double amount)
    {
        startingBalance -= amount;
    }
    
    /**
     * The withdraw method accepts a String argument
     * and deducts an amount from the account balance.
     * @param str The amount to withdraw from the account
     */
    
    public void withdraw(String str)
    {
        startingBalance -= Double.parseDouble(str);
    }
    
    /**
     * The getEarnedInterest method calculates the amount
     * of interest earned on a savings account
     * @return The amount of earned interest
     */
    
    public double getEarnedInterest()
    {
        return startingBalance * (interestRate / 12);
    }
    
    /**
     *  The getBalancePlusInterest method calculates
     *  the balance of a SavingsAccount object plus 
     * interest
     * @return The balance plus interest.
     */
    
    public double getBalancePlusInterest()
    {
        return startingBalance * (1 + (interestRate / 12));
    }
}
