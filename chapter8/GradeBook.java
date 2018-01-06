package chapter8;

import java.util.Scanner;

/**
 *
 * @author david_urijah
 * 
 * This program stores and calculates information
 * about the test scores of students
 */

public class GradeBook 
{
    public static void main(String[] args)
    {
        final int STUDENTS = 5;     // The number of students
        final int TEST_SCORES = 4;  // The number of test scores.
        
        // Create an array for the students grades.
        String[] names = new String[STUDENTS];
        
        // Create an array to hold the students grades.
        char[] grades = { 'A', 'B', 'C', 'D', 'F' };
        
        // Create 5 arrays to hold the students test scores.
        double[][] testScores = new double[STUDENTS][TEST_SCORES];
        
        // Create a Scanner object to hold user input.
        Scanner sc = new Scanner(System.in);
        
        // Enter the names of the stduents.
        for (int index = 0; index < STUDENTS; index++)
        {
            System.out.println("Enter the name of student #" + 
                                (index + 1));
            names[index] = sc.nextLine();
        }
        
        // Enter the grades for each student, for each test.   
        for (int row = 0; row < STUDENTS; row++)
        {
            System.out.println(names[row] + "'s Test Scores:");
            System.out.println();
            
            for (int col = 0; col < TEST_SCORES; col++)
            {
                System.out.println("Enter test score #" + (col + 1));
                testScores[row][col] = sc.nextDouble();
                System.out.println();
                
                if (testScores[row][col] < 0 || testScores[row][col] > 100)
                {
                    System.out.println("That was an invalid score.");
                    System.exit(0);
                }
            }
        }
        
        // Get the grades for the students
        averageTests(testScores, names, grades);
    }
    
    public static void averageTests(double[][] array, String[] names,
                                    char[] grades)
    {
        final int average = 4;     // To agerage the test scores
        double total;                 // Accumulator
        
        // Average the test scores for the students.
        for (int row = 0; row < array.length; row++)
        {
            // Set the accumulator to 0.
            total = 0;
            
            // Sum a row
            for (int col = 0; col < array[row].length ; col++)
            {
                total += array[row][col];
            }
            
            total = total / average;
            
            if (total >= 90)
            {
                System.out.println(names[row] + ":");
                System.out.println("Average: " + total + "%");
                System.out.println("Grade: " + grades[0]);
                System.out.println();
            }
            else if (total >= 80 && total < 90)
            {
                System.out.println(names[row] + ":");
                System.out.println("Average: " + total + "%");
                System.out.println("Grade: " + grades[1]);
                System.out.println();
            }
            else if (total >= 70 && total < 80)
            {
                System.out.println(names[row] + ":");
                System.out.println("Average: " + total + "%");
                System.out.println("Grade: " + grades[2]);
                System.out.println();
            }
            else if (total >= 60 && total < 70)
            {
                System.out.println(names[row] + ":");
                System.out.println("Average: " + total + "%");
                System.out.println("Grade: " + grades[3]);
                System.out.println();
            }
            else
            {
                System.out.println(names[row] + ":");
                System.out.println("Average: " + total + "%");
                System.out.println("Grade: " + grades[4]);
                System.out.println();
            }
        }
        
    }
    
    
    
}
