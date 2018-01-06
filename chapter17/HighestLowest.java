package chapter17;

/**
 *
 * @author david_urijah
 */
public class HighestLowest<T extends Comparable<T>>
{   
    private T[] array;
    
    HighestLowest(T[] arr)
    {
        arr = array;
    }
    
    public T getLowest()
    {
        T low = array[0];
        for (int index = 0; index < array.length; index++)
        {
            if(array[index].compareTo(low) < 0)
            {
                low = array[index];
            }
        }
        
        return low;
    }
    
    public T getHighest()
    {
        T high = array[0];
        for (int index = 0; index < array.length; index++)
        {
            if(array[index].compareTo(high) > 0)
            {
                high = array[index];
            }
        }
        
        return high;
    }
    
}
