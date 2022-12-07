package eavalyne.tests.eavalyneLt;

import eavalyne.pages.eavalyneLt.LoginPage;
import eavalyne.pages.eavalyneLt.SearchPage;
import eavalyne.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp(){
        super.setUp();
        LoginPage.open("https://eavalyne.lt/c/moterims");
        LoginPage.acceptPrivacyConfirmation();
    }

    @Test
    private void searchByItemBrandName(){
        String insertItemName = "Adidas";
        String expectedRezult = "";
        String actualRezult = "";

        SearchPage.enter


    }

}
