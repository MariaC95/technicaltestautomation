package org.example.steps.Products;

import com.google.inject.Inject;
import io.cucumber.java8.En;
import org.example.contracts.products.Products;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ProductSteps implements En {
    private final boolean expectedResult = true;
    private boolean actualResult;
    private String reasonForFailure;
    @Inject
    public ProductSteps(Products products) {
        Then("^the product detail is displayed$", () -> {
        actualResult = products.isProductDetailDisplayed();
        reasonForFailure = "Product detail is not displayed";
        assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });

        When("^the user increases quantity to (\\d+)$", products::increaseQuantity);

        And("^the user clicks on the add to cart button$", products::clickAddToCartButton);

        Then("^the correct quantity is displayed$", () -> {
            actualResult = products.isCorrectQuantityDisplayed();
            reasonForFailure = "The correct quantity was not displayed";
            assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
        });
    }
}
