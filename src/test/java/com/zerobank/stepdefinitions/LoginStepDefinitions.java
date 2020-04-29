package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.clickSignIn();
    }

    @When("user logs in")
    public void user_logs_in() {
        loginPage.login();
    }

    @Then("title should be {string}")
    public void title_should_be(String title) {
        Assert.assertEquals(title,Driver.getDriver().getTitle());
    }
    @When("user enters invalid credentials")
    public void user_enters_invalid_credentials() {
       loginPage.login("saasasasasa","dadadadaa");
    }

    @Then("user should get error message")
    public void user_should_get_error_message() {
      Assert.assertEquals("Login and/or password are wrong.",loginPage.getLoginErrorMsg());
    }
    @When("user enters blank credentials")
    public void user_enters_blank_credentials() {
        loginPage.login("","");
    }

}
