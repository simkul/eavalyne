package eavalyne.pages.eavalyneLt;

import eavalyne.pages.Common;
import eavalyne.pages.Locators;

public class AddToCartPage {
    public static void open(String url) {Common.openUrl(url);}

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.Cookies.cookiesBlog);
        Common.clickElement(Locators.Eavalyne.Cookies.cookiesAccept);
    }

    public static void clickOnAddButton() {Common.clickElement(Locators.Eavalyne.AddToCart.addButton);
    }

    public static void clickOnIKrepseli() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.AddToCart.iKrepseliButton);
        Common.clickElement(Locators.Eavalyne.AddToCart.iKrepseliButton);
    }

    public static void waitForCartPage() {Common.waitForElementWithVisabilityChange(Locators.Eavalyne.AddToCart.cartPage);
    }

    public static String readPage() {return Common.getElementText(Locators.Eavalyne.AddToCart.cartPage);
    }
}
