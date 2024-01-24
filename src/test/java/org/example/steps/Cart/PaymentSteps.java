package org.example.steps.Cart;

import com.google.inject.Inject;
import io.cucumber.java8.En;
import org.example.contracts.cart.Payment;
import org.example.utils.Defaults;

public class PaymentSteps implements En {
    @Inject
    public PaymentSteps(Payment payment,
                        Defaults defaults) {
        When("^the user enters their payment details$", () -> {
            payment.enterPaymentDetails(defaults.getGeneratedName());
        });

        Then("^the user clicks on the pay and confirm order button$", payment::clickPayAndConfirmButton);
    }
}
