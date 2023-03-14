package saucedemo.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import saucedemo.context.TestContext;
import saucedemo.pages.CartPage;
import saucedemo.pages.LoginPage;
import saucedemo.pages.PageFactoryManager;
import saucedemo.pages.StorePage;

public class LoginStepDefinitions {
    private final LoginPage loginPage;
    private final StorePage storePage;

    public LoginStepDefinitions(TestContext context){
        loginPage = PageFactoryManager.getLoginPage(context.driver);
        storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @Given("I am on Login Page")
    public void i_am_on_login_page() {
        loginPage.load("/");

    }
    @When("I login with correct credentials")
    public void i_provide_correct_credentials() {
        loginPage.login("standard_user", "secret_sauce");
    }
    @Then("I should see {string} title")
    public void i_should_see_title(String title) {
        Assert.assertEquals(storePage.getStorePageTitle(), title);
    }
}
