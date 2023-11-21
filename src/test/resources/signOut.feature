
Feature: Sign out
  As a user logged in to the webshop
  I sign out
  So that I can not reach my basket

  Rule: It is allowed to logout from the webshop


    Background:
      Given Registered user is logged in to the webshop



    Scenario: Sign out from the webshop

      When I sign out
      Then basket is not available