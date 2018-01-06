package chapter4;

import javax.swing.JOptionPane;

/**
 *
 * @author david_urijah
 * 
 * This program calculates the distance traveled
 * by the user.
 */

public class DistanceTraveled 
{
    public static void main(String[] args)
    {
        int speedMPH;           // The speed of the vehicle in mph.
        int hours;              // The number of hours traveled.
        String input;           // For user input.
        
        // Prompt the user for the speed traveled.
        input = JOptionPane.showInputDialog("How fast were you traveling?");
        speedMPH = Integer.parseInt(input);
        
        // Validate the speed traveled.
        while (speedMPH < 0)
        {
            input = JOptionPane.showInputDialog("The speed must be at"
                    + " least 0 mph.");
            speedMPH = Integer.parseInt(input);
        }
        
        // Prompt the user for the number of hours traveled.
        input = JOptionPane.showInputDialog("How many hours did you travel?");
        hours = Integer.parseInt(input);
        
        // Validate the hours traveled
        while (hours < 1)
        {
            input = JOptionPane.showInputDialog("The number of hours "
                    + "traveled must be at least 1. Please reenter the number"
                    + "of hours traveled");
            hours = Integer.parseInt(input);
        }
            
        System.out.println("Hour\t\tDistance Traveled");
        System.out.println("---------------------------------");
        for (int i = 1; i <= hours; i++)
        {
            System.out.println(" " + i +"\t\t        " + i * speedMPH);
        }
    }
    
}
