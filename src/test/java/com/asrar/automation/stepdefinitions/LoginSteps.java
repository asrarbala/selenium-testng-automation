package com.asrar.automation.stepdefinitions;

import com.asrar.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    private LoginPage loginPage;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage = new LoginPage();
    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(errorMessage.length() > 0,
                "Expected error message to be displayed");
    }
}
