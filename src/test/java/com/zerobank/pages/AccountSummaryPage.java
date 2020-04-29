package com.zerobank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends PageBase {

    @FindBy(xpath = "//h2")
    private List<WebElement> accountsList;

    @FindBy(xpath = "//h2[3]/following-sibling::div[1]/div/table/thead/tr/th")
    private List<WebElement> creditAccountsSublist;


    public List<String> getAccountList(){
        List<String> list = new ArrayList<>();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2")));
        for(WebElement each: accountsList ){
            list.add(each.getText());
        }
        return list;
    }

    public List<String> getCreditAccountsSublists(){
        List<String> list = new ArrayList<>();
        for(WebElement each: creditAccountsSublist){
            list.add(each.getText().trim());
        }
        return list;


    }
}
