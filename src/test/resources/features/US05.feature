Feature: As a user, I should be able to access to Files module - Favorites button


  @wip
  Scenario: Verify users to add files to Favorites
    Given user on the login page
    When user on the dashboard page
    And the user clicks the "Files" module
    And the user clicks action-icon from any file on the page And user choose the "Add to favorites" option
    Then user click the "Favorites" sub-module on the left side Then Verify the chosen file is listed on the table