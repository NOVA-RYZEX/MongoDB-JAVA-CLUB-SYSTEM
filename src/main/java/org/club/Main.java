package org.club;

import javax.swing.*;

/**
 * @author GKY
 * @version 1.0 (26 Nov 2023)
 */
public class Main {
    public static void main(String[] args) {
        /*Load the required resources*/
        new ResourceLoader();
        /*TODO: make program start with Login*/
        SwingUtilities.invokeLater(Login::new);
    }
}