package com.opencart.pages.RegisterPage;

import com.opencart.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class RegisterPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmInput;

    @FindBy(name = "agree")
    private WebElement policy;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement continueButton;

    public WebElement getSubscribeRadioButton(int value) {
        return driver.findElement(By.xpath("//*[@type = 'radio' and @value = '" + value + "']"));
    }
}