package saucedemo.stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import saucedemo.context.TestContext;
import saucedemo.domainobjects.BillingDetails;

public class CustomerStepDefinitions {
    private final WebDriver driver;
    private final TestContext context;

    public CustomerStepDefinitions(TestContext context){
        this.context = context;
        driver = context.driver;
    }

    @And("my billing details are")
    public void myBillingDetailsAre(BillingDetails billingDetails) {
        context.billingDetails = billingDetails;
    }
}
