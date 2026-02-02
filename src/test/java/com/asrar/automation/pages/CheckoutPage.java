package com.asrar.automation.pages;

import com.asrar.automation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckoutPage {

    private static final Logger log =
            LoggerFactory.getLogger(CheckoutPage.class);

    private WebDriver driver;

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");
    private By successMsg = By.className("complete-header");

    public CheckoutPage() {
        this.driver = DriverFactory.getDriver();
    }

    public void enterCheckoutInfo(String fName, String lName, String zip) {
        log.info("Entering checkout details");
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(postalCode).sendKeys(zip);
        driver.findElement(continueBtn).click();
    }

    public void clickFinish() {
        log.info("Finishing checkout");
        driver.findElement(finishBtn).click();
    }

    public boolean isOrderSuccessful() {
        return driver.findElement(successMsg).isDisplayed();
    }
}
