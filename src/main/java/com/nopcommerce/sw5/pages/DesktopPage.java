package com.nopcommerce.sw5.pages;

import com.nopcommerce.sw5.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//img[@alt='Picture for category Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(name = "products-orderby")
    WebElement sortByFilter;

    @CacheLookup
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add to cart'])[1]")
    WebElement addToCartButton;



    public void clickOnSortByNameZToA() {
        Reporter.log("Click on Sort By Name Z to A");
        selectByVisibleTextFromDropDown(sortByFilter, "Name: Z to A");
        //CustomListeners.test.log(Status.PASS, "Click on Sort By Name Z to A");

    }

    public void clickOnSortByNameAToZ() {
        Reporter.log("Click on Sort By Name A to Z");
        selectByVisibleTextFromDropDown(sortByFilter, "Name: A to Z");
       // CustomListeners.test.log(Status.PASS, "Click on Sort By Name A to Z");

    }

    public void clickOnAddToCartButton() {
        Reporter.log("Click on Add To Cart Button");
        clickOnElement(addToCartButton);
        //CustomListeners.test.log(Status.PASS, "Click on Add To Cart Button");

    }

    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() {

        Reporter.log("Verify Product in Alphabetical Order");

        List<WebElement> elementList = findElementsFromWebPage(By.xpath("//h2[@class='product-title']"));
        System.out.println("Total elements are : " + elementList.size());
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : elementList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList, Collections.reverseOrder());
        System.out.println(originalProductNameList);

        List<WebElement> afterSortingElementList = findElementsFromWebPage(By.xpath("//h2[@class='product-title']"));
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product1 : afterSortingElementList) {
            afterSortingProductName.add(product1.getText());
        }
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList, afterSortingProductName, "Products are not sorted in descending order");
       // CustomListeners.test.log(Status.PASS, "Verify Product in Alphabetical Order");

    }
}
