package com.asrar.automation.pages;

import com.asrar.automation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

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
        return driver.findElement(cartItem).isDisplayed();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
