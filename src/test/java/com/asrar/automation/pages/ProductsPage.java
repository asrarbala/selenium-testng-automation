package com.asrar.automation.pages;

import com.asrar.automation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private WebDriver driver;

    private By productsTitle = By.className("title");
    private By inventoryContainer = By.id("inventory_container");

    public ProductsPage() {
        this.driver = DriverFactory.getDriver();
    }

    public boolean isProductsPageDisplayed() {
        return driver.findElement(productsTitle).isDisplayed()
                && driver.findElement(inventoryContainer).isDisplayed();
    }

    public String getPageTitle() {
        return driver.findElement(productsTitle).getText();
    }
}
