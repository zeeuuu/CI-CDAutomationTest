@login
Feature: Login

  @login
  Scenario: Login using valid username and password
    Given user is on login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    When user clicks the login button
    Then user is redirected to the homepage