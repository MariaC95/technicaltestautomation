package org.example.contracts.cart;

public interface Cart {

    void navigateToCart();

    boolean isDisplayed();

    void clickProceedToCheckoutButton();

    boolean areAddressDetailsDisplayed();

    boolean isOrderDisplayed();

    void enterDescription(String description);

    void clickPlaceOrderButton();

    boolean isSuccessMessageDisplayed();
}
