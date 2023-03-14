package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    @FindBy(css = "#user-name") private WebElement usernameFld;
    @FindBy(css = "#password") private WebElement passwordFld;
    @FindBy(id = "login-button") private WebElement loginBtn;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private void insertUsername(String username)
    {
        wait.until(ExpectedConditions.visibilityOf(usernameFld)).sendKeys(username);
    }

    private void insertPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(passwordFld)).sendKeys(password);
    }

    private void clickLoginBtn()
    {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public void login(String username, String password)
    {
        insertUsername(username);
        insertPassword(password);
        clickLoginBtn();
    }
}
