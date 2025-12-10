package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EnterContactPage {
    private WebDriver driver;
    private By maleRadio = By.id("uniform-id_gender1");
    private By femaleRadio = By.id("uniform-id_gender2");
    private By passworField= By.id("password");
    private By dayOfbirth= By.id("days");
    private By monthOfbirth= By.id("months");
    private By yearOfbirth= By.id("years");


    public EnterContactPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean choseGender(String gender){
        if(gender.equalsIgnoreCase("Mr")){
            WebElement male=driver.findElement(maleRadio);
            male.click();
            return male.isSelected();
        } else if(gender.equalsIgnoreCase("Mrs")){
            WebElement female=driver.findElement(femaleRadio);
            female.click();
            return female.isSelected();
        }
        return false;
    }
    public void SetPassword(String password){
        driver.findElement(passworField).clear();
        driver.findElement(passworField).sendKeys(password);
    }
    public void selectDay(String day){
        new Select(driver.findElement(dayOfbirth)).selectByVisibleText(day);
    }
    public void selectMonth(String month){
        new Select(driver.findElement(monthOfbirth)).selectByVisibleText(month);
    }
    public void selectYear(String year){
        new Select(driver.findElement(yearOfbirth)).selectByVisibleText(year);
    }

    public String selectedDay(){
        return new Select(driver.findElement(dayOfbirth)).getFirstSelectedOption().getText();
    }
    public String selectedMonth(){
        return new Select(driver.findElement(monthOfbirth)).getFirstSelectedOption().getText();
    }
    public String selectedYear(){
        return new Select(driver.findElement(yearOfbirth)).getFirstSelectedOption().getText();
    }
    public List<String> getDateOfMonth(){

        List<WebElement> dateOfMonth= new Select(driver.findElement(dayOfbirth)).getAllSelectedOptions();
        return dateOfMonth.stream().map(WebElement::getText).collect(Collectors.toList());
    }

}
