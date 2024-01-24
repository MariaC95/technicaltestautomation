@test
Feature: Signup/Login
  As a user
  I want to signup as a new user
  In order to be logged in

  Scenario: User successfully registers as a new customer
    Given the homepage is visible
    When the user clicks on the signupLogin button
    Then the signup page is displayed
    When the user enters their name and email address
    And clicks the signup button
    Then the enter account information page is displayed
    When the user fills out their account information on the signup form
    And the user selects the checkbox to sign up for newsletters
    And the user selects the checkbox to receive special offers
    When the user fills out their address information on the signup form
    And clicks the create account button
    Then the account created page is displayed
    When the user clicks on the continue button
    Then the username is displayed
    When the user clicks on the delete account button
    Then the deleted account confirmation page is displayed
    And the user clicks on the continue button