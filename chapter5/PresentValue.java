package chapter5;

import javax.swing.JOptionPane;     // Needed for the swing class.
import java.text.DecimalFormat;     // Needed for the DecimalFormat class.


/**
 *
 * @author david_urijah
 */
public class PresentValue
{
    public static void main(String[] args)
    {
        double futureValue;         // The future value.
        double prsntValue;        // The present value.
        double interestRate;        // The rate of interest.
        int numYears;               // The number of years.
        String input;               // to hold user input.
        
        // Get the desired future value.
        input = JOptionPane.showInputDialog("What is the desired "
                                          + "future value?");
        futureValue = Double.parseDouble(input);
        
        // Get the interest rate.
        input = JOptionPane.showInputDialog("Enter the interest rate.");
        interestRate = Double.parseDouble(input);
        interestRate = interestRate / 100;
        
        // Get the number of years.
        input = JOptionPane.showInputDialog("Enter the number of years.");
        numYears = Integer.parseInt(input);
        
        // Calculate the present value by calling
        // the presentValue method.
        prsntValue = presentValue(futureValue, interestRate, numYears);
        
        // Create a DecimalFormat object to format for dollars.
        DecimalFormat dollar = new DecimalFormat("#,##00.00");
        
        // Display the present value
        JOptionPane.showMessageDialog(null, "The present value is: $" +
                                       dollar.format(prsntValue));
        
    }
    
    /**
     * The presentValue method accepts three values from the user
     * and then calculates the present value of an annuity.
     * @param fwdVal The future value.
     * @param rate The interest rate
     * @param years The number of years
     * @return The present value.
     */
    
    public static double presentValue(double fwdVal, double rate, int years)
    {
        double presValue;
        double rateRaisedYears;
        
        // Calculate rateRaisedYears = (1 + r)^n
        rateRaisedYears = Math.pow((1 + rate), years);
       
        // Calculate presValue
        presValue = fwdVal / rateRaisedYears;
        
        return presValue;
    }
    
}


