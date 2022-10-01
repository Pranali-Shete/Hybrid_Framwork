Feature: Test orange HRM Applications

  Scenario: Test login Functionality
    Given user is on login page
    When user enter valid username and valid password
    Then user will be home page