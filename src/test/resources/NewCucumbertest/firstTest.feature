Feature: Web login
  Scenario: User should be able to login with valid credentials
    Given the user is on login page
    When the user enter valid credentials
    And clicks on submit
    Then the user should be able to login successfully


