package org.club;

import javax.swing.*;
import java.awt.*;

public class ResourceLoader {
    public static final Image backgroundImage = new ImageIcon("src/main/resources/images/background.jpg").getImage();
    public static final ImageIcon loginImage = new ImageIcon("src/main/resources/images/club.png");
    public static final ImageIcon userIcon = new ImageIcon("src/main/resources/images/user.png");
    public static ImageIcon passwdIcon = new ImageIcon("src/main/resources/images/password.png");

    public ResourceLoader() {
    }
}
