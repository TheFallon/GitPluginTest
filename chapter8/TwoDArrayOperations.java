package chapter8;

import java.util.Random;

/**
 *
 * @author david_urijah
 * 
 * This program has several methods that perform
 * operations on a two dimensional array.
 */

public class TwoDArrayOperations 
{
    public static void main(String[] args)
    {
        int value;     // To pass to methods
        
        int[][] numberArray = { {25, 35, 45, 56},
                                {47, 84, 15, 65},
                                {36, 19, 92, 42},
                                {47, 31, 55, 61} };
        
        Random randy = new Random();
        
        value = randy.nextInt(3);
        
        
        System.out.println("The total of the array is " + 
                                  getTotal(numberArray));
        System.out.println("The average of the array is " + 
                                  getAverage(numberArray));
        System.out.println("The total for row " + (value + 1)
                + " is " + getRowTotal(numberArray, value));
        System.out.println("The total for column " + (value + 1) 
                + " is " + getColumnTotal(numberArray, value));
        System.out.println("The highest value in row " + (value + 1) 
                + " is " + getHighestInRow(numberArray, value));
        System.out.println("The lowest value in row " + (value + 1) 
                + " is " + getLowestInRow(numberArray, value));
    }
    
    public static int getTotal(int[][] array)
    {
        int total = 0;      // To hold the total of the array
        
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++ )
            {
                total += array[row][col];
            }
        }
        return total;
    }
    
    public static int getAverage(int[][] array)
    {
        int total = 0;      // To hold the total of the array
        
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++ )
            {
                total += array[row][col];
            }
        }
        return total / 16;
    }
    
    public static int getRowTotal(int[][] array, int index)
    {
        int total = 0;      // To hold the total of a row
        
        for (int col = 0; col < array[index].length; col++)
        {
            total += array[index][col];
        }
        return total;
    }
    
    public static int getColumnTotal(int[][] array, int index)
    {
        int total = 0;
        
        for (int row = 0; row < array.length; row++)
        {
            total += array[row][index];
        }
        return total;
    }
    
    public static int getHighestInRow(int[][] array, int index)
    {
        int highest = array[index][0];
        
        for (int row = 1; row < array.length; row++)
        {
            if (array[index][row] > highest)
            {
                highest = array[index][row];
            }
        }
        return highest;
    }
    
    public static int getLowestInRow(int[][] array, int index)
    {
        int highest = array[index][0];
        
        for (int row = 1; row < array.length; row++)
        {
            if (array[index][row] < highest)
            {
                highest = array[index][row];
            }
        }
        return highest;
    }
}
