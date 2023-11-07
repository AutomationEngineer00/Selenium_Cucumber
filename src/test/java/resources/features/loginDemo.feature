Feature: Test Login functionality

  Scenario: Test login with valid credentials

    Given the user have browser open
    And user has navigated to the System Under Test - Search for something
    When user clicks on the first results on the list
    #And click on the login button
    Then user should be able to see the landing dashboard page
