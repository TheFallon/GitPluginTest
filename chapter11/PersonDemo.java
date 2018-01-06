package chapter11;

import java.util.Scanner;

/**
 * 
 * @author david-urijah
 * 
 * This program demonstrates the Person class.
 */

public class PersonDemo 
{
	public static void main(String[] args)
	{
		String name;			// The customers name.
		String address;			// The customer's address.
		String phone;			// The customer's phone number.
		int mailingList;		// Flag for the mailing list.
		int idNumber;			// The customer's ID number.
		
		// Create a Scanner object for keyboard input.
		Scanner sc = new Scanner(System.in);
		
		// Get the customer's name.
		System.out.println("What is the customers name?");
		name = sc.nextLine();
		
		// Get the customer's address.
		System.out.println("What is the customer's address?");
		address = sc.nextLine();
		
		// Get the customer's phone number.
		System.out.println("What is the customer's phone number?");
		phone = sc.nextLine();
		
		// Create a customer object passing name, 
		// address, and phone as arguments.
		Customer cust = new Customer(name, address, phone);
		
		// Get the customer's desire to be on the mailing list.
		System.out.println("Does the customer wish to be on the mailing list?" +
				   "\nPress 1 for yes, or 2 for no.");
		mailingList = sc.nextInt();
		
		if (mailingList == 1)
		{
			cust.setMailList(true);
		}
		else if (mailingList == 2)
		{
			cust.setMailList(false);
		}
		else
		{
			System.out.println("That was not a valid entry.");
		}
		
		// Get the customers id number.
		System.out.println("What is the customer's ID number");
		idNumber = sc.nextInt();
		cust.setIDnumber(idNumber);
		
		// Display the customer's information.
		System.out.println("Customer Deatils: " + 
						   "\nID Number: " + cust.getIDnumber() +
						   "\nName: " + cust.getFullName() + 
						   "\nAddress: " + cust.getAddress() + 
						   "\nPhone Number " + cust.getPhone());
		if (cust.getMailList())
		{
			System.out.println("The customer wishes to be on the mailing list");
		}
		else
		{
			System.out.println("The customer does NOT wish to be on the mailing list.");
		}
		
	}

}
