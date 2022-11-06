package eavalyne.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Eavalyne{
        public static class Cookies{
            public static By cookiesBlog = By.xpath("//*[@id='marketing-approvals']");
            public static By cookiesAccept = By.xpath("//*[@class = 'accept-button base-button primary normal green']");
        }
    }
}
