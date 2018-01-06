package chapter8;

import javax.swing.JOptionPane;

/**
 *
 * @author david_urijah
 * 
 * This class stores a series of account numbers.
 * It then allows the user to enter a value, and 
 * searches for that value.
 */

public class ChargeAccountValidation 
{
    public static void main(String[] args)
    {
        int searchValue = 0;            // The value to search for.
        String input;                   // To hold user input.
        
        // Create an array with the charge account numbers.
        int[] accountNumbers = { 5658845, 4520125, 7895122, 8777541,
                                 8451277, 1302850, 8080152, 4562555,
                                 5552012, 5050552, 7825877, 1250255,
                                 1005231, 6545231, 3852085, 7576651,
                                 7881200, 4581002 };
        
        // Get an account number from the user to search for.
        input = JOptionPane.showInputDialog("Enter an account "
                                          + "number to search for");
        searchValue = Integer.parseInt(input);
        
        // Determine if the account number was found, 
        // and display a message to the user.
        if (sequentialSearch(accountNumbers, searchValue))
        {
            JOptionPane.showMessageDialog(null, "The account "
                                              + "number is valid");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The account number "
                                              + "is NOT valid");
        }
        
    }
    
    public static boolean sequentialSearch(int[] array,
                                           int value)
    {
        int index;          // Loop control variable.
        boolean found;      // Flag indicating search results.
        
        // Element 0 is the starting point of the search. 
        index = 0;
        
        // Store the default elements value and found.
        found = false;
        
        // Search the array.
        while (!found && index < array.length)
        {
            if (array[index] == value)
            {
                return true;
            }
            index++;
        }
        return false;
    }
}
