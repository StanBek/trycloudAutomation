
Feature: As a user, I should be able to update settings.

  Scenario Outline: Verify users update settings
    Given user on the login page
    When user insert "<username>" and "<password>"
    When the user clicks the "Files" module
    And user clicks "Settings" on the left bottom corner
    Then the user should be able to click any buttons

    Examples:
      | username | password    |
      | User23   | Userpass123 |
      | User53   | Userpass123 |
      | User83   | Userpass123 |
      | User113  | Userpass123 |

  @settings
  Scenario Outline: Verify users to see the app storage usage Given user on the dashboard page
    Given user on the login page
    When user insert "<username>" and "<password>"
    When the user clicks the "Files" module
    And user checks the current storage usage
    And user uploads file with the upload file option
    And user refresh the page
    Then the user should be able to see storage usage is increased

    Examples:
      | username | password    |
      | User23   | Userpass123 |
      | User53   | Userpass123 |
      | User83   | Userpass123 |
      | User113  | Userpass123 |
