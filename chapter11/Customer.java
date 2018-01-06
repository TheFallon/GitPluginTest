package chapter11;

/**
 * 
 * @author david-urijah
 *
 * The customer class extends the person class
 * and stores information about a customer. 
 */

public class Customer extends Person
{
	private int idNumber;		// The customer's idNumber
	private boolean mailList;	// Does the customer want to be on a mailing list.
	
	/**
	 * This constructor sets the customers name,
	 * address, and phone number.
	 * @param name The customer's name.
	 * @param addy The customer's address.
	 * @param phone The customer's phone number.
	 */
	
	public Customer(String name, String addy, String phone)
	{
		super(name, addy, phone);
	}
	
	/**
	 * The setIDnumber sets the customer's ID number
	 * @param id The customer's ID number.
	 */
	
	public void setIDnumber(int id)
	{
		idNumber = id;
	}
	
	/**
	 *  The setMailList sets whether or no the
	 *  customer wants to be on the mailing list.
	 * @param mail Whether or not the customer
	 * wants to be on the mailing list.
	 */
	
	public void setMailList(boolean mail)
	{
		mailList = mail;
	}
	
	/**
	 * The getIDnumber method returns the customer's
	 * ID number
	 * @return The customer's ID number.
	 */
	
	public int getIDnumber()
	{
		return idNumber;
	}
	
	/**
	 * The getMailList method returns true if the
	 * customer want's to be mailed, false otherwise.
	 * @return true if the customer wants to be on the
	 * mailing list, false otherwise.
	 */
	
	public boolean getMailList()
	{
		return mailList;
	}

}
