package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import saucedemo.domainobjects.BillingDetails;

public class CheckoutPage extends BasePage{
    @FindBy(css = "#first-name") private WebElement firstNameFld;
    @FindBy(css = "#last-name") private WebElement lastNameFld;
    @FindBy(css = "#postal-code") private WebElement postalCodeFld;
    @FindBy(css = "#continue") private WebElement continueBtn;
    @FindBy(css = "#finish") private WebElement finishBtn;
    @FindBy(css = "#checkout") private WebElement checkoutBtn;
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private void insertFirstNameForCheckout(String firstName)
    {
        wait.until(ExpectedConditions.visibilityOf(firstNameFld)).sendKeys(firstName);
    }

    private void insertLastNameForCheckout(String lastName)
    {
        wait.until(ExpectedConditions.visibilityOf(lastNameFld)).sendKeys(lastName);
    }

    private void insertPostalCodeForCheckout(String postalCode)
    {
        wait.until(ExpectedConditions.visibilityOf(postalCodeFld)).sendKeys(postalCode);
    }

    private void clickContinueBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }

    private void clickFinishBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(finishBtn)).click();
    }

    public void setBillingDetails(BillingDetails billingDetails)
    {
        insertFirstNameForCheckout(billingDetails.getBillingFirstName());
        insertLastNameForCheckout(billingDetails.getBillingLastName());
        insertPostalCodeForCheckout(billingDetails.getBillingZipcode());
    }

    public void clickCheckoutBtn()
    {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
    }

    public void placeTheOrder(){
        clickContinueBtn();
        clickFinishBtn();
    }
}
