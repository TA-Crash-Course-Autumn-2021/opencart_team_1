package com.opencart.steps.Search_MyAccountPageBL;

import com.opencart.pages.Search_MyAccountPage.MyAccountPage;
import com.opencart.steps.Search_MyAccountPageBL.EditAccountInformationBL;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL(){ myAccountPage = new MyAccountPage(); }

    public EditAccountInformationBL myAccountPassChangeClick(){
        myAccountPage.getMyAccountPassChange().click();
        return new EditAccountInformationBL();
    }
}