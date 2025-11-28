package linkCheck;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {
    @Test
    public void LinkTest(){
        var linktest=homePage.clickLink();
        linktest.clickLinkToProduct();
    }
}
