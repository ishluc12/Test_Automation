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
    private By dataOfbirth= By.id("days");
    private By chooseDay=By.cssSelector("#form > div > div > div > div > form > div:nth-child(6) > div > div:nth-child(1)");
    public EnterContactPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectDropDown(String option){
      findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getDateOfMonth(){
//        Select select= new Select(driver.findElement(chooseDay));
//        List<WebElement> list= select.getOptions();
//        List<String> options= new ArrayList<>();
//        for(WebElement element: list){
//            options.add(element.getText());
//        }
//        return options;
        List<WebElement> dateOfMonth=findDropDownElement().getAllSelectedOptions();
            return dateOfMonth.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findDropDownElement(){
        return new Select(driver.findElement(dataOfbirth));
    }
}
