Feature: Place an order
  Scenario: Having a product in the cart
    Given I am on the Store Page
    And my billing details are
      | firstname | lastname | zip |
      | demo      | user     | 789657|
    And I add a "Sauce Labs Backpack" to the cart
    And I am on the Checkout Page
    When I provide billing details
    And I place the order
#    Then I should see "Thank you for your order!"
