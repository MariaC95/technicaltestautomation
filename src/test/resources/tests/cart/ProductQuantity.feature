@test
Feature: Add to Cart
  As a user
  I want to increase the quantity of the product in my cart
  In order to meet my needs

  Scenario: User successfully adds to cart and increases quantity
    Given the homepage is visible
    When the user clicks on view product button on homepage
    Then the product detail is displayed
    When the user increases quantity to 4
    And the user clicks on the add to cart button
    And the user clicks on the view cart modal button
    Then the correct quantity is displayed