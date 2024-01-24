package org.example.pages.common.commonUses;

import org.example.contracts.common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonWebpage implements Common {
    protected WebDriver driver;

    protected By continueButtonLocator;
    protected By deleteAccountButtonLocator;
    protected By deleteAccountTextLocator;
    public CommonWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void clickContinueButton() {
        driver.findElement(continueButtonLocator).click();
    }

    @Override
    public boolean isUsernameDisplayed(String name) {
        //this is called in Chrome specific page object
        return false;
    }

    @Override
    public void clickDeleteAccountButton() {
        driver.findElement(deleteAccountButtonLocator).click();
    }

    @Override
    public boolean isDeleteAccountConfirmationDisplayed() {
        return driver.findElement(deleteAccountTextLocator).isDisplayed();
    }
}
