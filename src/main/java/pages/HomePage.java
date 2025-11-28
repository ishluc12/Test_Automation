package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.net.ssl.HostnameVerifier;

public class HomePage {
    private WebDriver driver;
    private By loginAndLogout=By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");
    private By cartLink=By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(3) > a");
    private By productHover=By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a");
    private By contactForm= By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a");


    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickToLogin(){
        driver.findElement(loginAndLogout).click();
        return new LoginPage(driver);
    }

    public CartPage clickLink(){
        driver.findElement(cartLink).click();
        return new CartPage(driver);
    }
    public DropDownPage clickDropDowns(){
        driver.findElement(loginAndLogout).getText();
        return new DropDownPage(driver);
    }

    public SubmitFile clickTosubmit(){
        driver.findElement(contactForm).click();
        return new SubmitFile(driver);
    }
    public HoverOverProduct moveTohover(){
        driver.findElement(productHover).click();
        return new HoverOverProduct(driver);
    }

}
