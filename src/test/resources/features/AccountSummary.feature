Feature: Account Summary

  @accountSummary
  Scenario: Account Summary title confirmation
  Given user is on the login page
    When user logs in
    And user nagivates to "Account Summary" page
    Then title should be "Zero - Account Summary"

    @accounts
    Scenario: Account summary page should have account types of: Cash,Investment,Credit,Loan and verify
      credit accounts have following columns: Account,Credit Card, Balance;

      Given user is on the login page
      When user logs in
      And user nagivates to "Account Summary" page
      And verifies listed accounts
      Then verifies Credit Accounts table columns
