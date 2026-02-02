package com.asrar.automation.pages;

import com.asrar.automation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CartPage {

    private static final Logger log =
            LoggerFactory.getLogger(CartPage.class);

    private WebDriver driver;

    private By cartIcon = By.className("shopping_cart_link");
    private By cartItem = By.className("inventory_item_name");
    private By checkoutButton = By.id("checkout");

    public CartPage() {
        this.driver = DriverFactory.getDriver();
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }

    public boolean isItemDisplayedInCart() {
        log.info("Checking items in cart");
        return driver.findElement(cartItem).isDisplayed();
    }

    public void clickCheckout() {
        log.info("Proceeding to checkout");
        driver.findElement(checkoutButton).click();
    }
}
