package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By linkToproduct= By.cssSelector("a[href='/products']");
    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickLinkToProduct(){
        driver.findElement(linkToproduct).click();
    }

}
