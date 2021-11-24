package com.opencart.steps;

import com.opencart.pages.MyAccountPage;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL(){ myAccountPage = new MyAccountPage(); }

    public EditAccountInformationBL myAccountPassChangeClick(){
        myAccountPage.getMyAccountPassChange().click();
        return new EditAccountInformationBL();
    }
}