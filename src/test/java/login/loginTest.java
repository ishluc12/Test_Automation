package login;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class loginTest extends BaseTest {
    @Test
    public void loginTest(){
        var login=homePage.clickToLogin();
        login.setUsername("jlucish@gmail.com");
        login.setPassword("12345Luc!");

        var success= login.clickAfterLogin();
        String successfulMessage= success.getTextOnLandingPage();
        assertTrue("Incorrect credential", successfulMessage.contains("AutomationExercise"));
    }

}
