Feature: As a user, I should be to able to remove files from favorites and upload a file directly


  @Ramia
Scenario: verify users to remove files to Favorites
Given user on the dashboard page
When the user clicks the "Files" module
When the users click action-icon from any file on the page to remove
And  user choose the "Remove from favorites" option
  | jamesBond |
  | Test      |
  | Talk      |
  | JamesBond |
    And user click the "Favorites" sub-module on the left side
Then Verify that the file is removed from the Favorites sub-module’s table


