Feature: As a user I should be able to access the Talk Module

  Background:
    Given user is on the dashboard page

    Scenario:Verify that user can access Talks Module
    When the user clicks the Talk Module
      Then the user sees the page title "Talk - TryCloud QA"

      Scenario: Verify that user can send a message
        When the user clicks the Talk Module
        And the user searches through the search box
        And the user writes the message
        And the user clicks a submit button
        Then the user should be able to see the message displayed in the conversation log
