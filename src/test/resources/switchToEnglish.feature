
@Testcase1

Feature: Switch language to English
    As user I want to change the language from Hungarian to English
    So that I reach the webshop in English


    Rule: It is allowed to change the language

      Scenario: Change the language to english
        Given open "Magyar" home page
        When I change the language
        Then it shows elements in "English"

      Scenario: Change the language to english
        Given open "English" home page
        When I change the language
        Then it shows elements in "Magyar"
