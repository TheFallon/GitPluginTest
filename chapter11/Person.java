package chapter11;

/**
 * 
 * @author david-urijah
 *
 * This class stores information about a person.
 */

public class Person 
{
	private String fullName;		// The person's name.
	private String address;		// The person's address.
	private String phone;		// The person's phone number.
	
	/**
	 * Constructor
	 * @param name The person's name.
	 * @param addy The persons's address.
	 * @param number The person's phone number.
	 */
	
	public Person(String name, String addy,
				  String number)
	{
		fullName = name;
		address = addy;
		phone = number;
	}
	
	/**
	 *  The setFullName method sets the persons
	 *  name.
	 * @param name The person's full name.
	 */
	
	public void setFullName(String name)
	{
		fullName = name;
	}
	
	/**
	 * The setAddress method sets the address
	 * of the person
	 * @param addy The person's address
	 */
	
	public void setAddress(String addy)
	{
		address = addy;
	}
	
	/**
	 * The setPhone method sets the person's
	 * phone number.
	 * @param number The person's phone number.
	 */
	
	public void setPhone(String number)
	{
		phone = number;
	}
	
	/**
	 * The getFullName method returns the full name
	 * of the person.
	 * @return The person's full name.
	 */

	public String getFullName()
	{
		return fullName;
	}
	
	/**
	 * The getAddress method returns the address 
	 * of the address
	 * @return The person's address
	 */
	
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * The getPhone method returns the phone
	 * number of the person
	 * @return The person's phone number.
	 */
	
	public String getPhone()
	{
		return phone;
	}
}
