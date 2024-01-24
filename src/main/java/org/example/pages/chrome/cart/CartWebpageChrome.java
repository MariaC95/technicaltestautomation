package org.example.pages.chrome.cart;

import com.google.inject.Inject;
import org.example.pages.common.cart.CartWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartWebpageChrome extends CartWebpage {
    @Inject
    public CartWebpageChrome(WebDriver driver) {
        super(driver);
        this.cartButtonLocator = By.linkText("Cart");
        this.cartPageIdentifierLocator = By.xpath("//table[@id='cart_info_table']");
        this.proceedToCheckoutButtonLocator = By.linkText("Proceed To Checkout");
        this.addressDetailsTextLocator = By.id("address_delivery");
        this.orderDetailsTextLocator = By.xpath("//section[@id='cart_items']");
        this.descriptionTextBoxLocator = By.name("message");
        this.placeOrderButtonLocator = By.linkText("Place Order");
        this.successMessageTextLocator = By.xpath("//p[contains(.,'Congratulations! Your order has been confirmed!')]");
        this.xButtonLocator = By.cssSelector("#empty_cart > .text-center");
        this.emptyCartTextLocator = By.id("empty_cart");
    }
}
