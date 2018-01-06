package chapter9;

/**
 *
 * @author david_urijah
 * 
 * This program demonstrates the
 * LandTract class's toString and
 * equals methods
 */
public class LandTractDemo 
{
    public static void main(String[] args)
    {
        // Create two LandTract object's
        // with the same dimensions.
        LandTract lot1 = new LandTract(10.5, 5.5);
        LandTract lot2 = new LandTract(10.5, 5.7);
        
        System.out.println("Tract 1, " + lot1);
        System.out.println();
        System.out.println("Tract 2, " + lot2);
        System.out.println();

        
        if (lot1.equals(lot2))
        {
            System.out.println("The lot's are equal");
        }
        else
        {
            System.out.println("The lots are not equal");
        }
    }
    
}
