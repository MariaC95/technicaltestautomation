package org.example.pages.common.cart;

import org.example.contracts.cart.Payment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.ThreadLocalRandom;

public class PaymentWebpage implements Payment {
    private WebDriver driver;

    protected By nameOnCardLocator;
    protected By cardNumberLocator;
    protected By cvcNumberLocator;
    protected By expiryDateMonthLocator;
    protected By expiryDateYearLocator;
    protected By payAndConfirmButtonLocator;
    public PaymentWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void enterPaymentDetails(String name) {
        driver.findElement(nameOnCardLocator).sendKeys(name);
        driver.findElement(cardNumberLocator).sendKeys(generateNumber(100000000));
        driver.findElement(cvcNumberLocator).sendKeys(generateNumber(100));
        driver.findElement(expiryDateMonthLocator).sendKeys(generateNumber(10));
        driver.findElement(expiryDateYearLocator).sendKeys(generateNumber(1000));
    }

    @Override
    public void clickPayAndConfirmButton() {
        driver.findElement(payAndConfirmButtonLocator).click();
    }

    private String generateNumber(int valueLength){
        //(valueLength*10-9) to get boundary of number - e.g. 100, 999
        int number = ThreadLocalRandom.current().nextInt(valueLength, valueLength*10-1);
        return Integer.toString(number);
    }

}
