package org.club;

import io.github.cdimascio.dotenv.Dotenv;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

/**
 * A utility class containing constants and helper methods for the sports club application.
 */
public class Constant {
    // Load environment variables from .env file
    static Dotenv dotenv = Dotenv.configure().load();

    // MongoDB's connection details
    static String database = dotenv.get("MONGO_DATABASE");
    static String user = dotenv.get("MONGO_USER");
    static String password = dotenv.get("MONGO_PASSWORD");
    static String cluster = dotenv.get("MONGO_CLUSTER");
    // Create the MongoDB connection string
    static String connectionString = "mongodb+srv://" + user + ":" + password + "@" + cluster + "/" + database;

    /* Colors */
    static Color btnColor = new Color(90, 90, 189);

    /**
     * Get the MongoDB connection string.
     *
     * @return MongoDB's connection string
     */
    public static String getConnectionString() {
        return connectionString;
    }

    /**
     * Helper method to resize an ImageIcon.
     *
     * @param image  The image to be set as an icon.
     * @param width  The width for the icon.
     * @param height The height for the icon.
     * @return ImageIcon
     */
    static ImageIcon resizeIcon(ImageIcon image, int width, int height) {
        Image icon = image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(icon);
    }

    /**
     * Set default look for all buttons.
     *
     * @param button The button to set the default look for.
     */
    public static void setJButton(JButton button) {
        button.setPreferredSize(new Dimension(80, 40));
        button.setOpaque(false); // Set the button to be non-opaque
        button.setContentAreaFilled(false); // Set the content area to be non-filled
        button.setBorderPainted(false); // Remove border painting
        button.setForeground(btnColor);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the cursor to a hand cursor when the mouse enters the button
                button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Change the cursor back to the default cursor when the mouse exits the button
                button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
    }

    /**
     * Set up JFrame with default settings.
     *
     * @param frame  The JFrame to set up.
     * @param title  The title of the frame.
     * @param width  The width of the frame.
     * @param height The height of the frame.
     */
    public static void setUpJFrame(JFrame frame, String title, int width, int height) {
        /* Set up the login frame */
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); /* Center the Login on the screen */
        frame.setVisible(true);
        /* TODO: Remember to remove the close operation */
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * Add a mouse listener to a label for focusing on a text field.
     *
     * @param label     The label to add a mouse listener to.
     * @param textField The text field to focus on when the label is clicked.
     */
    public static void lblAddMouseListener(JLabel label, JTextField textField) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.requestFocusInWindow();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setToolTipText("Password");
            }
        });
    }

    /**
     * Set Nimbus Look and Feel to a frame.
     *
     * @param frame The frame to set the look and feel.
     * @throws RuntimeException Throws a runtime exception if setting the look and feel fails.
     */
    public static void setLookAndFeel(JFrame frame) {
        try {
            /* set look and feel */
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            // Update the UI to use the chosen look and feel
            SwingUtilities.updateComponentTreeUI(frame);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Set icon for the frame.
     *
     * @param frame The frame to set the icon for.
     * @throws RuntimeException Throws a runtime exception if setting the frame icon fails.
     */
    public static void setFrameIcon(JFrame frame) {
        /* set icon for the frame */
        try {
            frame.setIconImage(ImageIO.read(new File("src/main/resources/images/club.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
