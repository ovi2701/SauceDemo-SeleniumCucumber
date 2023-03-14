package saucedemo.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import saucedemo.constants.EndPoint;
import saucedemo.context.TestContext;
import saucedemo.domainobjects.BillingDetails;
import saucedemo.domainobjects.Product;
import saucedemo.pages.CartPage;
import saucedemo.pages.CheckoutPage;
import saucedemo.pages.LoginPage;
import saucedemo.pages.StorePage;

public class MyStepDefinitions {
    private WebDriver driver;
    private BillingDetails billingDetails;

    public MyStepDefinitions(TestContext context){
        driver = context.driver;
    }

}
