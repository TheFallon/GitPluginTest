package chapter4;

import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author david_urijah
 * 
 * This program writes the data collected from
 * the DistanceTraveled class to a file names 
 * DistanceTraveled.txt.
 */

public class DistanceFile 
{
    public static void main(String[] args) throws IOException
    {
        int speedMPH;           // The speed of the vehicle in mph.
        int hours;              // The number of hours traveled.
        int distanceMiles;     // The distance traveled in miles
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
        
        // Get a file name.
        input = JOptionPane.showInputDialog("Enter the name of a"
                + " file to write to.");
        
        // Open the file
        PrintWriter outputFile = new PrintWriter(input);
        
        // Write a header for the file.
        outputFile.println("Hour\t\tDistance Traveled");
        outputFile.println("---------------------------------");
        
        for (int i = 1; i <= hours; i++)
        {
            // Calculate the distance.
            distanceMiles = i * speedMPH;
            
            // Write that the distance and hours to a file
            outputFile.print(i);
            outputFile.print("\t\t       ");
            outputFile.println(distanceMiles);
        }
        
        // Close the file.
        outputFile.close();
        JOptionPane.showMessageDialog(null, "The file has been written.");
        System.exit(0);
    }
    
}
