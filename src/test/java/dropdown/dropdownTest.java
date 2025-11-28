package dropdown;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropdownTest extends BaseTest {
    @Test
    public void dropdownTest(){
        var dropdownTest=homePage.clickDropDowns();
        dropdownTest.setName("Lucas");
        dropdownTest.setEmail("ki@gmail.com");
        var listDropdown=dropdownTest.clickToFillForm();
        listDropdown.getDateOfMonth();
//        Assert.assertEquals();
    }

}
