package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class    LandingPage {
    private WebDriver driver;
    private By landing= By.id("slider-carousel");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTextOnLandingPage(){
        return driver.findElement(landing).getText();
    }
}
