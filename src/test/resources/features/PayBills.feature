@pay_bills
Feature: Pay Bills
  As a user, I want to be able to pay bills

  Scenario: Title should be Zero - Pay Bills
    Given user is on the login page
    When user logs in
    And user nagivates to "Pay Bills" page
    Then title should be "Zero - Pay Bills"

  Scenario Outline: When user completes a successful Pay operation, The payment was successfully submitted.
    Given user is on the login page
    When user logs in
    And user nagivates to "Pay Bills" page
    Then fills following information, "<payee>" , "<account>" ,"<amount>" , "<date>" , "<description>"
    Then verify that the result is "<result>"

    Examples:
      | payee  | account  | amount | date | description   | result                                  |
      | Apple  | Checking | 700    | 7    | iphone Xs     | The payment was successfully submitted. |
      | Sprint | Savings  | 400    | 17   | iphone 11 Pro | The payment was successfully submitted. |
      | Sprint | Savings  |        | 20   | iphone 11 Pro | Please fill out this field.             |







