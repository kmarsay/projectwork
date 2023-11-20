
Feature: Sign in
  As registered user
  I sign in to the webshop
  So that I can reach my basket

  Rule: It is allowed to sign in and shopping basket and I see the basket

    Background:
      Given open the main page
      And accept cookies

    Scenario: Sign in with existing user account
      Given I am on the login page
      When I login account with username and password
      Then I am on the groceries page
      And I should see the basket icon

    Scenario: Sign in with invalid password
      Given I am on the login page
      When I login with valid username and invalid password
      Then I  see the error message on the login page