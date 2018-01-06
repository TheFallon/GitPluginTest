package chapter12;

import java.util.Scanner;

/**
 * 
 * @author david-urijah
 * 
 * This program demonstrates the TestScore class.
 */

public class TestScoreDemo 
{
	public static void main(String[] args) throws InvalidTestScore
	{
		// Create a double array.
		double[] testScores = new double[10];
		
		// Create a Scanner object for keyboard input.
		Scanner sc = new Scanner(System.in);
		
		// INput values into the array.
		for (int index = 0; index < testScores.length; index++)
		{
			System.out.println("Enter test score #" + (index + 1));
			testScores[index] = sc.nextDouble();
		}
		
		// Create a TestScore object passing testScores 
		// as an argument.
		TestScores test = new TestScores(testScores);
	}

}
