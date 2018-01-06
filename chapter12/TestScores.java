package chapter12;

/**
 *
 * @author david_urijah
 * 
 * The TestScores class tests for an InvaildTestScore exception. 
 */

public class TestScores
{
	/**
	 * Constructor
	 * @param scores An array of test scores.
	 * @throws InvalidTestScore The exception  be thrown if
	 * 		   one, or more, of the scores is out of range.
	 */
	
	public TestScores(double[] scores) throws InvalidTestScore
	{
		// Iterate through the elements of the array.
		for (int index = 0; index < scores.length; index++)
		{
			// Test for an InvalidArgumentException
			if (scores[index] < 0 || scores[index] > 100)
			{
				// Throw an exception if one of the
				// scores is out of range.
				throw new InvalidTestScore();
			}
		}
	}
    
}
