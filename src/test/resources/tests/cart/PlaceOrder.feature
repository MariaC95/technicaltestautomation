@test
Feature: Place Order
  As a user
  I want to place an order
  In order to purchase my item

  Background:
    Given the homepage is visible
    When the user clicks on the signupLogin button
    When the user enters their name and email address
    And clicks the signup button
    Then the enter account information page is displayed
    When the user fills out their account information on the signup form
    When the user fills out their address information on the signup form
    And clicks the create account button
    Then the account created page is displayed
    When the user clicks on the continue button

  Scenario: User successfully places an order
    Given the homepage is visible
    When the user clicks on the signupLogin button
    And the user enters their email and password to login
    Then the username is displayed
    When the user adds product to cart
    And the user clicks on the cart button
    Then the cart page is displayed
    When the user clicks on the proceed to checkout button
    And the address details are displayed
    And the user reviews their order
    And the user enters a description in the text box
    Then the user clicks on the place order button
    When the user enters their payment details
    Then the user clicks on the pay and confirm order button
    And the success message is displayed
    When the user clicks on the delete account button
    And the deleted account confirmation page is displayed
    Then the user clicks on the continue button