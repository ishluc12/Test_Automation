package dropdown;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class dropdownTest extends BaseTest {

    @Test
    public void dropdownTest(){
        var dropdownPage = homePage.clickDropDowns();
        dropdownPage.setName("Lucas");
        dropdownPage.setEmail("kiku@gmail.com");

        var contactPage = dropdownPage.clickToFillForm();

        contactPage.choseGender("Mr");
        contactPage.SetPassword("@@Lucas1212");
        contactPage.selectDay("1");
        contactPage.selectMonth("January");
        contactPage.selectYear("1990");

        assertEquals(contactPage.selectedDay(), "1");
        assertEquals(contactPage.selectedMonth(), "January");
        assertEquals(contactPage.selectedYear(), "1990");
    }
}
