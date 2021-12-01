package com.opencart.steps.ChangePageBL;

import com.opencart.pages.ChangePage.PasswordChangePage;
import com.opencart.steps.Search_MyAccountPageBL.MyAccountPageBL;
import org.testng.Assert;

public class PasswordChangeBL {

    private PasswordChangePage passwordChangePage;

    public PasswordChangeBL() { passwordChangePage = new PasswordChangePage(); }

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
}