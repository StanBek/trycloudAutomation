
Feature: As a user, I should be able to update settings.

  Background: user on the login page
    Given user enter the username and password
  Scenario: Verify users update settings
    Given user on the dashboard page
    When the user clicks the "Files" module
    And user clicks Settings on the left bottom corner
    Then the user should be able to click any buttons



@wip
  Scenario: Verify users to see the app storage usage
    Given user on the dashboard page
    When the user clicks the "Files" module
    And user checks the current storage usage
    And user uploads file with the upload file option
    And user refresh the page
    Then the user should be able to see storage usage is increased