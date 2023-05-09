package com.nopcommerce.sw5.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.sw5.customerlisteners.CustomListeners;
import com.nopcommerce.sw5.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputer extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourComputerText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddRadio;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement msOfficeSoftware;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommander;
    @CacheLookup
    @FindBy(xpath = "//span[@class='price-value-1']")
    WebElement priceText;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    WebElement verifyProductAddedToCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeTheBarMsg;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart1;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnGoToCartButton1;


    public String getTextFromBuildYourComputer() {
        Reporter.log("Build your computer");
        CustomListeners.test.log(Status.PASS,"Build your computer");
        return getTextFromElement(buildYourComputerText);

    }

    public void selectProcessor() {
        Reporter.log("Select Processor");
        selectByValueFromDropDown(processor, "1");
        CustomListeners.test.log(Status.PASS,"Select Processor");
    }

    public void selectRAM() {
        Reporter.log("Select Ram");
        selectByValueFromDropDown(ram, "5");
        CustomListeners.test.log(Status.PASS,"Select Ram");

    }

    public void selectHDDRadio() {
        Reporter.log("Select HDD Radio");
        clickOnElement(hddRadio);
        CustomListeners.test.log(Status.PASS,"Select HDD Radio");

    }

    public void selectOSRadio() {
        Reporter.log("Select OS Radio");
        clickOnElement(osRadio);
        CustomListeners.test.log(Status.PASS,"Select OS Radio");

    }

    public void selectSoftwareMS() {
        Reporter.log("Select Software");
        clickOnElement(msOfficeSoftware);
        CustomListeners.test.log(Status.PASS,"Select Software");

    }

    public void selectTotalCommander() {
        Reporter.log("Select total Commander");
        clickOnElement(totalCommander);
        CustomListeners.test.log(Status.PASS,"Select Total Commander");

    }

    public String getTextFromPrice() {
        Reporter.log("Get Price list");
        CustomListeners.test.log(Status.PASS,"Get Price list");
        return getTextFromElement(priceText);
    }

    public void clickOnAddToCartButton() {
        Reporter.log("Click on Add to Cart Button");
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS,"Click on Add to Cart Button");


    }

    public String verifyTheProductHasBeenAddedToYourShoppingCart() {
        Reporter.log("Verity the product has been added");
        CustomListeners.test.log(Status.PASS,"Verify the product has been added");
        return getTextFromElement(verifyProductAddedToCart);
    }

    public void closeTheBarByClickingOnTheCrossButton() {
        Reporter.log("Close The Bar clicking on CrossButton");
        clickOnElement(closeTheBarMsg);
        CustomListeners.test.log(Status.PASS,"Close The Bar clicking on CrossButton");

    }

    public void mouseHoverOnShoppingCartButton() {
        Reporter.log("Mouse Hover on Shopping Cart button");
        mouseHoverToElement(mouseHoverOnShoppingCart1);
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Shopping Cart button");

    }

    public void clickOnGoToCartButton() {
        Reporter.log("Click on to Cart button");
        clickOnElement(clickOnGoToCartButton1);
        CustomListeners.test.log(Status.PASS,"Click on to Cart button");
    }

}
