package eavalyne.pages.eavalyneLt;

import eavalyne.pages.Common;
import eavalyne.pages.Locators;

public class AddToCartPage {
    public static void open(String url) {Common.openUrl(url);}

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.Cookies.cookiesBlog);
        Common.clickElement(Locators.Eavalyne.Cookies.cookiesAccept);
    }
}
