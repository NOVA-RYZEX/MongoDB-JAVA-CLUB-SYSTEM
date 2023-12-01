package org.club;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * A custom JPanel class for setting a background image.
 */
public class SetBackgroundImage extends JPanel {
    /**
     * Overrides the paintComponent method to paint the background image.
     *
     * @param g The Graphics object used for painting.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Check if the background image is available
        if (ResourceLoader.backgroundImage != null) {
            // Get the panel dimensions
            int panelWidth = this.getWidth();
            int panelHeight = this.getHeight();

            // Create a BufferedImage with the panel dimensions
            BufferedImage bufferedImage = new BufferedImage(panelWidth, panelHeight, BufferedImage.TYPE_INT_ARGB);

            // Get a graphics context for the bufferedImage
            Graphics2D bufferedGraphics = bufferedImage.createGraphics();

            // Scale and draw the background image to fit the panel's dimensions
            bufferedGraphics.drawImage(ResourceLoader.backgroundImage, 0, 0, panelWidth, panelHeight, this);

            // Dispose of the graphics context
            bufferedGraphics.dispose();

            // Draw the buffered image to the panel
            g.drawImage(bufferedImage, 0, 0, this);
        }
    }
}
