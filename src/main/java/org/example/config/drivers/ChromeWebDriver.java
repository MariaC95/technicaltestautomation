package org.example.config.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriver {

    public WebDriver chromeDriver;

    public WebDriver buildChromeDriver(){
        try {
            return chromeDriver = new ChromeDriver();
        } catch (Exception error) {
            throw new RuntimeException("Failed to build Chrome Driver", error);
        }
    }

}
