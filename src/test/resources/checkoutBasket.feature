
Feature: Checkout basket
  As a registered user
  I have already items in my basket
  So that can show the content of the basket

  Rule: It is allowed to checkout the basket

    Background:
      Given open the main page
      And accept cookies
      And I am on the login page
      And I login account with username and password
      And I am on the products page
      And I search for "Tesco Blueberries 125 g"
      And item is added to the basket

    Scenario: Add item
      When click on "Checkout"
      Then item is displayed in the basket