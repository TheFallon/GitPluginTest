package chapter16;

/**
 *
 * @author david_urijah
 * 
 * The ChargeAcctValidation class has a 
 * method that accepts an int array and 
 * an integer, and determines if that
 * integer is contained in the array.
 */

public class ChargeAcctValidation 
{
    /**
     * The search method searches the array for the value
     * @param array The array to be searched
     * @param value The value to search for.
     * @return True if the value is found, otherwise false.
     */
    
    public static boolean search(int[] array, int value)
    {
        int index;          // Loop control variable.
        int position;       // Position the value is found at.
        boolean found;      // Flag indicating search results
        
        // Element 0 is the starting point of the search.
        index = 0;
        
        // Store the default values positions and found.
        position = -1;
        found = false;
        
        // Search the array.
        while (!found && index < array.length)
        {
            if (array[index] == value)
            {
                found = true;
                position = index;
            }
            index++;
        }
        
        // Return whether or not 
        // the value was found.
        return found;
    }
}
