Feature: Login functionality

  @smoke
  Scenario: Login with invalid credentials
    Given user is on the login page
    When user logs in with username "standard_user" and password "wrong_password"
    Then error message should be displayed

  @smoke
  Scenario: Login with valid credentials
    Given user is on the login page
    When user logs in with username "standard_user" and password "secret_sauce"
    Then user should be navigated to the products page
