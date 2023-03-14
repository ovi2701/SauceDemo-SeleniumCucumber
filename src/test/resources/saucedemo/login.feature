Feature: Login
  Scenario: Login with correct credentials
    Given I am on Login Page
    When I login with correct credentials
    Then I should see "Swag Labs" title