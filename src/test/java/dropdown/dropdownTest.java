package dropdown;

import BaseTest.BaseTest;
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

        contactPage.selectDropDown("1");

        assertEquals(contactPage.getDateOfMonth().size(), 1);
        assertTrue(contactPage.getDateOfMonth().contains("1"));
    }
}
