Feature: Cart functionality

  Background:
    Given user is on the login page
    When user logs in with username "standard_user" and password "secret_sauce"
    Then user should be navigated to the products page

  @smoke
  Scenario: Add item to cart
    And user adds a backpack to the cart
    And user opens the cart
    Then item should be visible in the cart
