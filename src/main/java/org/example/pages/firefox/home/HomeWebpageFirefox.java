package org.example.pages.firefox.home;

import com.google.inject.Inject;
import org.example.pages.common.home.HomeWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeWebpageFirefox extends HomeWebpage {
    @Inject
    public HomeWebpageFirefox(WebDriver driver) {
        super(driver);
        this.homeScreenIdentifierLocator = By.cssSelector(".control-carousel > .fa-angle-left");
        this.addToCartLocator = By.xpath("(//a[contains(text(),'Add to cart')])");
        this.dismissModalLocator = By.cssSelector(".close-modal");
        this.viewProductButtonLocator = By.linkText("View Product");
    }
}
