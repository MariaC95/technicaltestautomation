package org.example.config.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriver {

    public WebDriver firefoxDriver;

    public WebDriver buildFirefoxDriver(){
        try {
            return firefoxDriver = new FirefoxDriver();
        } catch (Exception error) {
            throw new RuntimeException("Failed to build Firefox Driver", error);
        }
    }

}
