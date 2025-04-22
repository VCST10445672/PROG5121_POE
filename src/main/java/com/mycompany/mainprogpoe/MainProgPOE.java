/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainprogpoe;

/**
 *
 * @author lab_services_student
 */

//Main Class, from here you navagate to the other screens
//(Farrel, 2022)
import javax.swing.JOptionPane;

public class MainProgPOE {
    public static void main(String[] args) {
        // Menu options
        String[] options = {"LogIn", "SignIn", "Quit"};
        boolean signedIn = false; // Tracks if user has signed in
        SignIn user = null; // Holds user data

        // Main program loop
        while (true) {
            // Display menu
            int choice = JOptionPane.showOptionDialog(
                null, "Select an option:", "Main Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]
            );

            // Handle menu selection
            switch (choice) {
                case 0 -> { // LogIn
                    if (!signedIn) {
                        JOptionPane.showMessageDialog(null, "Please Sign In first.");
                    } else {
                        // Create login object using signed in user details
                        LogIn login = new LogIn(
                            user.getUsername(),
                            user.getPassword(),
                            user.getCellNumber()
                        );

                        // Prompt user to log in and verify
                        String inputUsername = JOptionPane.showInputDialog("Enter your username:");
                        String inputPassword = JOptionPane.showInputDialog("Enter your password:");
                        String inputCell = JOptionPane.showInputDialog("Enter your cell number:");

                        if (login.verifyLogin(inputUsername, inputPassword, inputCell)) {
                            JOptionPane.showMessageDialog(null, "Welcome to Quick Chat!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid credentials.");
                        }
                    }
                }
                case 1 -> { // SignIn
                    user = new SignIn(); // Create new user
                    signedIn = user.signUp(); // Collect and validate user info
                }
                case 2 -> System.exit(0); // Quit
            }
        }
    }
}

