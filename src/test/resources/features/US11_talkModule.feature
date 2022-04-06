Feature: As a user I should be able to access the Talk Module

    Scenario:Verify that user can access Talks Module
      Given user is on the dashboard page
      When the user clicks the Talk module
      Then the user sees the page title "Talk - TryCloud"

      Scenario: Verify that user can send a message
        When the user clicks the Talk module
        And the user searches through the search box
        And the user writes the message
        And the user clicks a submit button
        Then the user should be able to see the message displayed in the conversation log
