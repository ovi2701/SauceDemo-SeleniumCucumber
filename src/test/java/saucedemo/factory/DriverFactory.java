package saucedemo.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public WebDriver initializeDriver(String browser){
        WebDriver driver;
        switch(browser){
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }

            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;}

            default -> {
                    throw new IllegalStateException("Invalid browser: " + browser);
                }
            }

        driver.manage().window().maximize();
        return driver;
    }
}
