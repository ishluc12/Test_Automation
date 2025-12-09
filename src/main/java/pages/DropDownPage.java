package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownPage {
    private WebDriver driver;
    private By signupForm=By.cssSelector("#form > div > div > div:nth-child(3) > div");
    private By nameField=By.cssSelector(".signup-form input[type=text]");
    private By emailField=By.cssSelector(".signup-form input[type=email]");
    private By signupField=By.cssSelector(".signup-form button[type=submit]");
    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }
    public void setName(String name){
        driver.findElement(nameField).sendKeys(name);
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public EnterContactPage clickToFillForm(){
        driver.findElement(signupField).click();
        return new EnterContactPage(driver);
    }

}
