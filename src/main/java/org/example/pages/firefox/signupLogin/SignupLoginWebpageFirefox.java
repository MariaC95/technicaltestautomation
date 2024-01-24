package org.example.pages.firefox.signupLogin;

import com.google.inject.Inject;
import org.example.pages.common.signupLogin.SignupLoginWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginWebpageFirefox extends SignupLoginWebpage {
    @Inject
    public SignupLoginWebpageFirefox(WebDriver driver) {
        super(driver);
        this.signupLoginButtonLocator = By.linkText("Signup / Login");
    }
}
