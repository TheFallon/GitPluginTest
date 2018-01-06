package chapter11;

/**
 * 
 * @author david-urijah
 *
 *The CourseGrades class has a private field
 *that accepts objects of the GradedActivity type
 *and stores data for several graded activities.
 */

public class CourseGrades extends GradedActivity
						  implements Analyzable
{
	private GradedActivity[] grades = new GradedActivity[4];
	
	public CourseGrades(GradedActivity lab, PassFailExam exam, 
						Essay paper, FinalExam finExam)
	{
		grades[0] = lab;
		grades[1] = exam;
		grades[2] = paper;
		grades[3] = finExam;
		
	}
	
	/**
	 * The setLab method accepts a GradedActivty
	 * @param activity The grade for the lab.
	 */
	
	public void setLab(GradedActivity lab)
	{
		grades[0] = lab;
	}
	
	/**
	 * The setPassFailExam method sets the grade for 
	 * the exam
	 * @param exam The grade for the exam.
	 */
	
	public void setPassFailExam(PassFailExam exam)
	{
		grades[1] = exam;
	}
	
	/**
	 * The setEssay method sets the grade for the
	 * Essay portion of the grade.
	 * @param paper The grade for the essay.
	 */
	
	public void setEssay(Essay paper)
	{
		grades[2] = paper;
	}
	
	/**
	 * The setFinalExam method sets the grade for the 
	 * final exam.
	 * @param finExam The final exam grade. 
	 */
	
	public void setFinalExam(FinalExam finExam)
	{
		grades[3] = finExam;
	}
	
	/**
	 * The getLab method returns the grade
	 * for the lab portion of the grade.
	 * @return The lab portion of the grade.
	 */
	
	public GradedActivity getLab()
	{
		return grades[0];
	}
	
	/**
	 * The getPassFilExam method returns the grade
	 * for the exam.
	 * @return The grade for the exam.
	 */
	
	public GradedActivity getPassFailExam()
	{
		return grades[1];
	}
	
	/**
	 * The getEssay method returns the grade for
	 * the essay portion of the grade.
	 * @return The essay portion of the grade.
	 */
	
	public GradedActivity getEssay()
	{
		return grades[2];
	}
	
	/**
	 * The getFinalExam method returns the value
	 * for the final exam.
	 * @return The grade for the final exam.
	 */
	
	public GradedActivity getFinalExam()
	{
		return grades[3];
	}
	
	/**
	 * The getAverage method returns a GradedActivity object
	 * with a score field that is set to the average
	 * the scores of the objects stored in the grades array
	 */
	public GradedActivity getAverage()
	{
		double total = 0;
		GradedActivity average = new GradedActivity();
		
		for (int index = 0; index < grades.length; index++)
		{
			total += grades[index].getScore();
		}
		
		total = total / grades.length;
		
		average.setScore(total);
		return average;
	}
	
	/**
	 * The getHighest method returns a GradedActivity object
	 * with a score field that is set to the average
	 * the scores of the objects stored in the grades array
	 */
	public GradedActivity getHighest()
	{
		GradedActivity highest = grades[0];
		
		for (int index = 0; index < grades.length; index++)
		{
			if (grades[index].getScore() > highest.getScore())
			{
				highest = grades[index];
			}
		}
		
		return highest;
	}
	
	/**
	 * The getLowest method returns a GradedActivity object
	 * with a score field that is set to the average
	 * the scores of the objects stored in the grades array
	 */
	public GradedActivity getLowest()
	{
		GradedActivity lowest = grades[0];
		
		for (int index = 0; index < grades.length; index++)
		{
			if (grades[index].getScore() < lowest.getScore())
			{
				lowest = grades[index];
			}
		}
		
		return lowest;
	}
	
	/**
	 * The toString method returns a String containing
	 * the grades for all of the assignments.
	 */
	
	public String toString()
	{
		String str;
		
		str = "Final Grades: " +
			  "\nActivity: " + grades[0].getScore() + "% " + grades[0].getGrade() + 
			  "\nExam : " + grades[1].getScore() + "% " + grades[1].getGrade() +
			  "\nEssay: " + grades[2].getScore() + "% " + grades[2].getGrade() +
			  "\nFinal Exam : " + grades[3].getScore() + "% " + grades[3].getGrade();
		
		return str;
	}

}
