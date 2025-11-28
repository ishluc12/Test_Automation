package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOverProduct {
    private WebDriver driver;
    private By hover= By.className("product-overlay");


    public HoverOverProduct(WebDriver driver){
        this.driver=driver;
    }

    public void clickToHover(){
        WebElement element=driver.findElement(hover);
       Actions actions=new Actions(driver);
       actions.moveToElement(element).perform();

    }

}
