package eavalyne.tests.eavalyneLt;

import eavalyne.pages.eavalyneLt.AddToCartPage;
import eavalyne.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp(){
        super.setUp();
        AddToCartPage.open("https://eavalyne.lt/p/rankine-pinko-love-bell-classic-silmpy-2-cl-ai-22-23-1p22u1-y5h7-black-z99o");
        AddToCartPage.acceptPrivacyConfirmation();
    }

    @Test
    private void addToCartItem(){

        String expectedRezult = "Pinko";
        String actualRezult = null;

        AddToCartPage.clickOnAddButton();
        AddToCartPage.clickOnIKrepseli();
        AddToCartPage.waitForCartPage();

        actualRezult= AddToCartPage.readPage();
        Assert.assertTrue(actualRezult.contains(expectedRezult),
                String.format("Actual [%s]; Expected [%s]",
                        actualRezult,
                        expectedRezult)
        );
    }
}
