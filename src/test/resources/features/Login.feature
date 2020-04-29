@login
Feature: Login
  As a user, I want to be able to login with valid credentials

  Scenario: login with valid credentials and verify title is Zero - Account Summary
    Given user is on the login page
    When user logs in
    Then title should be "Zero - Account Summary"

    @loginX
  Scenario: user should get error message when enters invalid credentials
    Given user is on the login page
    When user enters invalid credentials
    Then user should get error message

      @loginBlank
   Scenario: user should not be able to login with blank credentials
     Given user is on the login page
     When user enters blank credentials
     Then user should get error message


