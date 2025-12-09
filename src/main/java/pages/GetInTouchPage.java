package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetInTouchPage {
    private WebDriver driver;
    private By successMessage = By.cssSelector("div.status.alert.alert-success");

    public GetInTouchPage(WebDriver driver){
            this.driver = driver;
    }
    public String getFinalText(){
        return driver.findElement(successMessage).getText();
    }
}
