package com.asrar.automation.stepdefinitions;

import com.asrar.automation.pages.CartPage;
import com.asrar.automation.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckoutSteps {

    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @And("user proceeds to checkout")
    public void user_proceeds_to_checkout() {
        cartPage = new CartPage();
        cartPage.clickCheckout();
        checkoutPage = new CheckoutPage();
    }

    @And("user enters checkout details")
    public void user_enters_checkout_details() {
        checkoutPage.enterCheckoutInfo("John", "Doe", "12345");
    }

    @And("user finishes the order")
    public void user_finishes_the_order() {
        checkoutPage.clickFinish();
    }

    @Then("order should be placed successfully")
    public void order_should_be_placed_successfully() {
        Assert.assertTrue(
                checkoutPage.isOrderSuccessful(),
                "Order was not successful"
        );
    }
}
