package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(xpath = ".//input[@id='input-search']")
    private WebElement search;

    @FindBy(xpath = ".//input[@id='button-search']")
    private WebElement searchButton;

    @FindBy(xpath = ".//*[@id='description' and @type='checkbox']")
    private WebElement searchInSubCategories;

    @FindBy(xpath = ".//input[@id='description']")
    private WebElement searchInDesc;

    @FindBys({
            @FindBy(className = "form-control"),
            @FindBy(tagName = "option")
    })
    private List<WebElement> searchInCategories;

    @FindBy(xpath = ".//select[@class='form-control']")
    WebElement searchFormButton;

    @FindBy(xpath = ".//div[@class='product-thumb']")
    List<WebElement> products;

    public List<WebElement> getSearchInCategories() {
        return searchInCategories;
    }

    public WebElement getSearchInSubCategories() {
        return searchInSubCategories;
    }

    public WebElement getSearchInDesc() {
        return searchInDesc;
    }

    public WebElement getSearchFormButton() {
        return searchFormButton;
    }

}