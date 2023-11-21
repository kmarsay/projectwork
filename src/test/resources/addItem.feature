
Feature: Add item to basket
  As a registered user
  I want to add item into the basket
  So that the added item is stored in the basket

  Rule: It is allowed to add an item into the basket

    Background:
      Given main page is open
      And accept cookies
      And I am on the login page
      And I login account with username and password
      And I am on the products page
      And I search for "Tesco Blueberries 125 g"

    Scenario: Add item
      When I add an item
      Then item is displayed in the basket