package eavalyne.tests.eavalyneLt;

import eavalyne.pages.eavalyneLt.LoginPage;
import eavalyne.pages.eavalyneLt.SearchPage;
import eavalyne.tests.TestBase;
import org.testng.Assert;
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
        String insertBrandName = "adidas";
        String expectedRezult = "ADIDAS";
        String actualRezult = null;

        SearchPage.enterItemBrandName(insertBrandName);
        SearchPage.clickOnSearchIcon();
        SearchPage.waitForSearchPageLoad();
        SearchPage.clickOnItem();
        SearchPage.waitForPageLoad();

        actualRezult = SearchPage.readOpenedPage();

        Assert.assertTrue(actualRezult.contains(expectedRezult),
                String.format("Actual [%s]; Expected [%s]",
                        actualRezult,
                        expectedRezult)
        );
    }
    @Test
    private void searchByFiltersTest(){
        SearchPage.clickOnLabel();
        SearchPage.clickOnColor();
    }


}
