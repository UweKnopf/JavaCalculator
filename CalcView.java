import javax.swing.*;
import java.awt.GridLayout;

/*
 * Buttons 0-9 in one Array and Grid (Handled in CalcCon)
 * 5 Operators + Clear handled in separate Array
 * Display in form of label as output interface
 */
public class CalcView {

    public JButton[] ButtonNumArray = new JButton[10];

    // First Time initialization: window with buttons and display
    public CalcView() {
        JFrame f = new JFrame();// creating instance of JFrame
        GridLayout ButtonNumLayout = new GridLayout(4, 3);

        // Create and and 10 Buttons for the numkeys
        for (int i = 9; i >= 0; i--) {
            // Creating Buttons in the array where Index corresponds to value
            ButtonNumArray[i] = new JButton(Integer.toString(i));

            // adding button in JFrame
            f.add(ButtonNumArray[i]);
        }

        f.setSize(400, 500);// 400 width and 500 height for the window
        f.setLayout(ButtonNumLayout);// using a grid layout
        f.setVisible(true);// making the frame visible

    }

    // Updating only the display based on the controller
    public void UpdateCalcView(int displayNum) {

    }

}
