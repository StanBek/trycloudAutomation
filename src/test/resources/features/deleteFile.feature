@wip
Feature: As a user, I should be able to delete a file/folder.

  User Story: As a user, I should be able to delete a file/folder.

  Scenario Outline: Verify users delete a file/folder
    Given user on the dashboard page "<username>" "<password>"
    When the user clicks the "Files" module
    And user click action-icon from any file on the page
    And user choose the "Delete f" option
    When the user clicks the "Deleted files" sub-module on the left side
    Then Verify the deleted file is displayed on the page
    Examples:
      | username | password    |
      | user23   | Userpass123 |
      | user53   | Userpass123 |
      | user83   | Userpass123 |
      | user113  | Userpass123 |