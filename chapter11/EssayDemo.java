package chapter11;

import java.util.Scanner;

/**
 * 
 * @author david-urijah
 * This program demonstrates the Essay class.
 */

public class EssayDemo 
{
	public static void main(String[] args)
	{
		double grammar;			// The grammar grade.
		double spelling;		// The spelling grade.
		double length;			// The length portion of the grade.
		double content;			// The content portion of the grade.
		
		// Create a Scanner object for user input.
		Scanner sc = new Scanner(System.in);
		
		// Get the grades from the user.
		System.out.println("Enter the grammar portion of the grade.");
		grammar = sc.nextDouble();
		System.out.println("Enter the spelling portion of the grade.");
		spelling = sc.nextDouble();
		System.out.println("Enter the length portion of the grade");
		length = sc.nextDouble();
		System.out.println("Enter the content portion of the grade");
		content = sc.nextDouble();
		
		// Create an essay object, passing the four variables
		// as arguments
		Essay es = new Essay(grammar, spelling, length, content);
		
		// Display the grades to the user.
		System.out.println("Essay Score Breakdown:" +
						   "\nGrammar: " + es.getGrammar() + 
						   "\nSpelling: " + es.getSpelling() + 
						   "\nLength: " + es.getLength() + 
						   "\nContent: " + es.getContent() +
						   "\nTotal Score: " + es.getScore() +
						   "\nFinal Grade: " + es.getGrade());
	}

}
