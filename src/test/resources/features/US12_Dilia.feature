Feature: Story: As a user, I should be able to access to Contacts module.


  @wip
  Scenario:  verify user access to Talks module
    Given user on the login page
    When user use username "username" and passcode "password"
    And user click the login button
    When the user clicks the "Talk" module
    Then verify the page title is "Trycloud"


