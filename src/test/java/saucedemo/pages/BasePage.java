package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import saucedemo.utils.ConfigLoader;

import java.time.Duration;

public class BasePage {
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void load(String endpoint)
    {
        driver.get(ConfigLoader.getInstance().getBaseUrl() + endpoint);
    }
    protected WebDriver driver;
    protected WebDriverWait wait;
}
