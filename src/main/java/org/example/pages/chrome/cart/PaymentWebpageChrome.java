package org.example.pages.chrome.cart;

import org.example.pages.common.cart.PaymentWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentWebpageChrome extends PaymentWebpage {
    public PaymentWebpageChrome(WebDriver driver) {
        super(driver);
        this.nameOnCardLocator = By.name("name_on_card");
        this.cardNumberLocator = By.name("card_number");
        this.cvcNumberLocator = By.name("cvc");
        this.expiryDateMonthLocator = By.name("expiry_month");
        this.expiryDateYearLocator = By.name("expiry_year");
        this.payAndConfirmButtonLocator = By.id("submit");
    }
}
