package com.opencart.steps;

import com.opencart.pages.EditAccountInformation;

public class EditAccountInformationBL {

    private EditAccountInformation editAccountInformation;

    public EditAccountInformationBL(){ editAccountInformation = new EditAccountInformation(); }

    public EditAccountInformationBL setFirstName(String firstName){
        editAccountInformation.getFirstNameString().clear();
        editAccountInformation.getFirstNameString().sendKeys(firstName);
        return this;
    }

    public EditAccountInformationBL setLastName(String lastName){
        editAccountInformation.getLastNameString().clear();
        editAccountInformation.getLastNameString().sendKeys(lastName);
        return this;
    }

    public EditAccountInformationBL setEmail(String email){
        editAccountInformation.getEmailString().clear();
        editAccountInformation.getEmailString().sendKeys(email);
        return this;
    }

    public EditAccountInformationBL setTelephone(String telephone){
        editAccountInformation.getTelephoneString().clear();
        editAccountInformation.getTelephoneString().sendKeys(telephone);
        return this;
    }

    public MyAccountPageBL editAccountPageBackButtonClick(){
        editAccountInformation.getEditAccountBackButton().click();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL editAccountPageContinueButtonClick(){
        editAccountInformation.getEditAccountContinueButton().click();
        return new MyAccountPageBL();
    }
}