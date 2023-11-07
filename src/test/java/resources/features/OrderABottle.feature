Feature: order a bottle of Beyerskloof Pinotage 2019 from the shop

  Scenario: Checkout the order
    Given the user have browser open
    And user is logged into the e-commerce site
    When logged in, user must order a bottle of Beyerskloof Pinotage 2019 from the shop
    And Checkout the order
    Then Print the order number