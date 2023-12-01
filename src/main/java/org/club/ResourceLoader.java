package org.club;

import javax.swing.*;
import java.awt.*;

/**
 * A utility class for loading resources such as images for the sports club application.
 */
public class ResourceLoader {
    /**
     * The background image for the application.
     */
    public static final Image backgroundImage = new ImageIcon("src/main/resources/images/background.jpg").getImage();

    /**
     * The image used for the login screen.
     */
    public static final ImageIcon loginImage = new ImageIcon("src/main/resources/images/club.png");

    /**
     * The icon representing a user in the application.
     */
    public static final ImageIcon userIcon = new ImageIcon("src/main/resources/images/user.png");

    /**
     * The icon representing a password in the application.
     */
    public static ImageIcon passwdIcon = new ImageIcon("src/main/resources/images/password.png");

    /**
     * The icon representing the option to show a password.
     */
    public static ImageIcon showIcon = new ImageIcon("src/main/resources/images/show.png");

    /**
     * The icon representing the option to hide a password.
     */
    public static ImageIcon hideIcon = new ImageIcon("src/main/resources/images/hide.png");

    /**
     * The icon representing a forgotten password.
     */
    public static ImageIcon forgotIcon = new ImageIcon("src/main/resources/images/forgot.png");

    /**
     * Default constructor for the ResourceLoader class.
     */
    public ResourceLoader() {
        // No initialization required in the constructor
    }
}
