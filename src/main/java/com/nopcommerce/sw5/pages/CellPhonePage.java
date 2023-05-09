package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customerlisteners.CustomListeners;
import com.nopcommerce.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement cellPhoneText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listViewTab;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020;

    public String getCellPhoneText() {
        Reporter.log("Get Cell Phone Text");
       // CustomListeners.test.log(Status.PASS,"Get Cell Phone Text");
        return getTextFromElement(cellPhoneText);
    }

    public void clickOnListViewTab() {
        Reporter.log("Click on List View");
        clickOnElement(listViewTab);
        CustomListeners.test.log(Status.PASS,"Click on List View");
    }

    public void clickOnNokiaLumia1020() {
        Reporter.log("Click on List View");
        clickOnElement(nokiaLumia1020);
       // CustomListeners.test.log(Status.PASS,"Click on List View");
    }
}
