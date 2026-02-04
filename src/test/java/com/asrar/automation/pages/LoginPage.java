package com.asrar.automation.pages;

import com.asrar.automation.utils.DriverFactory;
import com.asrar.automation.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage {

    private static final Logger log =
            LoggerFactory.getLogger(LoginPage.class);

    private WebDriver driver;
    private WaitHelper waitHelper;

    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("h3[data-test='error']");

    public LoginPage() {
        this.driver = DriverFactory.getDriver();
        this.waitHelper = new WaitHelper(driver);
        // Confirm Login page loaded
        waitHelper.waitForVisibility(usernameInput);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        log.info("Clicking login button");
        waitHelper.waitForClickable(loginButton).click();
    }

    public String getErrorMessage() {
        return waitHelper.waitForVisibility(errorMessage).getText();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
