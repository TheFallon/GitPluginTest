package chapter9;

/**
 *
 * @author david_urijah
 */

public class BankAccount 
{
    private double balance;     // Account balance
    
    /**
     * This constructor sets the starting balance
     * at 0.0
     */
    
    public BankAccount()
    {
        balance = 0.0;
    }
    
    /**
     * This constructor sets the starting balance
     * to the value passed as an argument.
     * @param startBalance The starting balance.
     */
    
    public BankAccount(double startBalance)
    {
        balance = startBalance;
    }
    
    /**
     * This constructor sets the starting balance
     * to the value in the String argument.
     * @param str The starting balance, as a String
     */
    
    public BankAccount(String str)
    {
      balance = Double.parseDouble(str);
    }
    
    /**
     * This copy constructor creates a copy 
     * the object being passed to it.
     * @param object2 The object being passed
     *  to the copy constructor.
     */
    
    public BankAccount(BankAccount object2)
    {
        balance = object2.balance;
    }
    
    /**
     *  The deposit method makes a deposit 
     *  into the account
     * @param amount The amount to be deposited.
     */
    
    public void deposit(double amount)
    {
      balance += amount;
    }

   /**
      The deposit method makes a deposit into
      the account.
      @param str The amount to add to the
                 balance field, as a String.
   */

   public void deposit(String str)
   {
      balance += Double.parseDouble(str);
   }

   /**
      The withdraw method withdraws an amount
      from the account.
      @param amount The amount to subtract from
                    the balance field.
   */

   public void withdraw(double amount)
   {
      balance -= amount;
   }

   /**
      The withdraw method withdraws an amount
      from the account.
      @param str The amount to subtract from
                 the balance field, as a String.
   */

   public void withdraw(String str)
   {
      balance -= Double.parseDouble(str);
   }

   /**
      The setBalance method sets the account balance.
      @param b The value to store in the balance field.
   */

   public void setBalance(double b)
   {
      balance = b;
   }

   /**
      The setBalance method sets the account balance.
      @param str The value, as a String, to store in
                 the balance field.
   */

   public void setBalance(String str)
   {
      balance = Double.parseDouble(str);
   }
   
   /**
      The getBalance method returns the
      account balance.
      @return The value in the balance field.
   */

   public double getBalance()
   {
      return balance;
   }
}
