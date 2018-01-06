package chapter10;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * This program searches an array for a String 
 * entered by the user, and then displays the String
 * if it is found in the array.
 */

public class TelemarketingPhoneList 
{
    public static void main(String[] args)
    {
        String lookUp;       // To hold user input.
        
        String[] names = { "Campbell, Terrence", "Campbell, Michelle",
                           "Campbell, Ronald", "Campbell, Otis",
                           "Murtha, Bridget", "Murtha, Lawrence",
                           "Yaffe, Joseph", "Michael, Yaffe",
                           "Bowen, Michael", "Loewy, Michael" };
        
        String[] phoneNumbers = { "277-6289", "666-6666", "524-6354",
                                  "245-6537", "458-6328", "425-6351",
                                  "685-4219", "468-0777", "235-6534",
                                  "887-7896" };
        
        // Create a Scanner object for keyboard input.
        Scanner sc = new Scanner(System.in);
        
        // Get a partial name to search for.
        System.out.print("Enter the first few letters of a " + 
                         "name to search for.");
        lookUp = sc.nextLine();
        
        for (int index = 0; index < names.length; index++)
        {
            if (names[index].startsWith(lookUp))
            {
                System.out.println(names[index] + " " + 
                        phoneNumbers[index]);
            }
        }
    }
}
