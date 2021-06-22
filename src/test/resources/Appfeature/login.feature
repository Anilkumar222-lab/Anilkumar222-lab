Feature: feature to test Login functionality

  Scenario: Check the Login is successful with valid credentials
    Given User is on login page
    When User enter username and password
    And User clicks on login button
    Then user is navigated to Home page
