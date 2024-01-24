package org.example.pages.chrome.commonUses;

import com.google.inject.Inject;
import org.example.pages.common.commonUses.CommonWebpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonWebpageChrome extends CommonWebpage {
    @Inject
    public CommonWebpageChrome(WebDriver driver) {
        super(driver);
        this.continueButtonLocator = By.linkText("Continue");
        this.deleteAccountButtonLocator = By.linkText("Delete Account");
        this.deleteAccountTextLocator = By.cssSelector(".title");
        this.viewCartModalButtonLocator = By.cssSelector(".btn-success");
    }

    @Override
    public boolean isUsernameDisplayed(String name) {
        By userNameLocator = By.xpath("//b[contains('" + name + "')]");
        return driver.findElement(userNameLocator).isDisplayed();
    }
}
