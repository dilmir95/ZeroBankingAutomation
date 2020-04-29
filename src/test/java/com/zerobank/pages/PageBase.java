package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {
    protected WebDriver driver = Driver.getDriver();

    protected WebDriverWait wait = new WebDriverWait(driver,10);


    public PageBase(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (tagName = "button")
    private WebElement signInBtn;

    public void clickSignIn(){
        signInBtn.click();
    }

}
