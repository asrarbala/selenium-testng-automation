package com.asrar.automation.pages;

import com.asrar.automation.utils.DriverFactory;
import com.asrar.automation.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductsPage {

    private static final Logger log =
            LoggerFactory.getLogger(ProductsPage.class);

    private WebDriver driver;
    private WaitHelper waitHelper;

    private By productsTitle = By.className("title");
    private By inventoryContainer = By.id("inventory_container");
    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_badge");
    private By cartIcon = By.className("shopping_cart_link");


    public ProductsPage() {
        this.driver = DriverFactory.getDriver();
        this.waitHelper = new WaitHelper(driver);
        // Confirm Products page loaded
        waitHelper.waitForVisibility(productsTitle);
    }

    public boolean isProductsPageDisplayed() {
        return driver.findElement(productsTitle).isDisplayed()
                && driver.findElement(inventoryContainer).isDisplayed();
    }

    public void addBackpackToCart() {
        log.info("Adding backpack to cart");
        waitHelper.waitForClickable(addToCartButton).click();
    }

    public boolean isCartBadgeDisplayed() {
        return waitHelper.waitForVisibility(cartBadge).isDisplayed();
    }

    public void openCart() {
        log.info("Opening cart page");
        driver.findElement(cartIcon).click();
    }

}
