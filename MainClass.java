package com.atypon;

import com.atypon.gui.Login;
import javax.swing.JPanel;

/**
 * The main class that runs the whole 'user' project.
 */
public class MainClass {
  private final JPanel panelMain = new JPanel();
    public static void main(String[] args) {
        // Run the login window.
        Login.runLogin();
    }

}
