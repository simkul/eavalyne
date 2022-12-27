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
        SearchPage.open("https://eavalyne.lt/c/moterims");
        SearchPage.acceptPrivacyConfirmation();
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
        String expectedRezult = "produktų";
        String actualRezult = null;

        SearchPage.clickOnLabel();
        SearchPage.cliclOnSize();
        SearchPage.clickOnSpalvaButton();
        SearchPage.clickOnBlack();

        actualRezult = SearchPage.readPage();

        Assert.assertTrue(actualRezult.contains(expectedRezult),
                String.format("Actual [%s]; Expected [%s]",
                        actualRezult,
                        expectedRezult)
        );
    }


}
