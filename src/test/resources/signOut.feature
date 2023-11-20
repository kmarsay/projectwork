
Feature: Sign out
  As a user logged in to the webshop
  I sign out
  So that I can not reach my basket

  Rule: It is allowed to logout from the webshop

    Background:
      Given open the main page
      And accept cookies

    Background:
      Given open the main page
      And accept cookies
      And I am on the login page
      And I login account with username and password
      Then I am logged in and I can see my basket


    Scenario: Sign out from the webshop
      Given I am on the groceries page
      When I sign out
      Then basket is not available