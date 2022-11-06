package eavalyne.pages;

import eavalyne.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common {
    public static void setUpDriver() {Driver.setDriver();}

    public static void closeDriver() {Driver.close();}

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void waitForElementWithVisabilityChange(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }
}
