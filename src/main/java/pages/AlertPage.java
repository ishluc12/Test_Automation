package pages;

import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOk(){
        driver.switchTo().alert().accept();
    }
    public void clickCancel(){
        driver.switchTo().alert().dismiss();
    }
}
