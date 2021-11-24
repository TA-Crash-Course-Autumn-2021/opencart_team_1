package com.opencart.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(), 'Edit your account information')]")
    WebElement myAccountEdit;

    @FindBy(xpath = "//*[contains(text(), 'Change your password']")
    WebElement myAccountPassChange;

    @FindBy(xpath = "//*[contains(text(), 'Modify your address book entries']")
    WebElement myAccountAddressBook;

    @FindBy(xpath = "//*[contains(text(), 'Modify your wish list']")
    WebElement myAccountWishList;

}
