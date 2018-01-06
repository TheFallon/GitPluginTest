package chapter7;

import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 *
 * @author david_urijah
 * 
 * This class calculates the monthly state and
 * county sales tax for a fictitious retail company.
 */

public class MonthlySalesTax extends JFrame
{
    private JPanel panel;
    private JLabel messageLabel;
    private JTextField salesTextField;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 100;
    
    /**
     * Constructor
     */
    
    public MonthlySalesTax()
    {
        // Set the window title.
        setTitle("Sales Tax Calculator");
        
        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        // Specify what happends when the close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Build the panel and add it to the frame.
        buildPanel();
        
        // Add the panel to the frame's content pane.
        add(panel);
        
        // Display the window.
        setVisible(true);
    }
    
    /**
     * The buildPanel method adds a label, text field, and
     * a button to a panel.
     */
    
    private void buildPanel()
    {
        // Create a label to display instructions.
        messageLabel = new JLabel("Enter the retail sales for the month.");
        
        // Create a Text field 10 characters wide.
        salesTextField = new JTextField(10);
        
        // Create a button with the caption "Calculate."
        calcButton = new JButton("Calculate");
        
        // Add an action listener to the button.
        calcButton.addActionListener(new CalcButtonListener());
        
        // Create a JPanel object and let the panel
        // field reference it.
        panel = new JPanel();
        
        // Add the label, text field, and button
        // components to the panel.
        panel.add(messageLabel);
        panel.add(salesTextField);
        panel.add(calcButton);
    }
    
    /**
     *  CalcButtonListener is an action listener class for
     *  the calculate button.
     */
    
    private class CalcButtonListener implements ActionListener
    {
        /**
         * The action performed method executes when the user
         * clicks on the calculate button.
         * @param e The even object
         */
        
        public void actionPerformed(ActionEvent e)
        {
            String input;                // To hold user input.
            double sales;                // To hold the sales.
            double stateSalesTax;        // The total state sales tax.
            double countySalesTax;       // The total county sales tax.
            double totalSalesTax;        // The total of state and county tax.
            final double COUNTY = .02;   // County sales tax rate.
            final double STATE = .04;    // State sales tax.
            
            // Get the text entered by the user.
            input = salesTextField.getText();
            
            // Convert the input to a double
            sales = Double.parseDouble(input);
            
            // Calculate the state, county, and total sales tax
            stateSalesTax = sales * STATE;
            countySalesTax = sales * COUNTY;
            totalSalesTax = stateSalesTax + countySalesTax;
            
            // Create a DecimalFormat object.
            DecimalFormat dollar = new DecimalFormat("#,##0.00");
            
            // Display the results
            JOptionPane.showMessageDialog(null, "Monthly sales tax totals: "
                                    + "\nCounty Sales Tax: $" 
                                    + dollar.format(countySalesTax)
                                    + "\nState Sales Tax: $" 
                                    + dollar.format(stateSalesTax)
                                    + "\nTotal Sales Tax: $" 
                                    + dollar.format(totalSalesTax));      
        }
    }
}
