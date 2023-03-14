package saucedemo.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import saucedemo.context.TestContext;
import saucedemo.factory.DriverFactory;

public class MyHooks {
    private WebDriver driver;
    private final TestContext context;

    public MyHooks(TestContext context)
    {
        this.context = context;
    }

    @Before
    public void before(Scenario scenario){
        driver = new DriverFactory().initializeDriver(System.getProperty("browser", "chrome"));
        context.driver = driver;
    }

    @After
    public void after(Scenario scenario){
        driver.quit();
    }
}
