package eavalyne.pages.eavalyneLt;

import eavalyne.pages.Common;
import eavalyne.pages.Locators;

public class SearchPage {
    public static void enterItemBrandName(String insertBrandName) {
        Common.sendKeysToElement(insertBrandName,Locators.Eavalyne.Search.searchLine);
    }

    public static void clickOnSearchIcon() {
        Common.clickElement(Locators.Eavalyne.Search.searchIcon);
    }

    public static void clickOnItem() {
        Common.clickElement(Locators.Eavalyne.Search.item);
    }

    public static void waitForPageLoad() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.Search.itemBrandName);
    }
}
