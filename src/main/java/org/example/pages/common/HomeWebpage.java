package org.example.pages.common;

import org.example.contracts.home.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeWebpage implements Home {
    private WebDriver driver;
    protected By homeScreen;

    public HomeWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isVisible() {
        return driver.findElement(homeScreen).isDisplayed();
    }
}
