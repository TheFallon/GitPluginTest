package chapter4;

/**
 *
 * @author david_urijah
 * 
 * This program displays the Celsius temperature value
 * between 0 and 20 degrees, and their Fahrenheit equivalents.
 */

public class CelsiusToFahrenheitTable 
{
    public static void main(String[] args)
    {
        // Constants
        final int MIN_CELSIUS = 0;      // Mninimum Celsius temperature.
        final int MAX_CELSIUS = 20;     // Maximum Celsius temperature.
        final int INCREMENT = 1;        // Increment for the temperature.
        
        // Variables
        int celsius = 0;              // Minimum Fahrenheit temperature.
        int fahrenheit;              // Maximum Fahrenheit temperature.
        
        // Display the table headings
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("----------------------------------");
        
        // Display the values
        for(celsius = MIN_CELSIUS; celsius <= MAX_CELSIUS; celsius += INCREMENT)
        {
            fahrenheit = ((9 / 5) * celsius) + 32;
            System.out.println(celsius + "\t\t" + fahrenheit);
        }
    }  
}
