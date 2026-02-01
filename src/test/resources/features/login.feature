Feature: Login functionality

  @smoke
  Scenario Outline: Login with invalid credentials
    Given user is on the login page
    When user logs in with username "<username>" and password "<password>"
    Then error message should be displayed

  Examples:
    | username        | password      |
    | wrong_user      | wrong_pass    |
    | standard_user   | wrong_pass    |
    | wrong_user      | secret_sauce  |


  @smoke
  Scenario: Login with valid credentials
    Given user is on the login page
    When user logs in with username "standard_user" and password "secret_sauce"
    Then user should be navigated to the products page
