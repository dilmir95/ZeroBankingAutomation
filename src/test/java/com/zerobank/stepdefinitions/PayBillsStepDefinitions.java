package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PayBillsStepDefinitions {

    PayBillsPage payBillsPage = new PayBillsPage();


    @Then("fills following information, {string} , {string} ,{string} , {string} , {string}")
    public void fills_following_information(String payee, String accountType, String amount, String dayOfTheMonth, String description) {
        payBillsPage.selectPayee(payee);
        payBillsPage.selectAccount(accountType);
        payBillsPage.setAmountInputBox(amount);
        payBillsPage.setDate(dayOfTheMonth);
        payBillsPage.setDescriptionInputBox(description);
        payBillsPage.clickPay();
    }

    @Then("verify that the result is {string}")
    public void verify_that_the_result_is(String result) {
        if (result.equalsIgnoreCase("The payment was successfully submitted.")){
            Assert.assertEquals(result,payBillsPage.getSuccessText());
        }else{
            Assert.assertEquals(result,payBillsPage.getValidationMessage());
        }


    }


}
