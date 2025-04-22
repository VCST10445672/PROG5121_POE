/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

//The test uinit was automaticly done by NetBeans

import com.mycompany.mainprogpoe.SignIn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SignInTest {

    @Test
    public void testValidUsername() {
        SignIn signIn = new SignIn();
        assertTrue(signIn.setUsername("abc_1"));
    }

    @Test
    public void testInvalidUsername() {
        SignIn signIn = new SignIn();
        assertFalse(signIn.setUsername("invalidUser"));
    }

    @Test
    public void testValidPassword() {
        SignIn signIn = new SignIn();
        assertTrue(signIn.setPassword("Secure1!"));
    }

    @Test
    public void testInvalidPassword() {
        SignIn signIn = new SignIn();
        assertFalse(signIn.setPassword("weakpass"));
    }

    @Test
    public void testValidCellNumber() {
        SignIn signIn = new SignIn();
        assertTrue(signIn.setCellNumber("+27831234567"));
    }

    @Test
    public void testInvalidCellNumber() {
        SignIn signIn = new SignIn();
        assertFalse(signIn.setCellNumber("0831234567"));
    }
}

