package org.club;

import javax.swing.*;

/**
 * The main class of the sports club application.
 *
 * @author GKY
 * @version 1.0 (26 Nov 2023)
 */
public class Main {
    /**
     * The main method of the application, responsible for starting the program.
     *
     * @param args The command-line arguments (unused in this application).
     */
    public static void main(String[] args) {
        /* Load the required resources */
        new ResourceLoader();

        /* TODO: Make the program start with the Login screen */
        SwingUtilities.invokeLater(Login::new);
    }
}
