package com.nopcommerce.sw5.pages;

import com.nopcommerce.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[text()='Electronics ']")
    WebElement electronicsCategory;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhone;

    public void hoverOnElectronics() {
        Reporter.log("Mousehover on Electronics category " + electronicsCategory.toString());
        mouseHoverToElement(electronicsCategory);
      //  CustomListeners.test.log(Status.PASS, "Mouseover on Electronics category ");
    }

    public void hoverOnCellPhoneAndClick() {
        Reporter.log("Click on Cellphone ");
        mouseHoverToElementAndClick(cellPhone);
       // CustomListeners.test.log(Status.PASS, "Click on Cellphone ");
    }

}
