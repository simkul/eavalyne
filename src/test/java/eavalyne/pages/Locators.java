package eavalyne.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Eavalyne{
        public static class Cookies{
            public static By cookiesBlog = By.xpath("//*[@id='marketing-approvals']");
            public static By cookiesAccept = By.xpath("//*[@class = 'accept-button base-button primary normal green']");
        }
        public static class Prisijungti{
            public static By prisijungtiButton = By.xpath("//*[text()='Prisijungti']");
            public static By prisijungtiForm = By.xpath("//*[@id='modal-authorization']");
            public static By emailLine = By.xpath("//*[@id='email']");
            public static By passwordLine = By.xpath("//*[@id='password']");
            public static  By secondPrisijungtiButton = By.xpath("//*[@id='modal-authorization']/div/section/div/div/div[2]/div[1]/div/div/div[3]/form/fieldset/div/div[3]/button");
            public static By newPageLoad = By.xpath("//*[text()='Mano paskyra']");
            public static By paragraphName = By.xpath("//*[text()='Mano paskyra']");
        }
    }
}
