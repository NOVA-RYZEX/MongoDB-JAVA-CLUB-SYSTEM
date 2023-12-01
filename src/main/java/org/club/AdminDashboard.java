package org.club;

import javax.swing.*;

/**
 * The AdminDashboard class represents the main dashboard for the admin user.
 * It extends JFrame to create the graphical user interface.
 */
public class AdminDashboard extends JFrame {

    /**
     * Instantiates a new Admin dashboard.
     * Constructor for creating an instance of the AdminDashboard class.
     * It sets the look and feel, sets the frame icon, and initializes the dashboard.
     */
    public AdminDashboard() {
        // Set look and feel and frame icon
        Constant.setLookAndFeel(this);
        Constant.setFrameIcon(this);

        // Initialize the admin dashboard
        SwingUtilities.invokeLater(this::initializeAdminDashboard);
    }

    /**
     * Initializes the admin dashboard.
     * Private method to set up the graphical components of the admin dashboard.
     */
    private void initializeAdminDashboard() {
        /* Set up the login frame */
        // Set up JFrame with specified title and size
        Constant.setUpJFrame(this, "Admin Dashboard", 1900, 1000);

        /* Set the background,  */
        // Create a background image panel and add it to the content pane
        SetBackgroundImage adminDashboardBackground = new SetBackgroundImage();
        this.getContentPane().add(adminDashboardBackground);
    }
}
