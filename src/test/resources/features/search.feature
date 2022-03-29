Feature: As a user, I should be able to search any item and users from the homepage

  @wip
  Scenario: Check ability to access search function
    Given user on the login page
    When user use username "username" and passcode "password"
    And user click the login button
    And user  clicks the magnifier icon on the right top
    And Search any existing file or folder or user name and verify the app displays the expected result option
      | nameOfValue | Cydeo |
      | nameOfValue1| Group23 |





