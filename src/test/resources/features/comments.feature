@comments
Feature: As a user, I should be able to write comments to files/folders.

  Scenario Outline: Verify users to write comments to files/folder Given user on the dashboard page
    Given user on the login page
    When user insert "<username>" and "<password>"
    When the user clicks the "Files" module
    And user click action-icon from any file on the page And user choose the "Details" option
    And user write a comment inside the input box
    And user click the submit button to post it
    Then Verify the comment is displayed in the comment section.
    Examples:
      | username | password    |
      | User23   | Userpass123 |
      | User53   | Userpass123 |
      | User83   | Userpass123 |
      | User113  | Userpass123 |