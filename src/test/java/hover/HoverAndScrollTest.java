package hover;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HoverAndScrollTest extends BaseTest {
    @Test
    public void hoverOverProduct(){
        var hover=homePage.moveTohover();
        hover.clickToHover();
        var hoverAndAddCart=hover.hoverOverProductModal();
        String getMessage= hoverAndAddCart.clickToGetMessage();
        assertTrue(getMessage.contains("Your product has been added to cart."), "Incorrect link");
    }
}