Feature: Web check my profile page
  Scenario: User should be able to open my profile page after login
    Given the user is logged in
    When the user clicks on my profile icon
    Then the user should be redirected to my profile page
