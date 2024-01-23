package org.example.steps.Common;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.example.pages.common.HomeWebpage;
import org.example.utils.Defaults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CommonSteps {

    private WebDriver driver;
    private HomeWebpage home;
    private Defaults constant;

    private final boolean expectedResult = true;
    private boolean actualResult;
    private String reasonForFailure;


    @Before
    public void setup(){
        driver = new ChromeDriver();
        home = new HomeWebpage(driver);
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Given("the homepage is visible")
    public void theHomepageIsVisible() {
        driver.get(constant.getUrl());
        actualResult = home.isVisible();
        reasonForFailure = "home page was not visible";
        assertThat(reasonForFailure, actualResult, equalTo(expectedResult));
    }
}
