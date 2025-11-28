package hover;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class HoveTest extends BaseTest {
    @Test
    public void hoverOverProduct(){
        var hover=homePage.moveTohover();
        hover.clickToHover();
    }
}
