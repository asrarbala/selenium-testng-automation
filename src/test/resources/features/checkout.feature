Feature: Checkout functionality

  Background:
    Given user is on the login page
    When user logs in with username "standard_user" and password "secret_sauce"
    Then user should be navigated to the products page
    And user adds a backpack to the cart
    And user opens the cart

  @smoke
  Scenario: Complete checkout
    And user proceeds to checkout
    And user enters checkout details
    And user finishes the order
    Then order should be placed successfully
