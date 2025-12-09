package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickCancel(){
        driver.switchTo().alert().dismiss();
    }
    public GetInTouchPage clickToSuccessfull(){
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("h2.title.text-center")).getText();
        return new GetInTouchPage(driver);
    }
}
