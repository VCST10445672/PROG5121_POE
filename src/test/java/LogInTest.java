/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

//The test uinit was automaticly done by NetBeans

import com.mycompany.mainprogpoe.LogIn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogInTest {

    @Test
    public void testSuccessfulLogin() {
        LogIn login = new LogIn("abc_1", "Secure1!", "+27831234567");
        assertTrue(login.verifyLogin("abc_1", "Secure1!", "+27831234567"));
    }

    @Test
    public void testLoginWithWrongUsername() {
        LogIn login = new LogIn("abc_1", "Secure1!", "+27831234567");
        assertFalse(login.verifyLogin("wrong", "Secure1!", "+27831234567"));
    }

    @Test
    public void testLoginWithWrongPassword() {
        LogIn login = new LogIn("abc_1", "Secure1!", "+27831234567");
        assertFalse(login.verifyLogin("abc_1", "wrong", "+27831234567"));
    }

    @Test
    public void testLoginWithWrongCell() {
        LogIn login = new LogIn("abc_1", "Secure1!", "+27831234567");
        assertFalse(login.verifyLogin("abc_1", "Secure1!", "0831234567"));
    }
}

