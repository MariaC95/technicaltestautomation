package org.example.pages.firefox.signupLogin;

import com.google.inject.Inject;
import org.example.pages.common.signupLogin.LoginWebpage;
import org.openqa.selenium.WebDriver;

public class LoginWebpageFirefox extends LoginWebpage {
    @Inject
    public LoginWebpageFirefox(WebDriver driver) {
        super(driver);
    }
}
