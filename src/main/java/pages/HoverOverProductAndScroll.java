package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOverProductAndScroll {
    private WebDriver driver;
    private By hover= By.className("product-overlay");
    private By addProduct=By.linkText("Add to cart");


    public HoverOverProductAndScroll(WebDriver driver){
        this.driver=driver;
    }

    public void clickToHover(){
        WebElement element=driver.findElement(hover);
        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public ModalPage hoverOverProductModal(){
        WebElement element =  driver.findElement(addProduct);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        element.click();
        return new ModalPage(driver);
    }

}