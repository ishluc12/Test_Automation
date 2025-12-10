package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubmitFile {
    private WebDriver driver;
    private By nameField        = By.name("name");
    private By emailField       = By.name("email");
    private By subjectField     = By.name("subject");
    private By messageField     = By.id("message");

    private By fileUploadField=By.cssSelector("input[name='upload_file']");
    private By fileField=By.className(("form-control"));
    private By submitForm       = By.cssSelector("input[type='submit']");



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
