
Feature: Promotions
  As user
  I want to list the promotions
  So that I can see the offers by department

  Rule: It is allowed to list the promotions

    Background:
      Given open the main page
      And accept cookies

    Scenario: Main page of the promotions can be opened
      Given user is not signed in
      When I see the groceries page
      Then I clik on promotions
      And get the offers listed by department

