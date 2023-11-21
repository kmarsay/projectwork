@Testcase3

Feature: Sign in
  As registered user
  I sign in to the webshop
  So that I can reach my basket

  Rule: It is allowed to sign in and shopping basket and I see the basket

    Background:
      Given main page is open
      And accept cookies

      @TC_Login
    Scenario: Sign in with existing user account

      When I login with following user
        | email                 |     password       |
        | kovacs.vzas@gmail.com | tokmindegy         |
      Then I am on the groceries page
      And I should see the basket icon

    Scenario: Sign in with invalid password

      When I login with following user
        | email                 |     password       |
        | kovacs.vzas@gmail.com | PW123         |
      Then I got an error message
