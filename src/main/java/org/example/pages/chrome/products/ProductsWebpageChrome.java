package org.example.pages.chrome.products;

import org.example.pages.common.products.ProductsWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsWebpageChrome extends ProductsWebpage {
    public ProductsWebpageChrome(WebDriver driver) {
        super(driver);
        this.productDetailTextLocator = By.cssSelector(".product-information");
        this.quantityIncreaseButtonLocator = By.id("quantity");
        this.addToCartButtonLocator = By.cssSelector(".cart");
        this.quantityTextLocator = By.id("quantity");
    }
}
