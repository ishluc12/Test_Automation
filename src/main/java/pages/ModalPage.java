package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ModalPage {
    private WebDriver driver;
    private By addCart=By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > span > button");

    public ModalPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickToAddCart(){
        driver.findElement(addCart).click();
    }
}
