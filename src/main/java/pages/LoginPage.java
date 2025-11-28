package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By loginForm=By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2");
    private By enailField=By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=email]:nth-child(2)");
    private By PasswordField=By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=password]:nth-child(3)");
    private By loginButton=By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void getLoginForm(){
        driver.findElement(loginForm).click();
    }

    public void setUsername(String username){
        driver.findElement(enailField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(PasswordField).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
}
