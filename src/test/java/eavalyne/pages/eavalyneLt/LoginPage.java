package eavalyne.pages.eavalyneLt;

import eavalyne.pages.Common;
import eavalyne.pages.Locators;

public class LoginPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.Cookies.cookiesBlog);
        Common.clickElement(Locators.Eavalyne.Cookies.cookiesAccept);
    }

    public static void clickOnPrisijungtibutton() {
        Common.clickElement(Locators.Eavalyne.Prisijungti.prisijungtiButton);
    }

    public static void waitForVisability() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.Prisijungti.prisijungtiForm);
    }

    public static void enterEmail(String inserEmail) {
        Common.sendKeysToElement(inserEmail,Locators.Eavalyne.Prisijungti.emailLine);
    }

    public static void enterPassword(String insertPassword) {
        Common.sendKeysToElement(insertPassword,Locators.Eavalyne.Prisijungti.passwordLine);
    }

    public static void clickOnSecondPrisijungtiButton() {
        Common.clickElement(Locators.Eavalyne.Prisijungti.secondPrisijungtiButton);
    }

    public static void waitForPageLoad() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.Prisijungti.newPageLoad);
    }

    public static String readOpenedPage() {return Common.getElementText(Locators.Eavalyne.Prisijungti.paragraphName);
    }
    public static void waitForLoginPageLoad() {Common.waitForElementWithVisabilityChange(Locators.Eavalyne.Prisijungti.pageTitleLoad);
    }
    public static String readPage() {return Common.getElementText(Locators.Eavalyne.Prisijungti.pageLoad);
    }


}
