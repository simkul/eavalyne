package eavalyne.tests.eavalyneLt;

import eavalyne.pages.eavalyneLt.LoginPage;
import eavalyne.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open("https://eavalyne.lt/");
        LoginPage.acceptPrivacyConfirmation();
    }
    @Test
    private void loginWihtCorectData(){
        String insertEmail = "apallinarija@gmail.com";
        String insertPassword = "Test1234";
        String expectedRezult = "Mano paskyra";
        String actualRezult = null;

        LoginPage.clickOnPrisijungtibutton();
        LoginPage.waitForVisability();
        LoginPage.enterEmail(insertEmail);
        LoginPage.enterPassword(insertPassword);
        LoginPage.clickOnSecondPrisijungtiButton();
        LoginPage.waitForPageLoad();

        actualRezult = LoginPage.readOpenedPage();

        Assert.assertTrue(actualRezult.contains(expectedRezult),
                String.format("Actual [%s]; Expected [%s]",
                        actualRezult,
                        expectedRezult)
        );
    }
    @Test
    private void loginWithNotCorectEmail(){

        String insertEmail = "apallinarija@gmail.co";
        String insertPassword = "Test1234";
        String expectedRezult = "Prisijungti / Sukurti paskyrą";
        String actualRezult = null;

        LoginPage.clickOnPrisijungtibutton();
        LoginPage.waitForVisability();
        LoginPage.enterEmail(insertEmail);
        LoginPage.enterPassword(insertPassword);
        LoginPage.clickOnSecondPrisijungtiButton();
        LoginPage.waitForLoginPageLoad();

        actualRezult = LoginPage.readPage();

        Assert.assertTrue(actualRezult.contains(expectedRezult),
                String.format("Actual [%s]; Expected [%s]",
                        actualRezult,
                        expectedRezult)
        );



    }

}
