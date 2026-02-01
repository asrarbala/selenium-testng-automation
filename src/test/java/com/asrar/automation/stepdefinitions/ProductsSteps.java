package com.asrar.automation.stepdefinitions;

import com.asrar.automation.pages.ProductsPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductsSteps {

    private ProductsPage productsPage;

    @Then("user should be navigated to the products page")
    public void user_should_be_navigated_to_the_products_page() {
        productsPage = new ProductsPage();
        Assert.assertTrue(
                productsPage.isProductsPageDisplayed(),
                "User was not navigated to the Products page after login"
        );
    }
}
