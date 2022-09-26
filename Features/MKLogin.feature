Feature: feature to login functionality

  Scenario: check login is sucessfull with valid credentials
    Given users is on login page
    When usr enter user name and password
    And clicl on login button
    Then user navigated to the home page
    And check more outcomes
