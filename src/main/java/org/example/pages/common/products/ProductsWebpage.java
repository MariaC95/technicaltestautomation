package org.example.pages.common.products;

import org.example.contracts.products.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsWebpage implements Products {
    private WebDriver driver;

    protected By productDetailTextLocator;
    protected By quantityIncreaseButtonLocator;
    protected By addToCartButtonLocator;
    protected By quantityTextLocator;
    private int initialQuantity = 1;
    private int finalQuantity;

    public ProductsWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isProductDetailDisplayed() {
        return driver.findElement(productDetailTextLocator).isDisplayed();
    }

    @Override
    public void increaseQuantity(int quantity) {
        while (initialQuantity != quantity){
            driver.findElement(quantityIncreaseButtonLocator).click();
            initialQuantity++;
        }
        finalQuantity = initialQuantity;
    }

    @Override
    public void clickAddToCartButton() {
        driver.findElement(addToCartButtonLocator).click();
    }

    @Override
    public boolean isCorrectQuantityDisplayed() {
        String actualQuantity = driver.findElement(quantityTextLocator).getAttribute("Value");
        String setQuantity = Integer.toString(finalQuantity);
        return actualQuantity.equals(setQuantity);
    }
}
