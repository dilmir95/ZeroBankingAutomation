package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityPage extends PageBase {

    @FindBy(id = "aa_accountId")
    private WebElement accountTypeSelect;

    public List<String> getAllOptions() {
        wait.until(ExpectedConditions.elementToBeClickable(accountTypeSelect));
        accountTypeSelect.click();
        Select select = new Select(accountTypeSelect);
        List<WebElement> allOptionsElements = select.getOptions();
        List<String> list = new ArrayList<>();

        for (WebElement each : allOptionsElements) {
         list.add(each.getText());
        }

        return list;
    }

    public List<String> getAllSelectedOptions(){
        wait.until(ExpectedConditions.elementToBeClickable(accountTypeSelect));
        accountTypeSelect.click();
        Select select = new Select(accountTypeSelect);
        List<WebElement> allOptionsElements = select.getAllSelectedOptions();
        List<String> list = new ArrayList<>();

        for (WebElement each: allOptionsElements){
            list.add(each.getText());
        }
        return list;
    }
}
