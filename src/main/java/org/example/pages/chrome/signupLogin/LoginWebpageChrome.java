package org.example.pages.chrome.signupLogin;

import com.google.inject.Inject;
import org.example.pages.common.signupLogin.LoginWebpage;
import org.openqa.selenium.WebDriver;

public class LoginWebpageChrome extends LoginWebpage {
    @Inject
    public LoginWebpageChrome(WebDriver driver) {
        super(driver);
    }
}
