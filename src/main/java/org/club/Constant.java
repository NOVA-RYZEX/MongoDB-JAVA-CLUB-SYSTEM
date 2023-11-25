package org.club;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class Constant {
    /**
     * Helper method to resize an ImageIcon
     *
     * @param image  image to be set as icon
     * @param width  width for the icon
     * @param height height for the icon
     * @return ImageIcon
     */
    static ImageIcon resizeIcon(ImageIcon image, int width, int height) {
        Image icon = image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(icon);
    }

    /**
     * set default look for all buttons
     *
     * @param button button
     */
    public static void setJButton(JButton button) {
        button.setPreferredSize(new Dimension(80, 40));
        button.setOpaque(false); // Set the button to be non-opaque
        button.setContentAreaFilled(false); // Set the content area to be non-filled
        button.setBorderPainted(false); // Remove border painting
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
     * set NimbusLookAndFeel to a frame
     *
     * @param frame frame to set look and feel
     * @throws RuntimeException throws a runtime exceptions
     */
    public static void setLookAndFeel(JFrame frame) {
        try {
            /*set look and feel*/
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            // Update the UI to use the chosen look and feel
            SwingUtilities.updateComponentTreeUI(frame);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * set NimbusLookAndFeel to a frame
     *
     * @param frame frame to set icon
     * @throws RuntimeException throws a runtime exceptions
     */
    public static void setFrameIcon(JFrame frame) {
        /*set icon for the frame*/
        try {
            frame.setIconImage(ImageIO.read(new File("src/main/resources/images/club.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
