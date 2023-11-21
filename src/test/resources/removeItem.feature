
Feature: Remove item from the basket
  As registered user
  I want to remove item from the basket
  So that the item is removed

  Rule: It is allowed to remove item from the basket

    Background:
      Given Registered user is logged in to the webshop
      And "Tesco Blueberries 125 g" has been added to the basket



    Scenario: Remove item
      When I remove an item
      Then item is not anymore in the basket