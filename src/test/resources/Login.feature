Feature: feature to test the Login functionality

  Scenario Outline: Verifying the login functionality by providing valid username and password
    Given User is on Google chrome page
    And User enters the valid url
    When user clicks login option in  the Website
    And user enters valid <username> and <password> in Login page
    And user clicks on Login button
    Then User is navigated to the Home Page

    Examples: 
      | username                  | password   |
      | indrakiladri.a2@gmail.com | mother@222 |
      | test123@mail.com          | test@123   |
