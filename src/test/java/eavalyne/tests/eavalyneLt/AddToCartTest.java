package eavalyne.tests.eavalyneLt;

import eavalyne.pages.eavalyneLt.AddToCartPage;
import eavalyne.tests.TestBase;
import org.testng.annotations.BeforeMethod;

public class AddToCartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp(){
        super.setUp();
        AddToCartPage.open("https://eavalyne.lt/p/rankine-pinko-love-bell-classic-silmpy-2-cl-ai-22-23-1p22u1-y5h7-black-z99o");
        AddToCartPage.acceptPrivacyConfirmation();
    }
}
