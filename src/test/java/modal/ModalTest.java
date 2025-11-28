package modal;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import java.awt.image.BaseMultiResolutionImage;

public class ModalTest extends BaseTest {
    @Test
    public void clickToSeeModel(){
        var modelTerminate=homePage.clickToSeeModel();
        modelTerminate.clickToAddCart();
    }
}
