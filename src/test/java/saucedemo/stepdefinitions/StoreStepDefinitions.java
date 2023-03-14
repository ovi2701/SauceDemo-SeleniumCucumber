package saucedemo.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import saucedemo.constants.EndPoint;
import saucedemo.context.TestContext;
import saucedemo.domainobjects.Product;
import saucedemo.pages.CartPage;
import saucedemo.pages.LoginPage;
import saucedemo.pages.StorePage;

public class StoreStepDefinitions {
    private WebDriver driver;

    public StoreStepDefinitions(TestContext context)
    {
        driver = context.driver;
    }

    @Given("I am on the Store Page")
    public void iAmOnTheStorePage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load("/");
        loginPage.login("standard_user", "secret_sauce");
        new StorePage(driver).load(EndPoint.STORE);
    }

    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product product) {
        StorePage storePage = new StorePage(driver);
        storePage.addProductToTheCart(product.getName());
    }

    @Then("I should see {int} {product} in the cart")
    public void iShouldSeeInTheCart(int qty, Product product) {
        StorePage storePage = new StorePage(driver);
        storePage.viewCart();
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.checkQuantityForProduct(product.getName()), qty);
    }
}
