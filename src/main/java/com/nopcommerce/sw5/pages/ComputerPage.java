package com.nopcommerce.sw5.pages;

import com.nopcommerce.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//img[@alt='Picture for category Desktops']")
    WebElement desktopCategory;

    public void clickOnDesktopCategory() {
        Reporter.log("Click on Desktop Category");
        clickOnElement(desktopCategory);
     //   CustomListeners.test.log(Status.PASS, "Click on Desktop Category");

    }
}



