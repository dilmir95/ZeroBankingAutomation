package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivityStepDefinitions {
    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Then("selected account should be {string}")
    public void selected_account_should_be(String defaultAccountType) {
        Assert.assertEquals(defaultAccountType,accountActivityPage.getAllSelectedOptions().get(0));
    }

    @Then("all options should be the following:")
    public void all_options_should_be_the_following(List<String> dataTable) {
     Assert.assertEquals(dataTable,accountActivityPage.getAllOptions());
    }
}
