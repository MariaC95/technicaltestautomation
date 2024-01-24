package org.example.config.drivers;

import org.openqa.selenium.WebDriver;

public class WebDriverProvider {

    public WebDriver browserDriver(){
        WebDriver driver;
        switch (System.getProperty("browser")){
            case "chrome" :
                return driver = new ChromeWebDriver().buildChromeDriver();
            case "firefox" :
                return driver = new FirefoxWebDriver().buildFirefoxDriver();
            default:
                throw new IllegalArgumentException("web browser not set in junit configurations");
        }
    }
}
