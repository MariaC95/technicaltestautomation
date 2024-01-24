package org.example.config.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriver {

    public WebDriver chromeDriver;

    public WebDriver buildChromeDriver(){
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\mariaconnolly95\\Downloads\\chromedriver-win64\\chromedriver-win64");
            return chromeDriver = new ChromeDriver();
        } catch (Exception error) {
            throw new RuntimeException("Failed to build Chrome Driver", error);
        }
    }

}
