package chapter6;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * This program demonstrates the RetailItem class. 
 */

public class RetailItemDemo 
{
    public static void main(String[] args)
    {
        String description;     // Item 1 description.
        int units;              // Units on hand.
        double price;           // The items price.
        
        // Create a scanner object for keyboard input.
        Scanner sc = new Scanner(System.in);
        
        // Get the information for item 1.
        System.out.println("Enter the description for item 1.");
        description = sc.nextLine();
        System.out.println("Enter the number of unit's on hand for item 1.");
        units = sc.nextInt();
        System.out.println("Enter the price of item 1.");
        price = sc.nextDouble();
        
        // Create an instance of the RetailItem class,
        // passing the data that was entered as arguments
        // to the constructor.
        RetailItem item1 = new RetailItem(description, units, price);
        
        // Consume the remaining newline
        sc.nextLine();
        
        // Get the information for item 2.
        System.out.println("Enter the description for item 2.");
        description = sc.nextLine();
        System.out.println("Enter the number of unit's on hand for item 2.");
        units = sc.nextInt();
        System.out.println("Enter the price of item 2.");
        price = sc.nextDouble();
        
        // Create an instance of the RetailItem class,
        // passing the data that was entered as arguments
        // to the constructor.
        RetailItem item2 = new RetailItem(description, units, price);
        
        // Consume the remaining newline
        sc.nextLine();
        
        // Get the information for item 3.
        System.out.println("Enter the description for item 3.");
        description = sc.nextLine();
        System.out.println("Enter the number of unit's on hand for item 3.");
        units = sc.nextInt();
        System.out.println("Enter the price of item 3.");
        price = sc.nextDouble();
        
        // Create an instance of the RetailItem class,
        // passing the data that was entered as arguments
        // to the constructor.
        RetailItem item3 = new RetailItem(description, units, price);
        
        // Consume the remaining newline
        sc.nextLine();
        
        // Get the data from the tiems and display it.
        System.out.println();
        System.out.println("Here are the three items you entered");
        
        // Item #1.
        System.out.println("Item #1:");
        System.out.println("Description: " + item1.getDescription());
        System.out.println("Units on Hand: " + item1.getUnits());
        System.out.println("Unit Price: $" + item1.getPrice());
        System.out.println();
        
        // Item #2
        System.out.println("Item #2:");
        System.out.println("Description: " + item2.getDescription());
        System.out.println("Units on Hand: " + item2.getUnits());
        System.out.println("Unit Price: $" + item2.getPrice());
        System.out.println();
        
        // Item #3
        System.out.println("Item #3:");
        System.out.println("Description: " + item3.getDescription());
        System.out.println("Units on Hand: " + item3.getUnits());
        System.out.println("Unit Price: $" + item3.getPrice());
        System.out.println();
        
    }
}
