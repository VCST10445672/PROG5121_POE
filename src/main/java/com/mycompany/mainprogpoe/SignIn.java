/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainprogpoe;

/**
 *
 * @author lab_services_student
 */

//SignIn class to get user info
//Use bolean for test result
//(Farrel, 2022)
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class SignIn {
    // User data
    private String username;
    private String password;
    private String cellNumber;

    //Sign up method to asks for all info
    public boolean signUp() {
        String inputUsername = JOptionPane.showInputDialog("Enter a username:");
        if (!setUsername(inputUsername)) return false;

        String inputPassword = JOptionPane.showInputDialog("Enter a password:");
        if (!setPassword(inputPassword)) return false;

        String inputCell = JOptionPane.showInputDialog("Enter your cell number:");
        return setCellNumber(inputCell); //Final step
    }

    //Username must contain "_" and be <= 5 characters
    public boolean setUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            this.username = username;
            JOptionPane.showMessageDialog(null, "Username successfully captured.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted. It must contain an underscore and be no more than 5 characters.");
            return false;
        }
    }

    //Password must be strong: 8+ chars, 1 uppercase, 1 digit, 1 special
    public boolean setPassword(String password) {
        String pattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$";
        if (Pattern.matches(pattern, password)) {
            this.password = password;
            JOptionPane.showMessageDialog(null, "Password successfully captured.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted. It must be at least 8 characters, include a capital letter, a number, and a special character.");
            return false;
        }
    }

    //Cell number must include country code and be between 11-13 digits
    public boolean setCellNumber(String cellNumber) {
        if (cellNumber.startsWith("+") && cellNumber.length() >= 11 && cellNumber.length() <= 13) {
            this.cellNumber = cellNumber;
            JOptionPane.showMessageDialog(null, "Cell number successfully captured.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Cell number is incorrectly formatted. It must include a country code like +27.");
            return false;
        }
    }

    //Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCellNumber() {
        return cellNumber;
    }
}

