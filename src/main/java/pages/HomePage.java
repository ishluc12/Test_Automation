package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.net.ssl.HostnameVerifier;

public class HomePage {
    private WebDriver driver;
    private By loginAndLogout=By.cssSelector("a[href='/login']");
    private By cartLink=By.cssSelector("a[href='/view_cart']");
    private By productHover=By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a");
    private By contactForm= By.cssSelector("a[href='/contact_us");


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
        driver.findElement(loginAndLogout).click();
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

    public ModalPage clickToSeeModel(){
        driver.findElement(productHover).click();
        return new ModalPage(driver);
    }

}
