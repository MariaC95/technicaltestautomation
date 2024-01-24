package org.example.steps.SignupLogin;

import com.google.inject.Inject;
import io.cucumber.java8.En;
import org.example.contracts.signupLogin.Login;
import org.example.contracts.signupLogin.Signup;
import org.example.contracts.signupLogin.SignupForm;
import org.example.contracts.signupLogin.SignupLogin;
import org.example.utils.Defaults;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class RegisterUserSteps implements En {

    private final boolean expectedResult = true;
    private boolean actualResult;
    private String reasonForFailure;
    @Inject
    public RegisterUserSteps(
            SignupLogin signupLogin,
            Signup signup,
            SignupForm signupForm,
            Defaults defaults,
            Login login) {

        Then("^the signup page is displayed$", () -> {
            actualResult = signup.isVisible();
            reasonForFailure = "'New User Signup!' text is not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });

        When("^the user enters their name and email address to signup$", () -> {
            signup.enterSignUpDetails(defaults.getGeneratedName(), defaults.getGeneratedEmail());
        });

        And("^clicks the signup button$", signup::clickSignupButton);

        Then("^the enter account information page is displayed$", () -> {
            actualResult = signupForm.isSignupFormDisplayed();
            reasonForFailure = "'ENTER ACCOUNT INFORMATION' was not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });

        When("^the user fills out their account information on the signup form$", () -> {
            signupForm.selectTitle();
            signupForm.enterPassword(defaults.getGeneratedPassword());
            signupForm.selectBirthday();
        });

        And("^the user selects the checkbox to sign up for newsletters$", signupForm::selectNewsletter);

        And("^the user selects the checkbox to receive special offers$", signupForm::selectSpecialOffer);

        When("^the user fills out their address information on the signup form$", () -> {
            signupForm.enterAddress(defaults.getGeneratedName());
        });

        And("^clicks the create account button$", signupForm::clickCreateAccount);

        Then("^the account created page is displayed$", () -> {
            actualResult = signup.isAccountCreatedPageDisplayed();
            reasonForFailure = "'ACCOUNT CREATED!' text was not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });

    }
}
