package org.example.contracts.signupLogin;

public interface SignupForm {

    boolean isSignupFormDisplayed();

    void selectTitle();

    void enterPassword(String password);

    void selectBirthday();

    void selectNewsletter();

    void selectSpecialOffer();

    void enterAddress(String name);

    void clickCreateAccount();
}
