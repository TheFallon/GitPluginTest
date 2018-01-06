package chapter4;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author david_urijah
 */
public class UppercaseFileConverter 
{
    public static void main(String[] args) throws IOException
    {
        // Creat a Scanner object for keyboard input and file io.
        Scanner keyboard = new Scanner(System.in);
        
        // Get the name of a file
        System.out.println("Enter the name of a file to read from: ");
        String filename = keyboard.nextLine();
        
        // Open the file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        // Read the first line from the file.
        String line = inputFile.nextLine();
        
        // Convert the the string to uppercase
        String lineUpper = line.toUpperCase();
        
        // Close the file
        inputFile.close();
        
        // Get the name of a file to open.
        System.out.println("Enter the name of a file to write to:");
        filename = keyboard.nextLine();
        
        // Open the file
        PrintWriter outputFile = new PrintWriter(filename);
        
        // Write lineUpper to the output file.
        outputFile.println(lineUpper);
        
        // Close the file.
        outputFile.close();
        System.out.println("The file has been written to.");
    }
    
}
