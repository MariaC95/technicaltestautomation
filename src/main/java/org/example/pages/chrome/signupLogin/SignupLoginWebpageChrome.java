package org.example.pages.chrome.signupLogin;

import com.google.inject.Inject;
import org.example.pages.common.signupLogin.SignupLoginWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginWebpageChrome extends SignupLoginWebpage {
    @Inject
    public SignupLoginWebpageChrome(WebDriver driver) {
        super(driver);
        this.signupLoginButtonLocator = By.linkText("linkText=Signup / Login");
    }
}
