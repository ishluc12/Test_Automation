package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By emailField=By.cssSelector(".login-form input[type=email]");
    private By PasswordField=By.cssSelector(".login-form input[type=password]");
    private By loginButton=By.cssSelector(".login-form button[type=submit]");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUsername(String username){
        driver.findElement(emailField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(PasswordField).sendKeys(password);
    }
    public LandingPage clickAfterLogin(){
        driver.findElement(loginButton).click();
        return new LandingPage(driver);
    }
}
