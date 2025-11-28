package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ModalPage {
    private WebDriver driver;
    private By modal=By.cssSelector("#cartModal > div > div");
    private By goCart=By.cssSelector("#cartModal > div > div > div.modal-body > p:nth-child(2) > a > u");

    public ModalPage(WebDriver driver){
        this.driver=driver;
    }

    public String clickToGetMessage(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(modal));
        return driver.findElement(modal).getText();
    }

}
