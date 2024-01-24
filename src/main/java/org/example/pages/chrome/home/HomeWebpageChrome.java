package org.example.pages.chrome.home;

import com.google.inject.Inject;
import org.example.pages.common.home.HomeWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeWebpageChrome extends HomeWebpage {
    @Inject
    public HomeWebpageChrome(WebDriver driver) {
        super(driver);
        this.homeScreen = By.name(" Home");
    }
}
