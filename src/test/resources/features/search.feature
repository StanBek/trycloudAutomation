Feature: As a user, I should be able to search any item and users from the homepage

  @wip
  Scenario Outline: Check ability to access search function
    Given user on the login page
    When user use username "<username>" and passcode "<password>"
    And user click the login button
    And user  clicks the magnifier icon on the right top
    Then Search any existing file or folder or user name and verify the app displays "<expected result>" and "<expected result1>"  the expected result option
      | Test |
      | Talk |

    Examples:
      | username | password    | expected result | expected result1 |
      | user7    | Userpass123 | User7           | Talk             |
      | user34   | Userpass123 | test_user       | Talk             |
      | user99   | Userpass123 | Test            | Talk             |






