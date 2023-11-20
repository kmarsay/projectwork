
Feature: Register
  I want to register as a new user to the webshop
  So that I can sign in

  Rule: It is allowed to register to the webshop

    Background:
      Given open the main page
      And accept cookies

    Scenario: Register a new user
      Given I am on the registration page
      When I register
      Then I will have a new user access