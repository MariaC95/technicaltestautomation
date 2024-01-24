
package org.example.pages.firefox.cart;

import com.google.inject.Inject;
import org.example.pages.common.cart.PaymentWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentWebpageFirefox extends PaymentWebpage {
    @Inject
    public PaymentWebpageFirefox(WebDriver driver) {
        super(driver);
        this.nameOnCardLocator = By.name("name_on_card");
        this.cardNumberLocator = By.name("card_number");
        this.cvcNumberLocator = By.name("cvc");
        this.expiryDateMonthLocator = By.name("expiry_month");
        this.expiryDateYearLocator = By.name("expiry_year");
        this.payAndConfirmButtonLocator = By.id("submit");
    }
}
