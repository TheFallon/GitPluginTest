package chapter11;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * 
 * @author david-urijah
 *
 * This program demonstrates the PreferredCustomer
 * class.
 */

public class PreferredCustomerDemo 
{
	public static void main(String[] args)
	{
		String name;
		String address;
		String phone;
		int idNumber;
		int mailList;
		double purchases;
		double totalPurchase;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the customer's name?");
		name = sc.nextLine();
		System.out.println("What is the customer's address?");
		address = sc. nextLine();
		System.out.println("What is the customer's phone number?");
		phone = sc.nextLine();
		System.out.println("What is the customer's ID number?");
		idNumber = sc.nextInt();
		System.out.println("Does the customer wish to be on the mailing list?");
		System.out.println("Press 1 for yes, or 2 for no.");
		mailList = sc.nextInt();
		System.out.println("What is the amount of the customer's purchases?");
		purchases = sc.nextDouble();
		
		PreferredCustomer pc = new PreferredCustomer(name, address, phone);
		
		pc.setIDnumber(idNumber);
		pc.setPurchases(purchases);
		pc.setDiscount(purchases);
		
		if (mailList == 1)
		{
			pc.setMailList(true);
		}
		else if (mailList == 2)
		{
			pc.setMailList(false);
		}
		else
		{
			System.out.println("That was not a valid input"
								+ " for the mailing list");
		}
		
		totalPurchase = pc.getPurchases() * (1 + pc.getDiscount());
		
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		System.out.println("Preferred Customer Details: " + 
						   "\nName: " + pc.getFullName() + 
						   "\nID number: " + pc.getIDnumber() +
						   "\nAddress: " + pc.getAddress() +
						   "\nPhone Number: " + pc.getPhone() + 
						   "\nPurchase: $" + dollar.format(pc.getPurchases()) + 
						   "\nDiscount Percentage: " + dollar.format((pc.getDiscount() * 100)) + "% " +
						   "\nDiscount: $" + 
						   dollar.format((pc.getPurchases() * pc.getDiscount())) +
						   "\nTotal After Discount: $" + 
						   dollar.format((pc.getPurchases() - (pc.getPurchases() * pc.getDiscount()))));
		if (pc.getMailList())
		{
			System.out.println("The customer wishes to be"
							 + " on the mailing list.");
		}
		else
		{
			System.out.println("The customer does NOT wish "
							 + "to be on the mailing list");
		}
		
	
		
		
	}

}
