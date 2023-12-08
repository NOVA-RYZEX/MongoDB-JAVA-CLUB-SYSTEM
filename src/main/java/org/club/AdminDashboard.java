package org.club;

import javax.swing.*;
import java.awt.*;

/**
 * The AdminDashboard class represents the main dashboard for the admin user.
 * It extends JFrame to create the graphical user interface.
 */
public class AdminDashboard extends JFrame {
    JPanel mainDashboard;
    JMenuBar menuBar;
    JMenu fileMenu, membersMenu, groupMenu, sportsMenu, storeMenu, transactionsMenu, eventsMenu, scheduleMenu, reportsMenu, helpMenu, profileMenu;

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

        mainDashboard = new JPanel();
        mainDashboard.setOpaque(false);
        int width = this.getWidth();
        int height = this.getHeight();
        mainDashboard.setPreferredSize(new Dimension(width, (height - 100)));

        // Create the menu bar
        menuBar = new JMenuBar() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the background color
                g.setColor(new Color(255, 255, 255));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        menuBar.setPreferredSize(new Dimension((width - 100), 50));
        // User Management Menu
        JMenu userMenu = new JMenu("User Management");
        JMenuItem createUserItem = new JMenuItem("Create User");
        JMenuItem editUserItem = new JMenuItem("Edit User");
        JMenuItem deactivateUserItem = new JMenuItem("Deactivate User");

        userMenu.add(createUserItem);
        userMenu.add(editUserItem);
        userMenu.add(deactivateUserItem);

        // Membership Management Menu
        JMenu membershipMenu = new JMenu("Membership Management");
        JMenuItem approveMembershipItem = new JMenuItem("Approve Membership");
        JMenuItem renewMembershipItem = new JMenuItem("Renew Membership");
        JMenuItem manageFeesItem = new JMenuItem("Manage Fees");

        membershipMenu.add(approveMembershipItem);
        membershipMenu.add(renewMembershipItem);
        membershipMenu.add(manageFeesItem);

        // Game Management Menu
        JMenu gameMenu = new JMenu("Game Management");
        JMenuItem addGameItem = new JMenuItem("Add Game");
        JMenuItem editGameItem = new JMenuItem("Edit Game");
        JMenuItem removeGameItem = new JMenuItem("Remove Game");

        gameMenu.add(addGameItem);
        gameMenu.add(editGameItem);
        gameMenu.add(removeGameItem);

        // ... Add more menus and menu items for other functionalities ...

        // Add menus to the menu bar
        menuBar.add(userMenu);
        menuBar.add(membershipMenu);
        menuBar.add(gameMenu);

        // Set the menu bar to the frame
//        setJMenuBar(menuBar);

        adminDashboardBackground.add(menuBar, BorderLayout.NORTH);
        adminDashboardBackground.add(mainDashboard, BorderLayout.SOUTH);
    }
}
