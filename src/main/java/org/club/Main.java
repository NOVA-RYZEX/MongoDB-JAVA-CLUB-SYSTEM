package org.club;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*Load the required resources*/
        new ResourceLoader();
        /*TODO: make program start with Login*/
        SwingUtilities.invokeLater(Login::new);
    }
}