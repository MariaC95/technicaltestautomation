package org.example.steps.Common;

import com.google.inject.Inject;
import io.cucumber.java8.En;
import org.apache.commons.lang3.NotImplementedException;
import org.example.contracts.cart.Cart;
import org.example.contracts.common.Common;
import org.example.contracts.home.Home;
import org.example.contracts.signupLogin.SignupLogin;
import org.example.utils.Defaults;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CommonSteps implements En {

    private final boolean expectedResult = true;
    private boolean actualResult;
    private String reasonForFailure;
    @Inject
    public CommonSteps(
            Home home,
            Common common,
            Defaults defaults,
            SignupLogin signupLogin,
            Cart cart) {

        When("^the user clicks on the continue button$", common::clickContinueButton);

        Then("^the username is displayed$", () -> {
            actualResult = common.isUsernameDisplayed(defaults.getGeneratedName());
            reasonForFailure = "'Logged in as " + defaults.getGeneratedName() + " was not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });

        When("^the user clicks on the delete account button$", common::clickDeleteAccountButton);

        Then("^the deleted account confirmation page is displayed$", () -> {
            actualResult = common.isDeleteAccountConfirmationDisplayed();
            reasonForFailure = "'ACCOUNT DELETED!' text was not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });

        When("^the user clicks on the (signupLogin|home|products|cart|contactUs) button$", (String navButtons) -> {
            switch (navButtons){
                case "signupLogin" :
                    signupLogin.navigateToSignupLogin();
                    break;
                case "cart" :
                    cart.navigateToCart();
                    break;
                case "home" :
                case "products" :
                case "contactUs":
                default:
                    throw new NotImplementedException("No implementation was found for " + navButtons);
            }
        });

        And("^the user clicks on the view cart modal button$", common::clickViewCartModalButton);
    }
}
