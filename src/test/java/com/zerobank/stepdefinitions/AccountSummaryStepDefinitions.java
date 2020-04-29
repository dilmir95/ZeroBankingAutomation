package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class AccountSummaryStepDefinitions {
    LoginPage loginPage = new LoginPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();


    @When("user nagivates to {string} page")
    public void user_nagivates_to_page(String page) {
    loginPage.navigateTo(page);
    }
    @When("verifies listed accounts")
    public void verifies_listed_accounts() {
        List<String> expected = Arrays.asList("Cash Accounts","Investment Accounts"
                ,"Credit Accounts","Loan Accounts");


        Assert.assertEquals(expected,accountSummaryPage.getAccountList());
    }

    @Then("verifies Credit Accounts table columns")
    public void verifies_Credit_Accounts_table_columns() {
      List<String> expected = Arrays.asList("Account","Credit Card","Balance");
      Assert.assertEquals(expected,accountSummaryPage.getCreditAccountsSublists());
    }

}
