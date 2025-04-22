/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainprogpoe;

/**
 *
 * @author lab_services_student
 */
//LogIn class to verify after sign in
//(Farrel, 2022)
public class LogIn {
    // Stored credentials
    private final String storedUsername;
    private final String storedPassword;
    private final String storedCell;

    //Constructor
    public LogIn(String storedUsername, String storedPassword, String storedCell) {
        this.storedUsername = storedUsername;
        this.storedPassword = storedPassword;
        this.storedCell = storedCell;
    }

    //Verifies user input matches stored info
    public boolean verifyLogin(String inputUsername, String inputPassword, String inputCell) {
        return inputUsername.equals(storedUsername)
            && inputPassword.equals(storedPassword)
            && inputCell.equals(storedCell);
    }
}


