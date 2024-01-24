package org.example.pages.common.signupLogin;

import org.example.contracts.signupLogin.SignupLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupLoginWebpage implements SignupLogin {
    private WebDriver driver;

    protected By signupLoginButtonLocator;

    public SignupLoginWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void navigateToSignupLogin() {
        WebElement signupLoginButton = driver.findElement(signupLoginButtonLocator);
        signupLoginButton.click();
    }
}
