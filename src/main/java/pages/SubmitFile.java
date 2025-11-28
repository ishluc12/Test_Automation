package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubmitFile {
    private WebDriver driver;
    private By nameField= By.cssSelector("#contact-us-form > div:nth-child(2) > input");
    private By emailField= By.cssSelector("#contact-us-form > div:nth-child(3) > input");
    private By subjectField=By.cssSelector("#contact-us-form > div:nth-child(4) > input");
    private By messageField=By.cssSelector("#message");

    private By fileUploadField=By.cssSelector("#contact-us-form > div:nth-child(6) > input");
    private By fileField=By.cssSelector("#contact-us-form > div:nth-child(6)");
    private By submitForm=By.cssSelector("#contact-us-form > div:nth-child(7) > input");


    public SubmitFile(WebDriver driver){
        this.driver=driver;
    }

    public void setName(String name){
        driver.findElement(nameField).sendKeys(name);
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setSubject(String subject){
        driver.findElement(subjectField).sendKeys(subject);
    }
    public void setMessage(String message){
        driver.findElement(messageField).sendKeys(message);
    }
    public void clickToUpload(){
        driver.findElement(fileField).click();
    }

    public void clickToUploadFile(String file){
        driver.findElement(fileUploadField).sendKeys(file);
        clickToUpload();
    }



    public AlertPage clickAlertOk(){
        driver.findElement(submitForm).click();
        return new AlertPage(driver);
    }
}
