Feature: Feature to test the login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When  user enters valid username and password
    And clicks on login button
    Then user navigated into the home page

