package eavalyne.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();

        driver.set(new ChromeDriver(setUpOptions()));
        driver.get().manage().deleteAllCookies();
    }

    private static ChromeOptions setUpOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
        return options;
    }

    public static void close() {driver.get().quit();
    }
}
