package chapter9;

/**
 *
 * @author david_urijah
 */
public class CashRegister 
{
    private RetailItem newItem;     // The item that was purchased
    private int numItem;            // The number of items being purchased.
    
    /**
     *  Constructor
     * @param item A retailItem object
     * @param count The number of retail items being purchased
     */
    
    public CashRegister(RetailItem item, int count)
    {
        newItem = new RetailItem(item);
        numItem = count;
    }
    
    /**
     * The getNewItem method returns a copy of a RetailItem
     * object
     * @return The copied object. 
     */
    
    public RetailItem getNewItem()
    {
        return new RetailItem(newItem);
    }
    
    /**
     * The getNumItem method returns the number
     * of items purchased
     * @return The number of item's purchased.
     */
    
    public int getNumItem()
    {
        return numItem;
    }
    
    /**
     * The getSubTotal method returns the sub-total
     * of the item's purchased
     * @return The sub-total of the item's purchased.
     */
    
    public double getSubTotal()
    {
        return numItem * newItem.getPrice();
    }
    
    /**
     * The getTax method returns the amount of sales
     * for the purchase.
     * @return The amount of sales tax
     */
    
    public double getTax()
    {
        return numItem * newItem.getPrice() * .06;
    }
    
    /**
     * The getTotal method returns the total
     * cost of the purchase, including tax.
     * @return The total of the purchase, including tax.
     */
    
    public double getTotal()
    {
        return numItem * newItem.getPrice() * 1.06;
    }
}
