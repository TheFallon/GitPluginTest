package chapter12;

/**
 * 
 * @author david-urijah
 *
 * This exception class sends an exception message for
 * the TestScores class.
 */

public class InvalidTestScore extends Exception
{
	public InvalidTestScore()
	{
		super("Error: That was an invalid test score");
	}
}
