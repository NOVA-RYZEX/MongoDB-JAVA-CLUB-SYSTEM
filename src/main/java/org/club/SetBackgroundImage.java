package org.club;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class SetBackgroundImage extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (ResourceLoader.backgroundImage != null) {
            /*get the panel dimensions*/
            int panelWidth = this.getWidth();
            int panelHeight = this.getHeight();
            /*create a BufferedImage with the panel dimensions*/
            BufferedImage bufferedImage = new BufferedImage(panelWidth, panelHeight, BufferedImage.TYPE_INT_ARGB);
            /*get a graphics context for the bufferedImage*/
            Graphics2D bufferedGraphics = bufferedImage.createGraphics();
            /*scale and draw the background image to fit the panel's dimensions*/
            bufferedGraphics.drawImage(ResourceLoader.backgroundImage, 0, 0, panelWidth, panelHeight, this);
            /*dispose of the graphics context*/
            bufferedGraphics.dispose();
            /* Draw the buffered image to the panel*/
            g.drawImage(bufferedImage, 0, 0, this);
        }
    }
}
