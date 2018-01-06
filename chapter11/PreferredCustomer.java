package chapter11;

/**
 *
 * @author david_urijah
 * 
 * The PreferredCustomer class extends 
 * the Customer class.
 */

public class PreferredCustomer extends Customer
{
	private double purchases;		// The customer's purchases.
	private double discount;		// The amount of the customer's discount.
	
	/**
	 * Constructor
	 * @param name The customer's name.
	 * @param address The customer's address.
	 * @param phone The customer's phone number.
	 */
	
    public PreferredCustomer(String name, String address, 
    						 String phone)
    {
    	super(name, address, phone);
    }
    
    /**
     * The setPurchases method set's the amount 
     * of the customer's purchases.
     * @param amount The amount of the customer's
     * 		  purchase.
     */
    
    public void setPurchases(double amount)
    {
    	purchases = amount;
    }
    
    /**
     * The setDiscount method accepts a double
     * representing the amount of the customer's 
     * purchases, and uses it to calculate and set
     * the discount amount.
     * @param amount The amount of the user's purchases
     */
    
    public void setDiscount(double amount)
    {
    	if (amount < 500)
    	{
    		discount = .00;
    	}
    	else if (amount >= 500 && amount < 1000)
    	{
    		discount = .05;
    	}
    	else if (amount >= 1000 && amount < 1500)
    	{
    		discount = .06;
    	}
    	else if (amount >= 1500 && amount < 2000)
    	{
    		discount = .07;
    	}
    	else
    	{
    		discount = .10;
    	}
    }
    
    /**
     * The getPurchases method returns the amount
     * purchased by the customer.
     * @return The amount purchased by the user.
     */
    
    public double getPurchases()
    {
    	return purchases;
    }
    
    /**
     * The getDiscount method returns the discount
     * level of the customer.
     * @return The discount for the customer.
     */
    
    public double getDiscount()
    {
    	return discount;
    }
}
