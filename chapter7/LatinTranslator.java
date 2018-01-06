package chapter7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author david_urijah
 * 
 * This program translates English words
 * into Latin.
 */

public class LatinTranslator extends JFrame
{
    private final int WINDOW_WIDTH = 400;       // Window width
    private final int WINDOW_HEIGHT = 200;      // Window HEIGHT.
    
    /**
     * Constructor
     */
    
    public LatinTranslator()
    {
        // Set the title bar text.
        setTitle("Latin Translator");
        
        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add a GridLayout manager to the content pane.
        setLayout(new GridLayout(2, 3));
        
        // Create six buttons.
        JButton leftButton = new JButton("Translate");
        JButton rightButton = new JButton("Translate");
        JButton centerButton = new JButton("Translate");
        JButton upButton = new JButton("Translate");
        JButton downButton = new JButton("Translate");
        JButton acrossButton = new JButton("Translate");
        
        // Add action listeners to the buttons.
        leftButton.addActionListener(new LeftButtonListener());
        rightButton.addActionListener(new RightButtonListener());
        centerButton.addActionListener(new CenterButtonListener());
        upButton.addActionListener(new UpButtonListener());
        downButton.addActionListener(new DownButtonListener());
        acrossButton.addActionListener(new AcrossButtonListener());
        
        // Create six labels.
        JLabel leftLabel = new JLabel("        Left        ");
        JLabel rightLabel = new JLabel("       Right       ");
        JLabel centerLabel = new JLabel("      Center     ");
        JLabel upLabel = new JLabel("         Up         ");
        JLabel downLabel = new JLabel("        Down        ");
        JLabel acrossLabel = new JLabel("      Across      ");
        
        // Create six panels.
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel upPanel = new JPanel();
        JPanel downPanel = new JPanel();
        JPanel acrossPanel = new JPanel();
        
        // Add the labels to the panels.
        leftPanel.add(leftLabel);
        rightPanel.add(rightLabel);
        centerPanel.add(centerLabel);
        upPanel.add(upLabel);
        downPanel.add(downLabel);
        acrossPanel.add(acrossLabel);
        
        // Add the buttons to the panels.
        leftPanel.add(leftButton);
        rightPanel.add(rightButton);
        centerPanel.add(centerButton);
        upPanel.add(upButton);
        downPanel.add(downButton);
        acrossPanel.add(acrossButton);
        
        // Add the panels to the content pane.
        add(leftPanel);
        add(rightPanel);
        add(centerPanel);
        add(upPanel);
        add(downPanel);
        add(acrossPanel);
        
        // Display the window.
        setVisible(true);
    }
    
    private class LeftButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, 
                    "Latin translation: 'Sinister'");
        }
    }
    
    private class RightButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, 
                    "Latin translation: 'Dexter'");
        }
    }
    
    private class CenterButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, 
                    "Latin translation: 'Medium'");
        }
    }
    
    private class UpButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, 
                    "Latin translation: 'Autem'");
        }
    }
    
    private class DownButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, 
                    "Latin translation: 'Descendit'");
        }
    }
    
    private class AcrossButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, 
                    "Latin translation: 'Trans'");
        }
    }
    
    public static void main(String[] args)
    {
        LatinTranslator lt = new LatinTranslator();
    }
}
