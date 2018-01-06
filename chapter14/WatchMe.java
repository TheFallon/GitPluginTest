package chapter14;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author david-urijah
 * 
 * This applet displays two eyes which 
 * follow the motion of the mouse.
 */
public class WatchMe extends JApplet
{
    private int leftCurrentX = 132;     // X coordinate for left eye.
    private int leftCurrentY = 95;      // Y coordinate for left eye.
    private int rightCurrentX = 182;    // X coordinate for right eye.
    private int rightCurrentY = 95;     // Y coordinate for left eye.
    
    /**
     * init method.
     */
    
    public void init()
    {
        // Set the background color to white
        getContentPane().setBackground(Color.white);
    }
    
    /**
     * The paint method creates the two outer and inner
     * ovals for the eye
     * @param g  The paint method's graphics object.
     */
    
    public void paint(Graphics g)
    {
        // Call the super class paint method
        super.paint(g);
        
        // Draw to black unfilled ovals
        // for the outer eye.
        g.setColor(Color.black);
        g.drawOval(125, 75, 25, 50);
        g.setColor(Color.black);
        g.drawOval(175, 75, 25, 50);
        
        // Draw to inner filled circles
        g.setColor(Color.black);
        g.fillOval(leftCurrentX, leftCurrentY, 10, 10);
        g.setColor(Color.black);
        g.fillOval(rightCurrentX, rightCurrentY, 10, 10);
        
        // Add mouse listeners
        addMouseMotionListener(new MyMouseMotionAdapter());
        addMouseListener(new MyMouseListener());
    }
    
    /**
     * The MyMouseListener class repositions the
     * inner eyes to there original position when
     * the cursor leaves the applet frame.
     */
    
    private class MyMouseListener
                        extends MouseAdapter
    {
        public void mouseExited(MouseEvent e)
        {
            leftCurrentX = 132;
            leftCurrentY = 95;
            rightCurrentX = 182;
            rightCurrentY = 95;
            
            repaint();
        }
    }
    
    /**
     * The MyMouseMotionListener class repositions
     * the inner eyes as the mouse cursor moves around
     * the outer eye.
     */
    
    private class MyMouseMotionAdapter
                        extends MouseMotionAdapter
    {   
        public void mouseMoved(MouseEvent e)
        {
            if (e.getX() < 125 && e.getY() > 50 && e.getY() < 100)
            {
                leftCurrentX = 128;
                rightCurrentX = 178;
                leftCurrentY = 95;
                rightCurrentY = 95;
                
                
                repaint();
            }
            if (e.getX() > 175 && e.getY() > 50 && e.getY() < 100)
            {
                leftCurrentX = 136;
                rightCurrentX = 186;
                leftCurrentY = 95;
                rightCurrentY = 95;
               
                repaint();
            }
            if (e.getY() < 75 && e.getX() > 140 && e.getX() < 174)
            {
                leftCurrentY = 85;
                rightCurrentY = 85;
                leftCurrentX = 132;
                rightCurrentX = 182;
                
                repaint();
            }
            if (e.getY() > 75 && e.getX() > 140 && e.getX() < 174)
            {
                leftCurrentY = 105;
                rightCurrentY = 105;
                leftCurrentX = 132;
                rightCurrentX = 182;
                
                repaint();
            }
        }
    }
}
