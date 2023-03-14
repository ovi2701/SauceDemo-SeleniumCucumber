Feature: Add product to the cart
  Scenario: Add one product to the cart
    Given I am on the Store Page
    When I add a "Sauce Labs Backpack" to the cart
    Then I should see 1 "Sauce Labs Backpack" in the cart

  Scenario: Add many products to the cart
    Given I am on the Store Page
    When I add a "Sauce Labs Backpack" to the cart
    And I add a "Sauce Labs Bike Light" to the cart
    And I add a "Sauce Labs Onesie" to the cart
    Then I should see 3 types of products to the cart
