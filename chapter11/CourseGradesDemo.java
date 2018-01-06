package chapter11;

import java.util.Scanner;

/**
 * 
 * @author david-urijah
 * This class demonstrates the CourseGrades class.
 */

public class CourseGradesDemo 
{
	public static void main(String[] args)
	{
		int lab;				// To pass to the GradedActivity object
		int questions;			// To pass to PassFailExam object.
		int missed;				// To pass to PassFailExam object.
		double minPassing;		// To pass to PassFailExam object.
		double grammar;			// To pass to an Essay object.
		double spelling;		// To pass to an Essay object.
		double length;			// To pass to an Essay object.
		double content;			// To pass to an Essay object.
		int finalQuestions;		// To pass to a FinalExam object.
		int finalMissed;		// To pass to a Final Exam object.
		
		
		// Create a GradedActivity object.
		GradedActivity grActivity = new GradedActivity();
		
		// Create a Scanner object for keyboard input
		Scanner sc = new Scanner(System.in);
		
		// Get a grade for the lab from the user.
		System.out.println("Enter a grade for the lab: ");
		lab = sc.nextInt();
		
		// Set the grade for the GradedActivity object.
		grActivity.setScore(lab);
		
		// Get values for question, missed, and minPassing 
		// from the user.
		System.out.println("How many questions were on the exam?");
		questions = sc.nextInt();
		System.out.println("How many questions were missed?");
		missed = sc.nextInt();
		System.out.println("What is the minimum passing score?");
		minPassing = sc.nextDouble();
		
		// Create a PassFailExam object passing questions,
		// missed, and minPassing as arguments.
		PassFailExam exam = new PassFailExam(questions, missed, minPassing);
		
		// Get the values for an Essay object from the user.
		System.out.println("What was the grammer portion of the grade");
		grammar = sc.nextDouble();
		System.out.println("What is the spelling portion of the grade");
		spelling = sc.nextDouble();
		System.out.println("What is the length portion of the grade?");
		length = sc.nextDouble();
		System.out.println("What is the content portion of the grade?");
		content = sc.nextDouble();
			
		// Create an Essay object; passing grammar, spelling, length
		// as arguments.
		Essay paper = new Essay(grammar, spelling, length, content);
		
		// Get the values needed for a FinalExam object.
		System.out.println("How many questions were on the final exam?");
		finalQuestions = sc.nextInt();
		System.out.println("How many questions were missed on the final?");
		finalMissed = sc.nextInt();
		
		// Create a FinalExam object passing finalQuestions and
		// finalMissed as arguments.
		FinalExam finExam = new FinalExam(finalQuestions, finalMissed);
		
		// Create a CourseGrades object, passing grActivity, exam, paper,
		// and finExam as arguments.
		CourseGrades finalGrade = new CourseGrades(grActivity, exam, paper, finExam);
		
		// print the course grades by calling the CourseGrades toString method.
		System.out.println(finalGrade.toString() +
						   "\nAverage: " + finalGrade.getAverage().getScore() + "% " + 
						   				   finalGrade.getAverage().getGrade() + 
						   "\nHighestGrade: " + finalGrade.getHighest().getScore() + "% " +
						   						finalGrade.getHighest().getGrade() +
						   "\nLowestGrade: " + finalGrade.getLowest().getScore() + "% " +
						   					   finalGrade.getLowest().getGrade());
	}
}
