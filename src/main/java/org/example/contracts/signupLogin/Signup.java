package org.example.contracts.signupLogin;

public interface Signup {

    boolean isVisible();

    void enterSignUpDetails(String name, String email);

    void clickSignupButton();

    boolean isAccountCreatedPageDisplayed();

}
