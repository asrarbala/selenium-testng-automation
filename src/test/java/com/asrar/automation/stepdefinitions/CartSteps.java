package com.asrar.automation.stepdefinitions;

import com.asrar.automation.pages.CartPage;
import com.asrar.automation.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartSteps {

    private ProductsPage productsPage;
    private CartPage cartPage;

    @And("user adds a backpack to the cart")
    public void user_adds_a_backpack_to_the_cart() {
        productsPage = new ProductsPage();
        productsPage.addBackpackToCart();

        Assert.assertTrue(
                productsPage.isCartBadgeDisplayed(),
                "Cart badge was not displayed after adding item"
        );
    }

    @And("user opens the cart")
    public void user_opens_the_cart() {
        productsPage.openCart();
        cartPage = new CartPage();
    }

    @Then("item should be visible in the cart")
    public void item_should_be_visible_in_the_cart() {
        Assert.assertTrue(
                cartPage.isItemDisplayedInCart(),
                "Item was not visible in the cart"
        );
    }
}
