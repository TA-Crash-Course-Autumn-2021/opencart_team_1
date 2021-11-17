package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    //Header search field
    @FindBy(xpath = ".//*[@id='search']/input")
    private WebElement searchStr;

    //Header search field button
    @FindBy(xpath = ".//*[@id='search']/span/button")
    private WebElement searchStrSub;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getSearch() {
        return searchStr;
    }

    public WebElement getSearchStrSub() {
        return searchStrSub;
    }
}