package saucedemo.pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    private static LoginPage loginPage;
    private static StorePage storePage;
    private static CartPage cartPage;
    private static CheckoutPage checkoutPage;

    public static LoginPage getLoginPage(WebDriver driver)
    {
        return loginPage == null ? new LoginPage(driver) : loginPage;
    }

    public static StorePage getStorePage(WebDriver driver)
    {
        return storePage == null ? new StorePage(driver) : storePage;
    }

    public static CartPage getCartPage(WebDriver driver)
    {
        return cartPage == null ? new CartPage(driver) : cartPage;
    }

    public static CheckoutPage getCheckoutPage(WebDriver driver)
    {
        return checkoutPage == null ? new CheckoutPage(driver) : checkoutPage;
    }
}
