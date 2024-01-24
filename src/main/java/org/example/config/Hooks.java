package org.example.config;

import org.example.config.drivers.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

    WebDriver driver;
    WebDriverProvider webDriverProvider;

    public Hooks(WebDriver driver, WebDriverProvider webDriverProvider) {
        this.driver = driver;
        this.webDriverProvider = webDriverProvider;
    }

    @Before
    public void lauchBrowser(){
        driver = new WebDriverProvider().browserDriver();
        driver.manage().window().fullscreen();
        driver.get("automationexercise.com");
    }

    @After
    public void closeBrowser(){
        //TODO delete account if not specified in feature file
        driver.quit();
    }

}
