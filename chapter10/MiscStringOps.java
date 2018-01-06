package chapter10;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * 
 */

public class MiscStringOps 
{   
    public static void main(String[] args)
    {
        // Create a Scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        
        /**
         * Demonstrates the wordCount method.
         */
        
        // Prompt the user for a series of words.
        System.out.println("Enter a series of words to be counted");
        String str = sc.nextLine();
        
        // Variables
        int number = 0;
        int value = 0;
        
        // Call the method
        number = wordCount(str, value);
        
        // Display the results to the user.
        System.out.println("There are " + number + " words in the String.");
        
        /**
         * Demonstrate the arrayToString method.
         */
        
        // An array of char's.
        char[] letters = {'T', 'h', 'i', 's', 'S', 't', 'r', 'i', 'n', 'g' };
        
        // A String to place the char's into.
        String input = " ";
        
        // Call the method.
        input = arrayToString(letters, input);
        
        // Display the result.
        System.out.println("The resulting string is: " + input);
        
        /**
         * Demonstrate the mostFrequent method..
         */
        
        // Prompt the user for a String to test.
        System.out.println("Enter a sentence to test for the most " + 
                           "frequent character.");
        String test = sc.nextLine();
        
        // A char to hold the result.
        char frequent = 'a';
        
        // Call the method sending the char as an argument.
        frequent = mostFrequent(test);
        
        // Display the result in a String.
        System.out.println("The most frequently used letter is " + frequent);
        
        
        /**
         * Demonstrate the replaceSubstring method
         */
        
        // Create 3 strings
        String string1 = "the dog jumped over the fence";
        String string2 = "the";
        String string3 = "that";
        String result = replaceSubstring(string1, string2, string3);
        System.out.println(result);
        
        
    }
    
    public static int wordCount(String str, int num)
    {
        // Tokenize the String into an array.
        String[] tokens = str.split(" ");
        
        // Set num equal to the number of tokens.
        num = tokens.length;
        
        // Return the number of tokens
        return num;
    }
    
    public static String arrayToString(char[] array, String str)
    {
        // A String to hold
        String newString;
        
       newString = str.valueOf(array);
       
       return newString;
    }
    
    public static char mostFrequent(String str)
    {
        int current = 0;
        int highest = 0;
        char highestChar = 'a';
        
        // A string containing the alphabet to compare the string to
        String alpha ="abcdefghijklmnopqrstuvwxyz";
        
        // Iterate over the alphabet string.
        for (int i = 0; i < 26; i++)
        {
            // Iterate over the String
            for (int k = 0; k < str.length(); k++)
            {
                // Compare the char in the input string to the 
                // char in the alphabet string.
                if (str.charAt(k) == alpha.charAt(i))
                {
                    current++;
                }
            }
            
            if (current > highest)
            {
                highest = current;
                highestChar = alpha.charAt(i);
            }
            current = 0;
        }
        return highestChar;
    }
    
    public static String replaceSubstring(String string1, String string2, String string3)
    {
        StringBuilder result = new StringBuilder(string1);
        
        result.replace(0, 3, string3);
        
        result.replace(21, 24, string3);
        
        return result.toString();
    }
}
