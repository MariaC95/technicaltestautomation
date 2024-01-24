package org.example.pages.firefox.products;

import com.google.inject.Inject;
import org.example.pages.common.products.ProductsWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsWebpageFirefox extends ProductsWebpage {
    @Inject
    public ProductsWebpageFirefox(WebDriver driver) {
        super(driver);
        this.productDetailTextLocator = By.cssSelector(".product-information");
        this.quantityIncreaseButtonLocator = By.id("quantity");
        this.addToCartButtonLocator = By.xpath("//button[@type='button']");
        this.quantityTextLocator = By.id("quantity");
    }
}
