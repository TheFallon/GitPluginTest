package chapter10;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 */

public class FrequentChar 
{
    public static void main(String[] args)
    {
        int current = 0;
        int highest = 0;
        char highestChar = 'a';
        
        String alpha ="abcdefghijklmnopqrstuvwxyz";
        
        Scanner sc = new Scanner(System.in);
        String userIn = sc.nextLine();
        
        for (int i = 0; i < 26; i++)
        {
            for (int k = 0; k < userIn.length(); k++)
            {
                if (userIn.charAt(k) == alpha.charAt(i))
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
        System.out.println("The most frequently recurring letter is " + 
                highestChar + " with " + highest + " occurences.");
    }
    
}
