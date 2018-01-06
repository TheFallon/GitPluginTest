package chapter2;


import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author david_urijah
 * 
 * This program calculates the sale
 * amount including county and state sales
 * tax
 */

public class SalesTax 
{
    public static void main(String[] args)
    {
        final double stateTax = 0.04;      // State sales tax.
        final double countyTax = 0.02;     // County sales tax.+
        double countyTaxTotal;             // Total county tax
        double stateTaxTotal;              // Total state tax
        double subTotal;                   // The sub total.
        double totalSale;                      // The total sales.
        String input;                      // For user input.
        
        // Ask the user for the sub total
        input = JOptionPane.showInputDialog("Enter the subtotal.");
        
        // Convert the subtotal to an int.
        subTotal = Double.parseDouble(input);
        
        // Calculate the tax amounts
        countyTaxTotal = subTotal * countyTax;
        stateTaxTotal = subTotal * stateTax;
        
        // Calculate the totalSale
        totalSale = subTotal + countyTaxTotal + stateTaxTotal;
        
        // Create a DecimalFormat object to format output.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Display the total sale to the user
        JOptionPane.showMessageDialog(null, "Your total is $" + 
                dollar.format(totalSale));
    }
    
}
