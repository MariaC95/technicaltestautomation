package org.example.pages.common.home;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.contracts.home.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomeWebpage implements Home {
    protected WebDriver driver;
    protected By homeScreenIdentifierLocator;
    protected By addToCartLocator;
    protected By dismissModalLocator;

    public HomeWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isVisible() {
        return driver.findElement(homeScreenIdentifierLocator).isDisplayed();
    }

    @Override
    public void clickAddToCart() {

    }
}
