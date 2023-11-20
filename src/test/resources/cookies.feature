
Feature: Cookies
  As user I want to accept cookies
  So that I can register or login


  Rule: It is allowed to accept cookies

    Background:
      Given main page is open


    Scenario: Cookies can be accepted
      When I click on accept cookies
      Then I am on the login page an can register

