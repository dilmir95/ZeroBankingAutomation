@account_activity
Feature: Account Activity

  @account_activity_title
  Scenario: Account activity title should be Zero - Account Activity
    Given user is on the login page
    When  user logs in
    And user nagivates to "Account Activity" page
    Then title should be "Zero - Account Activity"


  @select_check
  Scenario: default account selected should be Savings
    Given user is on the login page
    When user logs in
    And user nagivates to "Account Activity" page
    Then selected account should be "Savings"
    Then all options should be the following:
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |