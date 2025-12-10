package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOk(){
        driver.switchTo().alert().accept();
    }

}
