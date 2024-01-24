package org.example.config.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriver {

    public WebDriver firefoxDriver;

    public WebDriver buildFirefoxDriver(){
        try {
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\mariaconnolly95\\Downloads\\geckodriver-v0.34.0-win-aarch64");
            return firefoxDriver = new FirefoxDriver();
        } catch (Exception error) {
            throw new RuntimeException("Failed to build Firefox Driver", error);
        }
    }

}
