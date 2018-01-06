package chapter11;

/**
 *
 * @author david_urijah
 */
public class Essay extends GradedActivity
{
    private double grammar;		// The grammar portion of the essay.
    private double spelling;	// The spelling portion of the essay.
    private double length;		// The length portion of the essay.
    private double content;		// The content portion of the grade.
    private double finalGrade;
    
    /**
     * Constructor
     * @param gram The grammar portion of the grade
     * @param spell The spelling portion of the grade
     * @param len The length portion of the grade
     * @param cont The content portion of the grade.
     */
    
    public Essay(double gram, double spell, double len, double cont)
    {
    	grammar = gram;
    	spelling = spell;
    	length = len;
    	content = cont;
    	finalGrade = grammar + spelling + length + content;
    	
    	setScore(finalGrade);
    }
    
    /**
     * The setGrammar method sets the grammar 
     * of the grade.
     * @param gram The grammar portion of the grade
     */
    
    public void setGrammar(double gram)
    {
    	grammar = gram;
    }
    
    /**
     * The setSpelling method sets the spelling
     * portion of the grade.
     * @param spell The spelling portion of the grade.
     */
    
    public void setSpelling(double spell)
    {
    	spelling = spell;
    }
    
    /**
     * The getLength method sets the length
     * portion of the grade.
     * @param len The length portion of the grade.
     */
    
    public void setLength(double len)
    {
    	length = len;
    }
    
    /**
     * The setContent method sets the content
     * portion of the grade.
     * @param cont The content portion of the grade.
     */
    
    public void setContent(double cont)
    {
    	content = cont;
    }
    
    /**
     * The getGrammar method returns the value of the
     * grammar portion of the grade.
     * @return The grammar portion of the grade.
     */
    
    public double getGrammar()
    {
    	return grammar;
    }
    
    /**
     * The getSpelling method returns the value stored
     * in the spelling field.
     * @return The value stored in the spelling field.
     */
    
    public double getSpelling()
    {
    	return spelling;
    }
    
    /**
     * The getLength method returns the value stored in
     * the length field
     * @return The value stored in the length field.
     */
    
    public double getLength()
    {
    	return length;
    }
    
    /**
     * The getContent method returns the value stored in 
     * the content field.
     * @return The value stored in the content field.
     */
    
    public double getContent()
    {
    	return content;
    }    
}
