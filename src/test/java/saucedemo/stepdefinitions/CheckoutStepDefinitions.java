package saucedemo.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import saucedemo.context.TestContext;
import saucedemo.domainobjects.BillingDetails;
import saucedemo.pages.CartPage;
import saucedemo.pages.CheckoutPage;
import saucedemo.pages.StorePage;

public class CheckoutStepDefinitions {
    private WebDriver driver;
    private TestContext context;

    public CheckoutStepDefinitions(TestContext context)
    {
        this.context = context;
        driver = context.driver;
    }

    @Then("I should see {int} types of products to the cart")
    public void iShouldSeeTypesOfProductsToTheCart(int nrOfTypes) {
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.checkNumberOfTypesOfProductsInTheCart(), nrOfTypes);
    }

    @And("I am on the Checkout Page")
    public void iAmOnTheCheckoutPage() {
        StorePage storePage = new StorePage(driver);
        storePage.viewCart();
    }

    @When("I provide billing details")
    public void iProvideBillingDetails() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickCheckoutBtn();
        checkoutPage.setBillingDetails(context.billingDetails);

    }

    @And("I place the order")
    public void iPlaceTheOrder() {
        new CheckoutPage(driver).placeTheOrder();
    }

    @Then("I should see {string}")
    public void iShouldSee(String arg0) {
    }
}
