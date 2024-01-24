package org.example.pages.common.commonUses;

import org.example.contracts.common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonWebpage implements Common {
    protected WebDriver driver;

    protected By continueButtonLocator;
    protected By deleteAccountButtonLocator;
    protected By deleteAccountTextLocator;
    protected By viewCartModalButtonLocator;
    public CommonWebpage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void clickContinueButton() {
        driver.findElement(continueButtonLocator).click();
    }

    @Override
    public boolean isUsernameDisplayed(String name) {
        By userNameLocator = By.xpath("//b[contains('" + name + "')]");
        return driver.findElement(userNameLocator).isDisplayed();
    }

    @Override
    public void clickDeleteAccountButton() {
        driver.findElement(deleteAccountButtonLocator).click();
    }

    @Override
    public boolean isDeleteAccountConfirmationDisplayed() {
        return driver.findElement(deleteAccountTextLocator).isDisplayed();
    }

    @Override
    public void clickViewCartModalButton() {
        driver.findElement(viewCartModalButtonLocator).click();
    }
}
