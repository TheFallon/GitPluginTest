package chapter7;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

/**
 *
 * @author david_urijah
 * 
 * This program creates a GUI that allows the user
 * calculate the charges for long distance phone calls
 */

public class LongDistanceCalls extends JFrame
{
    private JPanel panel;                     // A holding panel.
    private JLabel messageLabel;              // A message to the user.
    private JTextField minuteTextField;       // To hold user input.
    private JRadioButton dayTime;             // The day time rate.
    private JRadioButton evening;             // The evening rate.
    private JRadioButton offPeak;             // The off-peak rate.
    private ButtonGroup radioButtonGroup;     // To group radio buttons
    private final int WINDOW_WIDTH = 400;     // Window width.
    private final int WINDOW_HEIGHT = 100;    // Window height.
    
    /**
     * Constructor
     */
    
    public LongDistanceCalls() 
    {
        // Set the window title
        setTitle("Long Distance Call Calculator");
        
        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Build the panel and add it to the frame.
        buildPanel();
        
        // Add the panel to the frame's content pane.
        add(panel);
        
        // Display the window
        setVisible(true);
    }
    
    /**
     *  This buildPanel method adds a label, text field, and
     *  three buttons to the panel.
     */
    
    private void buildPanel()
    {
        // Create the label, text field, and radio buttons.
        messageLabel = new JLabel("Enter the number of minutes used.");
        minuteTextField = new JTextField(10);
        dayTime = new JRadioButton("Day time calling rates.");
        evening = new JRadioButton("Evening calling rates.");
        offPeak = new JRadioButton("Off-peak calling rates.");
        
        // Group the radio buttons.
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(dayTime);
        radioButtonGroup.add(evening);
        radioButtonGroup.add(offPeak);
        
        // Add action listeners to the radio buttons
        dayTime.addActionListener(new RadioButtonListener());
        evening.addActionListener(new RadioButtonListener());
        offPeak.addActionListener(new RadioButtonListener());
        
        // Create a panel and add the components to it.
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(minuteTextField);
        panel.add(dayTime);
        panel.add(evening);
        panel.add(offPeak);
        
    }
    
    /**
     *  Private inner class that handles the event when
     *  the user clicks one of the radio buttons.
     */
    
    private class RadioButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String input;           // To hold user input.
            double minutesUsed;     // The number of minutes used.
            double billTotal;       // The total bill for the user.
            final double day = .07; // Daytime rate.
            final double eve = .12; // Evening rate.
            final double off = .05; // Off-peak rate.
            
            // Get the minutes entered and convert to a double.
            input = minuteTextField.getText();
            minutesUsed = Double.parseDouble(input);
            
            // Determine which radio button was clicked.
            if (e.getSource() == dayTime)
            {
                billTotal = day * minutesUsed;
            }
            else if (e.getSource() == evening)
            {
                billTotal = eve * minutesUsed;
            }
            else
            {
                billTotal = off * minutesUsed;
            }
            
            // Create a DecimalFormat object
            DecimalFormat dollar = new DecimalFormat("#,##0.00");
            
            // Display the results to the user.
            JOptionPane.showMessageDialog(null, 
                    "Your total charges are $" + dollar.format(billTotal));
            
        }
    }
    
    public static void main(String[] args)
    {
        new LongDistanceCalls();
    }
}
