package com.opencart.repository;

import com.opencart.datamodel.PasswordModel;

public class PasswordModelRepository {

    private PasswordModelRepository() {
    }

    public static PasswordModel validPassword() {
        String password = LoginModelRepository.getValidLoginModel().getPassword();
        // String password = RandomStringUtils.randomAlphabetic(6);
        return PasswordModel.getBuilder()
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static PasswordModel invalidPassword() {
        String password = RandomStringUtils.randomAlphabetic(6);
        String passwordConfirm = RandomStringUtils.randomAlphabetic(3);
        return PasswordModel.getBuilder()
                .password(password)
                .passwordConfirm(passwordConfirm)
                .build();
    }

}