@Testcase2

Feature: Promotions
  As user
  I want to list the promotions
  So that I can see the offers by department

  Rule: It is allowed to list the promotions

    Background:
      Given main page is open
      And accept cookies

    Scenario: Main page of the promotions can be opened
      When I see the groceries page
      Then I want to check promotions
      And I can view offers by department

