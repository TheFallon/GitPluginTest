package chapter3;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * This program determines the number of
 * points earned in a book club.
 */

public class BookClubPoints 
{
    public static void main(String[] args)
    {
        int books;      // The number of books purchased.
        int points;     // The number of points earned
        
        // Create a Scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user
        System.out.println("How many books did you purchase?");
        books = sc.nextInt();
        
        // Determine the number of points earned
        if (books == 0)
        {
            points = 0;
        }
        else if (books == 1)
        {
            points = 5;
        }
        else if (books == 2)
        {
            points = 15;
        }
        else if (books == 3)
        {
            points = 30;
        }
        else
        {
            points = 60;
        }
        
        System.out.println("You earned " + points + " this month.");
    }
}
