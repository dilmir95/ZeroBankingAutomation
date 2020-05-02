package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PayBillsPage extends PageBase {
    @FindBy(id = "sp_payee")
    private WebElement payeeSelect;

    @FindBy(id = "sp_account")
    private WebElement accountSelect;

    @FindBy(id = "sp_amount")
    private WebElement amountInputBox;

    @FindBy(id = "sp_date")
    private WebElement dateInputBox;

    @FindBy(id = "sp_description")
    private WebElement descriptionInputBox;

    @FindBy(id ="pay_saved_payees")
    private WebElement payBtn;

    @FindBy(id = "alert_content")
    private WebElement sucessMsg;

    public void selectPayee(String option){
        Select select = new Select(payeeSelect);
        select.selectByVisibleText(option);
    }
    public void selectAccount(String option){
        Select select = new Select(accountSelect);
        select.selectByVisibleText(option);
    }

    public void setAmountInputBox(String amount){
        amountInputBox.sendKeys(amount);
    }

    public void setDate(String dayOfTheMonth){
        String xpath = "//table//td[.='"+dayOfTheMonth+"']";
        dateInputBox.click();

       WebElement date = Driver.getDriver().findElement(By.xpath(xpath)) ;

       wait.until(ExpectedConditions.elementToBeClickable(date)).click();

    }

    public void setDescriptionInputBox(String description){
        descriptionInputBox.sendKeys(description);
    }

    public void clickPay(){
        payBtn.click();
    }

    public String getSuccessText(){
       return sucessMsg.getText();
    }

    public String getValidationMessage(){
        WebElement element = driver.findElement(By.name("uname"));
        return element.getAttribute("validationMessage");

    }


}
