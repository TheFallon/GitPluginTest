package chapter2;
import java.text.DecimalFormat;

/**
 *
 * @author david_urijah
 * 
 * This program calculates the total
 * sales of a fictitious company
 */

public class SalesPrediction 
{
    public static void main(String[] args)
    {
        final double totalSales = 4600000;    // The total sales
        final double sharePercentage = 0.62;  // Share by East Coast div.
        double eastCoastSales;             // Sales by the East Coast div.
        
        // Create a DecimalFormat object for dollars.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Calculate the total sales by the 
        // east coast division
        eastCoastSales = totalSales  * sharePercentage;
        
        System.out.println("The East Coast division will have");
        System.out.print("$" + dollar.format(eastCoastSales));
        System.out.println(" in sales if the\ncompanies total sales are");
        System.out.println("$" + dollar.format(totalSales));
    }
    
}
