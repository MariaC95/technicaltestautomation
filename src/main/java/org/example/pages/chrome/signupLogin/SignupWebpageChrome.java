package org.example.pages.chrome.signupLogin;

import com.google.inject.Inject;
import org.example.pages.common.signupLogin.SignupWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupWebpageChrome extends SignupWebpage {

    @Inject
    public SignupWebpageChrome(WebDriver driver) {
        super(driver);
        this.signupTextLocator = By.cssSelector(".signup-form > h2");
        this.nameSignupLocator = By.name("name");
        this.emailSignupLocator = By.xpath("(//input[@name='email'])[2]");
        this.signupButtonLocator = By.xpath("(//button[@type='submit'])[2]");
        this.accountCreatedTextLocator = By.cssSelector(".title");
    }
}
