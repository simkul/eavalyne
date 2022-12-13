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
    public static void waitForSearchPageLoad() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.Search.searchPage);
    }
    public static void clickOnItem() {
        Common.clickElement(Locators.Eavalyne.Search.item);
    }

    public static void waitForPageLoad() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.Search.itemBrandName);
    }

    public static String readOpenedPage() {return Common.getElementText(Locators.Eavalyne.Search.itemBrandName);
    }


    public static void clickOnLabel() {
        Common.clickElement(Locators.Eavalyne.SearchByFilters.label);
    }
    public static void cliclOnSize() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.SearchByFilters.size);
        Common.clickElement(Locators.Eavalyne.SearchByFilters.size);
    }

    public static void clickOnSpalvaButton() {
        Common.waitForElementWithVisabilityChange(Locators.Eavalyne.SearchByFilters.spalvaButton);
        Common.clickElement(Locators.Eavalyne.SearchByFilters.spalvaButton);
    }
    public static void clickOnBlack() {
        Common.clickElement(Locators.Eavalyne.SearchByFilters.black);
    }

    public static String readPage() {
        return Common.getElementText(Locators.Eavalyne.SearchByFilters.products);
    }
}


