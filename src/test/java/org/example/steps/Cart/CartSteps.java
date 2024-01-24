package org.example.steps.Cart;

import com.google.inject.Inject;
import io.cucumber.java8.En;
import org.example.contracts.cart.Cart;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CartSteps implements En {

    private final boolean expectedResult = true;
    private boolean actualResult;
    private String reasonForFailure;
    private String description;

    @Inject
    public CartSteps(Cart cart) {
        Then("^the cart page is displayed$", () -> {
            actualResult = cart.isDisplayed();
            reasonForFailure = "Cart page was not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });

        When("^the user clicks on the proceed to checkout button$", cart::clickProceedToCheckoutButton);

        And("^the address details are displayed$", () -> {
            actualResult = cart.areAddressDetailsDisplayed();
            reasonForFailure = "Address details were not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });

        And("^the user reviews their order$", () -> {
            actualResult = cart.isOrderDisplayed();
            reasonForFailure = "Order details were not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });

        And("^the user enters a description in the text box$", () -> {
            description = "adding comment";
            cart.enterDescription(description);
        });

        Then("^the user clicks on the place order button$", cart::clickPlaceOrderButton);

        And("^the success message is displayed$", () -> {
            actualResult = cart.isSuccessMessageDisplayed();
            reasonForFailure = "'Your order has been placed successfully!' was not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });

        Then("^the user clicks on the x to remove from cart$", cart::clickToRemove);

        And("^the product is removed from the cart$", () -> {
            actualResult = cart.isProductRemoved();
            reasonForFailure = "the product was not removed from the cart";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });
    }
}
