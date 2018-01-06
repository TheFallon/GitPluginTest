package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author david_urijah
 */
public class InternetServiceProvider2
{
    public static void main(String[] args)
    {
        double packagePrice;        // The price of the package.
        double hourlyPrice;         // The price of extra hours.
        double totalPrice;          // The total price paid.
        double alternatePrice;      // The price of package B, for a purchasers
        double savings;
        int hours;                  // The number of hours used.
        char internetPackage;       // The package purchased by the user
        String input;               // To hold user input.
        
        // Create a Scanner object for kkeyboard input.
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to select the package they have.
        System.out.println("Which internet package do you have?");
        System.out.println("A, B, or C?");
        input = sc.nextLine();
        internetPackage = input.charAt(0);
        
        // Prompt the user to enter the number 
        // of hours they have used.
        System.out.println("How many hours did you use?");
        input = sc.nextLine();
        hours = Integer.parseInt(input);
        
        
        // Create a DecimalFormat object
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Display the pricing for the selected 
        // package and number of hours.
        switch (internetPackage)
        {
            case 'a':
            case 'A':
                // Calculate the total price
                packagePrice = 9.95;
                hourlyPrice = 2.00;
                if (hours <= 10)
                {
                    totalPrice = packagePrice;
                }
                else
                {
                    hours = hours - 10;
                    totalPrice = packagePrice + (hours * hourlyPrice);
                }
                System.out.println("Your total price is $" 
                    + dollar.format(totalPrice));
                
                // Calculate and display potential savings
                packagePrice = 13.95;
                hourlyPrice = 1.00;
                if (hours >= 20)
                {
                    hours = hours - 20;
                }
                alternatePrice = packagePrice + hours * hourlyPrice;
                savings = totalPrice - alternatePrice;
                if (totalPrice > alternatePrice)
                {
                    System.out.println("You would have saved $" + 
                            dollar.format(savings) +
                            " with package B.");
                }
                if (totalPrice > 19.95)
                {
                    totalPrice = totalPrice - 19.95;
                    System.out.println("You would have saved $" + 
                            dollar.format(totalPrice) + 
                            " with package C.");
                }
                break;
            case 'b':
            case 'B':
                
                // Calculate total price.
                packagePrice = 13.95;
                hourlyPrice = 1.00;
                if (hours <= 20)
                {
                    totalPrice = packagePrice;
                }
                else
                {
                    hours = hours - 20;
                    totalPrice = packagePrice + (hours * hourlyPrice);
                }
                System.out.println("Your total price is $" 
                    + dollar.format(totalPrice));
                
                // Calculate potential savings
                if (totalPrice > 19.95)
                {
                    totalPrice = totalPrice - 19.95;
                    System.out.println("You would have saved " + 
                        dollar.format(totalPrice) + " if you"
                        + " had package C.");
                }
                
                break;
            case 'c':
            case 'C':
                totalPrice = 19.95;
                System.out.println("Your total price is $"  
                    + dollar.format(totalPrice));
            break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
