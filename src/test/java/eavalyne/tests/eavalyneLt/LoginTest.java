package eavalyne.tests.eavalyneLt;

import eavalyne.pages.eavalyneLt.LoginPage;
import eavalyne.tests.TestBase;
import org.testng.annotations.BeforeMethod;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open("https://eavalyne.lt/");
        LoginPage.acceptPrivacyConfirmation();
    }

}
