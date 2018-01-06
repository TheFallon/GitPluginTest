package chapter9;

/**
 *
 * @author david_urijah
 * 
 * The RetailItem class stores data on
 * a retail item.
 */

public class RetailItem 
{
    private String description;     // The item's description
    private int unitsOnHand;        // Number of units on hand.
    private double price;           // The item's price.
    
    /**
     * Constructor
     * @param des The item's description
     * @param units The number of units on hand
     * @param unitPrice The price of one unit
     */
    
    public RetailItem(String des, int units, double unitPrice)
    {
        description = des;
        unitsOnHand = units;
        price = unitPrice;
    }
    
    /**
     * Copy Constructor
     * @param object2 The object to be copied
     */
    
    public RetailItem(RetailItem object2)
    {
        description = object2.description;
        unitsOnHand = object2.unitsOnHand;
        price = object2.price;
    }
    
    /**
     * The setDescription method sets the description of
     * Retail Item.
     * @param des The item's description
     */
    
    public void setDescription(String des)
    {
        description = des;
    }
    
    /**
     * The setUnits method sets the  number
     * of units on hand of the RetailItem
     * @param units The number of units on hand
     */
    
    public void setUnits(int units)
    {
        unitsOnHand = units;
    }
    
    /**
     * The setPrice method sets the price of 
     * the ReatilItem object
     * @param unitPrice The price of the object
     */
    
    public void setPrice(double unitPrice)
    {
        price = unitPrice;
    }
    
    /**
     * The getDescription method returns a description of the
     * item.
     * @return The item's description. 
     */
    
    public String getDescription()
    {
        return description;
    }
    
    /**
     * The getUnits method returns the number of units on hand
     * @return Units on hand.
     */
    
    public int getUnits()
    {
        return unitsOnHand;
    }
    
    /**
     * The getPrice method returns the price of the unit
     * @return The item's price.
     */
    
    public double getPrice()
    {
        return price;
    }
    
}
