package login;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class loginTest extends BaseTest {
    @Test
    public void loginTest(){
        var login=homePage.clickToLogin();
        login.setUsername("jlucish@gmail.com");
        login.setPassword("12345Luc!");
        login.clickLogin();
    }

}
