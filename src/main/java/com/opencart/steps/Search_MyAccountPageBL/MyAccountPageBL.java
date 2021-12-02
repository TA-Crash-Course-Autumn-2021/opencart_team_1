package com.opencart.steps.Search_MyAccountPageBL;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.Search_MyAccountPage.EditAccountInformation;
import com.opencart.pages.Search_MyAccountPage.MyAccountPage;
import com.opencart.steps.ChangePageBL.PasswordChangeBL;
import com.opencart.steps.Search_MyAccountPageBL.EditAccountInformationBL;
import org.testng.Assert;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;
    private EditAccountInformation editAccountInformation;

    public MyAccountPageBL(){ myAccountPage = new MyAccountPage(); }

    public EditAccountInformationBL myAccountEditClick(){
        myAccountPage.getMyAccountEdit().click();
        return new EditAccountInformationBL();
    }

    public EditAccountInformationBL myAccountPassChangeClick(){
        myAccountPage.getMyAccountPassChange().click();
        return new EditAccountInformationBL();
    }

    public MyAccountPageBL LoginCheckSuccess() {
        String expected = "http://localhost/opencart/upload/index.php?route=account/account";
        String actual = DriverRepository.DRIVERS.get().getCurrentUrl();
        Assert.assertEquals(expected, actual);
        return new MyAccountPageBL();
    }

    public MyAccountPageBL AccountChangingConfirm() {
        String actual =  editAccountInformation.getChangesConfirmMessage().getText();
        String expected = "Success: Your account has been successfully updated.";
        Assert.assertTrue(actual.contains(expected), "Changes are not success");
        return new MyAccountPageBL();
    }
}