
@Testcase1

Feature: Switch language to English
    As user I want to change the language from Hungarian to English
    So that I reach the webshop in English


    Rule: It is allowed to change the language

      Background:
        Given main page is open
        And accept cookies

      Scenario: Change the language to english
        Given language is set to "Magyar"
        When I change the language to "English"
        Then it shows elements in "English"

