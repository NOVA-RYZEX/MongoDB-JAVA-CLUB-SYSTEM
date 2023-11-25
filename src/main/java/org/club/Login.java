package org.club;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    public Login() {
        Constant.setLookAndFeel(this);
        Constant.setFrameIcon(this);
        SwingUtilities.invokeLater(this::initializeLoginUI);
    }

    private void initializeLoginUI() {
        /*set up the login frame*/
        this.setTitle("Login");
        this.setSize(500, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null); // center the Login in the screen
        this.setVisible(true); // display the Login
        /*TODO: remember to remove the close operation*/
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*set the background*/
        SetBackgroundImage loginBackground = new SetBackgroundImage();
        this.getContentPane().add(loginBackground);

        /*Login components*/
        /*declare the components*/
        JPanel pLoginImage;
        JPanel pMain;
        JPanel pButton;
        JLabel lblLoginImage;
        JLabel lblUsername;
        JTextField txtUsername;
        JLabel lblPassword;
        JPasswordField txtPassword;
        JCheckBox chkShowPassword;
        JButton btnResetPassword;
        JButton btnLogin;
        JButton btnRegister;

        /*the pLoginImage*/
        pLoginImage = new JPanel();
        pLoginImage.setPreferredSize(new Dimension(500, 160));
        pLoginImage.setOpaque(false); // Make the panel transparent

        lblLoginImage = new JLabel();
        lblLoginImage.setIcon(Constant.resizeIcon(ResourceLoader.loginImage, 170, 170));

        pLoginImage.add(lblLoginImage);

        /*the pMain*/
        pMain = new JPanel();
        pMain.setLayout(null);
        pMain.setPreferredSize(new Dimension(500, 230));
        pMain.setOpaque(false); // Make the panel transparent

        lblUsername = new JLabel();
        lblUsername.setBounds(10, 0, 120, 120);
        lblUsername.setIcon(Constant.resizeIcon(ResourceLoader.userIcon, 60, 60));
        txtUsername = new JTextField();
        txtUsername.setBounds(75, 30, 400, 60);

        lblPassword = new JLabel();
        lblPassword.setBounds(10, 70, 120, 120);
        lblPassword.setIcon(Constant.resizeIcon(ResourceLoader.passwdIcon, 60, 60));
        txtPassword = new JPasswordField();
        txtPassword.setBounds(75, 100, 400, 60);
        txtPassword.setEchoChar('*');

        pMain.add(lblUsername);
        pMain.add(txtUsername);
        pMain.add(lblPassword);
        pMain.add(txtPassword);

        /*the pButtons*/
        pButton = new JPanel();
        pButton.setPreferredSize(new Dimension(500, 110));
        pButton.setOpaque(false); // Make the panel transparent

        btnLogin = new JButton("LOGIN");
        Constant.setJButton(btnLogin);
        btnLogin.setPreferredSize(new Dimension(100, 50));
        btnRegister = new JButton("REGISTER");
        Constant.setJButton(btnRegister);
        btnRegister.setPreferredSize(new Dimension(100, 50));

        pButton.add(btnLogin);
        pButton.add(btnRegister);

        /*add to the frame*/
        loginBackground.add(pLoginImage, BorderLayout.NORTH);
        loginBackground.add(pMain, BorderLayout.CENTER);
        loginBackground.add(pButton, BorderLayout.SOUTH);
    }
}
