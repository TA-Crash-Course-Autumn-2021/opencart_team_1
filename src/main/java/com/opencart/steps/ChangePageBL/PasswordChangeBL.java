package com.opencart.steps.ChangePageBL;

import com.opencart.datamodel.PasswordModel;
import com.opencart.pages.ChangePage.PasswordChangePage;
import com.opencart.repository.PasswordModelRepository;
import com.opencart.steps.Search_MyAccountPageBL.MyAccountPageBL;
import org.testng.Assert;

import static com.opencart.repository.PasswordModelRepository.invalidPassword;
import static com.opencart.repository.PasswordModelRepository.validPassword;

public class PasswordChangeBL {

    private PasswordChangePage passwordChangePage;

    public PasswordChangeBL() { passwordChangePage = new PasswordChangePage(); }

    private void clickOnContinueButton() {
        passwordChangePage.getChangePasswordContinueButton().click();
    }

    public PasswordChangeBL validLoginChange(String newPassword) {
        passwordChangePage.getChangePasswordString().clear();
        passwordChangePage.getChangePasswordString().sendKeys(newPassword);
        passwordChangePage.getChangePasswordConfirmString().clear();
        passwordChangePage.getChangePasswordConfirmString().sendKeys(newPassword);
        passwordChangePage.getChangePasswordContinueButton().click();
        return this;
    }

    public MyAccountPageBL successLoginCheck() {
        String expectingMessage = "Success: Your password has been successfully updated.";
        String actualMessage = passwordChangePage.getSuccessLoginAlert().getText();
        Assert.assertEquals(expectingMessage, actualMessage);
        return new MyAccountPageBL();
    }

    public PasswordChangeBL PasswordChangeSuccess() {
        PasswordModel passwordModel = PasswordModelRepository.validPassword();
        validPassword(passwordModel.getPassword());
        clickOnContinueButton();
        passwordChangePage.getSuccessLoginAlert();
    }

    public PasswordChangeBL PasswordChangeUnsuccess(){
        PasswordModel passwordModel = invalidPassword();
        invalidPassword(passwordModel.getPassword());
        clickOnContinueButton();
        return this;
    }
}