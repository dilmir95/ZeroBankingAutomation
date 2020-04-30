package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase {

    @FindBy(id = "user_login")
    private WebElement usernameInputBox;

    @FindBy(id = "user_password")
    private WebElement passwordInputBox;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement signInBtn;

    @FindBy (xpath = "//div[@class='alert alert-error']")
    private WebElement errorMsg;


    public void login() {
        wait.until(ExpectedConditions.titleIs("Zero - Log in"));

        usernameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"),Keys.ENTER);


    }

    public void login(String username, String password){
        wait.until(ExpectedConditions.titleIs("Zero - Log in"));
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password,Keys.ENTER);
    }

    public String getLoginErrorMsg(){
        return errorMsg.getText().trim();
    }
    public void navigateTo(String page){
        WebElement element = driver.findElement(By.linkText(page));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}