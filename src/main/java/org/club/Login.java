package org.club;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Represents a login window for a sports club system.
 */
public class Login extends JFrame {

    /**
     * Panel for login image.
     */
    JPanel pLoginImage;

    /**
     * Main panel containing UI components.
     */
    JPanel pMain;

    /**
     * Panel containing buttons.
     */
    JPanel pButton;

    /**
     * Label for login image.
     */
    JLabel lblLoginImage;

    /**
     * Label for username.
     */
    JLabel lblUsername;

    /**
     * Text field for username input.
     */
    JTextField txtUsername;

    /**
     * Label for password.
     */
    JLabel lblPassword;

    /**
     * Password field for password input.
     */
    JPasswordField txtPassword;

    /**
     * Checkbox for showing password.
     */
    JCheckBox chkShowPassword;

    /**
     * Button for resetting password.
     */
    JButton btnResetPassword;

    /**
     * Button for login action.
     */
    JButton btnLogin;

    /**
     * Button for registration.
     */
    JButton btnRegister;

    /**
     * Constructs a new Login window.
     *
     * @see Constant for the constant methods
     */
    public Login() {
        Constant.setLookAndFeel(this);
        Constant.setFrameIcon(this);
        SwingUtilities.invokeLater(this::initializeLoginUI);
    }

    /**
     * Authenticates a user against the admin collection in MongoDB.
     *
     * @param connectionString The MongoDB connection string.
     * @param enteredUsername  The username entered by the user.
     * @param enteredPassword  The password entered by the user.
     * @return True if the authentication is successful, false otherwise.
     */
    public static boolean authenticateUser(String connectionString, String enteredUsername, String enteredPassword) {
        try {
            // Set up MongoClient settings
            MongoClient mongoClient = MongoClients.create(connectionString);
            // Access the 'sports_club_system' database
            MongoDatabase database = mongoClient.getDatabase("sports_club_system");
            // Access the 'admin' collection
            MongoCollection<Document> adminCollection = database.getCollection("admin");
            // Create a query to find the user with the provided username and password
            Document query = new Document("username", enteredUsername).append("password", enteredPassword);
            // Execute the query
            Document foundUser = adminCollection.find(query).first();
            // Close the MongoClient when done
            mongoClient.close();
            // Check if the user was found
            return foundUser != null;
        } catch (Exception e) {
            // Handle connection errors
            System.err.println("Authentication failed: " + e.getMessage());
            return false;
        }
    }

    /**
     * Initializes the UI components of the login window.
     */
    private void initializeLoginUI() {
        /* Set up the login frame */
        Constant.setUpJFrame(this, "Login Page", 500, 500);
        /* Set the background */
        SetBackgroundImage loginBackground = new SetBackgroundImage();
        this.getContentPane().add(loginBackground);

        /* The pLoginImage */
        pLoginImage = new JPanel();
        pLoginImage.setPreferredSize(new Dimension(500, 160));
        pLoginImage.setOpaque(false);
        lblLoginImage = new JLabel();
        lblLoginImage.setIcon(Constant.resizeIcon(ResourceLoader.loginImage, 170, 170));
        pLoginImage.add(lblLoginImage);

        /* The pMain */
        pMain = new JPanel();
        pMain.setLayout(null);
        pMain.setPreferredSize(new Dimension(500, 230));
        pMain.setOpaque(false);

        lblUsername = new JLabel();
        lblUsername.setBounds(10, 0, 120, 120);
        lblUsername.setIcon(Constant.resizeIcon(ResourceLoader.userIcon, 60, 60));
        txtUsername = new JTextField();
        txtUsername.setBounds(75, 30, 400, 60);
        Constant.lblAddMouseLister(lblUsername, txtUsername);

        lblPassword = new JLabel();
        lblPassword.setBounds(10, 70, 120, 120);
        lblPassword.setIcon(Constant.resizeIcon(ResourceLoader.passwdIcon, 60, 60));
        txtPassword = new JPasswordField();
        txtPassword.setBounds(75, 100, 400, 60);
        txtPassword.setEchoChar('*');
        Constant.lblAddMouseLister(lblPassword, txtPassword);

        chkShowPassword = new JCheckBox();
        chkShowPassword.setIcon(Constant.resizeIcon(ResourceLoader.hideIcon, 20, 20));
        chkShowPassword.setBounds(72, 180, 150, 30);
        chkShowPassword.setText("SHOW PASSWORD");
        chkShowPassword.setFont(new Font("Segoe", Font.BOLD, 12));
        chkShowPassword.setForeground(Constant.btnColor);
        chkShowPassword.setContentAreaFilled(false);
        chkShowPassword.setBorderPainted(false);
        chkShowPassword.setFocusPainted(false);
        chkShowPassword.addActionListener(e -> {
            if (txtPassword.getEchoChar() == '*') {
                txtPassword.setEchoChar((char) 0);
                chkShowPassword.setIcon(Constant.resizeIcon(ResourceLoader.showIcon, 20, 20));
            } else {
                txtPassword.setEchoChar('*');
                chkShowPassword.setIcon(Constant.resizeIcon(ResourceLoader.hideIcon, 20, 20));
            }
        });
        chkShowPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtPassword.requestFocusInWindow();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                chkShowPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                chkShowPassword.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        btnResetPassword = new JButton("FORGOT PASSWORD?");
        btnResetPassword.setIcon(Constant.resizeIcon(ResourceLoader.forgotIcon, 20, 20));
        btnResetPassword.setBounds(295, 180, 190, 30);
        Constant.setJButton(btnResetPassword);

        pMain.add(lblUsername);
        pMain.add(txtUsername);
        pMain.add(lblPassword);
        pMain.add(txtPassword);
        pMain.add(chkShowPassword);
        pMain.add(btnResetPassword);

        /* The pButtons */
        pButton = new JPanel();
        pButton.setPreferredSize(new Dimension(500, 110));
        pButton.setOpaque(false);
        btnLogin = new JButton("LOGIN");
        Constant.setJButton(btnLogin);
        btnLogin.addActionListener(initializeLoginProcess -> {
            String enteredUsername = getUsernameFromUI();
            String enteredPassword = getPasswordFromUI();
            boolean loginSuccessful = authenticateUser(Constant.getConnectionString(), enteredUsername, enteredPassword);
            if (loginSuccessful) {
                JOptionPane.showMessageDialog(null, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                SwingUtilities.invokeLater(AdminDashboard::new);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        btnLogin.setPreferredSize(new Dimension(100, 50));
        btnRegister = new JButton("REGISTER");
        Constant.setJButton(btnRegister);
        btnRegister.setPreferredSize(new Dimension(100, 50));
        pButton.add(btnLogin);
        pButton.add(btnRegister);

        /* Add components to the frame */
        loginBackground.add(pLoginImage, BorderLayout.NORTH);
        loginBackground.add(pMain, BorderLayout.CENTER);
        loginBackground.add(pButton, BorderLayout.SOUTH);
    }

    /**
     * Retrieves the username entered by the user.
     *
     * @return The entered username.
     */
    private String getUsernameFromUI() {
        return txtUsername.getText();
    }

    /**
     * Retrieves the password entered by the user.
     *
     * @return The entered password.
     */
    private String getPasswordFromUI() {
        return new String(txtPassword.getPassword());
    }
}
