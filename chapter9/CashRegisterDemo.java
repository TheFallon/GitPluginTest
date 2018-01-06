package chapter9;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author david_urijah
 * 
 * This program demonstrates the CashRegister class
 */

public class CashRegisterDemo 
{
    public static void main(String[] args)
    {
        int itemsToBuy;         //The number of items to buy.
        
        // Create a ReatilItem, passing the decripstion, price, 
        // and units on hand
        RetailItem item = new RetailItem("Jacket", 500, 25.95);
        
        // Create a Scanner object for keyboard input.
        Scanner sc = new Scanner(System.in);
        
        // Create a decimal format object to format dollar output.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Display the price of the jacket.
        System.out.println("The price of the jacket is $" + 
                        dollar.format(item.getPrice()));
        
        // Ask the user how many Jacket's they wish to purchase.
        System.out.println("How many jackets do you wish to purchase?");
        itemsToBuy = sc.nextInt();
        
        // Create a cash register item, passing the RetailItem
        // and the number of jackets to buy as arguments.
        CashRegister sale = new CashRegister(item, itemsToBuy);
        
        // Display the transaction.
        System.out.println("You have chosen to purchase " 
                            + sale.getNumItem() + " " 
                            + item.getDescription() + 
                            "'s.");
        System.out.println();
        System.out.println("Subtotal: $" + 
                dollar.format(sale.getSubTotal()));
        System.out.println("Tax: $" + dollar.format(sale.getTax()));
        System.out.println("Total: $" + dollar.format(sale.getTotal()));
        
    }
    
}
