package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class StorePage extends BasePage {
    @FindBy(css = ".app_logo") private WebElement storePageTitle;
    @FindBy(css = ".shopping_cart_link") private WebElement viewCartLink;
    @FindBy(css = "div[class='inventory_item_name']") private List<WebElement> productNameList;
    @FindBy(xpath = "//*[contains(@id,'add-to-cart-')]") private List<WebElement> addToCartButtonList;
    @FindBy(xpath = "//*[contains(@id,'remove-')]") private List<WebElement> removeButtonsList;
    public StorePage(WebDriver driver) {
        super(driver);
    }

    public String getStorePageTitle()
    {
        return wait.until(ExpectedConditions.visibilityOf(storePageTitle)).getText();
    }

    public void addProductToTheCart(String productName){

        for (int i = 0; i< productNameList.size(); i++)
        {
            if (productNameList.get(i).getText().equals(productName))
            {
                wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonList.get(i- removeButtonsList.size()))).click();
            }
        }
    }

    public void viewCart()
    {
        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
    }
}
