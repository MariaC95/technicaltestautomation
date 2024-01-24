package org.example.pages.chrome.home;

import com.google.inject.Inject;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.pages.common.home.HomeWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeWebpageChrome extends HomeWebpage {
    @Inject
    public HomeWebpageChrome(WebDriver driver) {
        super(driver);
        this.homeScreenIdentifierLocator = By.xpath("//div[@id='slider-carousel']/a/i");
        this.addToCartLocator = By.xpath("(//a[contains(text(),'Add to cart')])");
        this.dismissModalLocator = By.cssSelector(".close-modal");
        this.viewProductButtonLocator = By.linkText("View Product");
    }

    @Override
    public void clickAddToCart() {
        List<WebElement> list = driver.findElements(addToCartLocator);
        int listSize = list.size();
        String randomItem = RandomStringUtils.randomNumeric(1,listSize);
        addToCartLocator = By.xpath(addToCartLocator + "["+ randomItem +"]");
        driver.findElement(addToCartLocator);
        driver.findElement(dismissModalLocator).click();
    }
}
