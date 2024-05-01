import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;

/*
 * Buttons 0-9 in one Array and Grid (Handled in CalcCon)
 * 5 Operators + Clear handled in separate Array
 * Display in form of label as output interface
 */
public class CalcView {

    public JButton[] ButtonNumArray = new JButton[10];
    public JButton[] ButtonOpArray = { new JButton("x"), new JButton("/"), new JButton("+"), new JButton("-"),
            new JButton("=") };
    public JLabel Display;

    // First Time initialization: window with buttons and display
    public CalcView() {
        JFrame f = new JFrame();// creating instance of JFrame
        Display = new JLabel("0", SwingConstants.RIGHT);
        JPanel NumPanel = new JPanel(new GridLayout(4, 3)); // container for the number keys
        JPanel OpPanel = new JPanel(new GridLayout(3, 2));

        f.add(Display);

        // TODO: MAKE THE CLASSIC NUMPAD ORDER
        // Create and and 10 Buttons for the numkeys
        for (int i = 9; i >= 0; i--) {
            // Creating Buttons in the array where Index corresponds to value
            ButtonNumArray[i] = new JButton(Integer.toString(i));

            // adding button to the Panel
            NumPanel.add(ButtonNumArray[i]);
        }
        f.add(NumPanel);

        // Adding all JButtons to the Panel
        for (int i = 0; i < 5; i++) {
            // adding button to the Panel
            OpPanel.add(ButtonOpArray[i]);
        }

        f.add(OpPanel);

        f.setSize(500, 500);// 400 width and 500 height for the window
        f.setLayout(new GridLayout(3, 1));// using a grid layout
        f.setVisible(true);// making the frame visible

    }

    // Updating only the display based on the controller
    public void UpdateCalcView(int displayNum) {

    }

}
