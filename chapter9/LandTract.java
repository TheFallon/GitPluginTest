package chapter9;

/**
 *
 * @author david_urijah
 */

public class LandTract 
{
    private double tractWidth;      // To hold the tract's width
    private double tractLength;     // To hold the tract's height.
    
    /**
     *  Constructor
     * @param width The land tract's width.
     * @param length The land tract's length
     */
    
    public LandTract(double width, double length)
    {
        tractWidth = width;
        tractLength = length;
    }
    
    /**
     * The setWidth method set's the width of
     * the tract of land.
     * @param width The land tract's width.
     */
    
    public void setWidth(double width)
    {
        tractWidth = width;
    }
    
    /**
     * The setLength method set's
     * the length of the land tract.
     * @param length The length of the land
     * tract
     */
    
    public void setLength(double length)
    {
        tractLength = length;
    }
    
    /**
     * The getWidth method returns the 
     * tract's length.
     * @return The tract's length.
     */
    
    public double getWidth()
    {
        return tractWidth;
    }
    
    /**
     * The getLength method returns the
     * land tract's length.
     * @return The tract's length
     */
    
    public double getLength()
    {
        return tractLength;
    }
    
    /**
     * The toString method returns a string
     * describing the dimensions of the tract
     * of land
     * @return The string containing the description
     * of the tract of land.
     */
    
    public String toString()
    {
        // Create a string describing the land tract
        String str = "Tract Dimensions:" +
                     "\nTract width: " + tractWidth +
                     "\nTract length: " + tractLength +
                     "\nTract area: " + getArea();
        
        // Return the string
        return str;
    }
    
    /**
     * The equals method accepts a LandTract object
     * and tests to see if the fields from the calling
     * object are equal to the fields of the object
     * being passed.
     * @param object2 The object that is passed as an
     * argument.
     * @return True if the objects are equal, false otherwise
     */
    
    public boolean equals(LandTract object2)
    {
        boolean status;
        
        // Determine whether this object's
        // length and width fields are equal
        // to object 2's length and width fields
        if (tractWidth == object2.tractWidth
                && tractLength == object2.tractLength)
        {
            status = true;      // Yes, the objects are equal
        }
        else
        {
            status = false;     // No, the objects are NOT equal
        }
        return status;
    }
    
    /**
     * The getArea method returns the area
     * of a LandTract object
     * @return The area of the LandTract object.
     */
    
    public double getArea()
    {
        return tractWidth * tractLength;
    }
}
