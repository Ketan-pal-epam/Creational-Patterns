package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {
    private static BrowserFactory instance = null;
    private WebDriver driver;

    private BrowserFactory() {
        // Set up the ChromeDriver path
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static BrowserFactory getInstance() {
        if (instance == null) {
            synchronized (BrowserFactory.class) {
                if (instance == null) {
                    instance = new BrowserFactory();
                }
            }
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }
}