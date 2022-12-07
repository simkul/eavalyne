package eavalyne.pages.eavalyneLt;

import eavalyne.pages.Common;
import eavalyne.pages.Locators;

public class SearchPage {
    public static void enterItemBrandName(String insertBrandName) {
        Common.sendKeysToElement(insertBrandName,Locators.Eavalyne.Search.searchLine);
    }
}
