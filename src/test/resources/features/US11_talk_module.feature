Feature: As a user, I should be able to access talk module
@list
  Scenario: verify users can see talk module
    Given user is on the Dashboard page
    When the user clicks the Talk module
    Then verify the title is "Talk - TryCloud"

