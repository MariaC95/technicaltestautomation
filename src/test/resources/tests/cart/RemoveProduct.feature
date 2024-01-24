@test
Feature: Remove Product
  As a user
  I want to remove the product in my cart
  In order to save money

  Scenario: User successfully removes product from cart
    Given the homepage is visible
    When the user clicks on the add to cart button
    And the user clicks on the cart button
    Then the cart page is displayed
    Then the user clicks on the x to remove from cart
    And the product is removed from the cart