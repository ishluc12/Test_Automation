package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownPage {
    private WebDriver driver;
    private By signupForm=By.cssSelector("#form > div > div > div:nth-child(3) > div");
    private By nameField=By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)");
    private By emailField=By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    private By signupField=By.cssSelector("");
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
        driver.findElement(signupForm).click();
        return new EnterContactPage(driver);
    }

}
