package org.example.pages.firefox.cart;

import com.google.inject.Inject;
import org.example.pages.common.cart.CartWebpage;
import org.openqa.selenium.WebDriver;

public class CartWebpageFirefox extends CartWebpage {
    @Inject
    public CartWebpageFirefox(WebDriver driver) {
        super(driver);
    }
}
