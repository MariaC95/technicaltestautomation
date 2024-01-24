package org.example.pages.common.cart;

import org.example.contracts.cart.Cart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartWebpage implements Cart {
    private WebDriver driver;
    protected By cartButtonLocator;
    protected By cartPageIdentifierLocator;
    protected By proceedToCheckoutButtonLocator;
    protected By addressDetailsTextLocator;
    protected By orderDetailsTextLocator;
    protected By descriptionTextBoxLocator;
    protected By placeOrderButtonLocator;
    protected By successMessageTextLocator;

    public CartWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void navigateToCart() {
        driver.findElement(cartButtonLocator).click();
    }

    @Override
    public boolean isDisplayed() {
        return driver.findElement(cartPageIdentifierLocator).isDisplayed();
    }

    @Override
    public void clickProceedToCheckoutButton() {
        driver.findElement(proceedToCheckoutButtonLocator).click();
    }

    @Override
    public boolean areAddressDetailsDisplayed() {
        return driver.findElement(addressDetailsTextLocator).isDisplayed();
    }

    @Override
    public boolean isOrderDisplayed() {
        return driver.findElement(orderDetailsTextLocator).isDisplayed();
    }

    @Override
    public void enterDescription(String description) {
        driver.findElement(descriptionTextBoxLocator).sendKeys(description);
    }

    @Override
    public void clickPlaceOrderButton() {
        driver.findElement(placeOrderButtonLocator).click();
    }

    @Override
    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessageTextLocator).isDisplayed();
    }
}
