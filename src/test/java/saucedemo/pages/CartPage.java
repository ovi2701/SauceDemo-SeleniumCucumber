package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(css = "div[class='cart_quantity']") private List<WebElement> qtyList;
    @FindBy(css = "div[class='inventory_item_name']") private List<WebElement> productNameList;
    @FindBy(xpath = "//*[contains(@id,'remove-')]") private List<WebElement> removeButtonsList;
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int checkQuantityForProduct(String productName)
    {
        for (int i=0; i < productNameList.size(); i++)
        {
            if (productNameList.get(i).getText().equals(productName))
            {
                return Integer.parseInt(qtyList.get(i).getText());
            }
        }

        return -1;
    }

    public int checkNumberOfTypesOfProductsInTheCart()
    {
        return removeButtonsList.size();
    }
}
