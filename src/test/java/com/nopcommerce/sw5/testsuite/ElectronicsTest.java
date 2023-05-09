package com.nopcommerce.sw5.testsuite;

import com.nopcommerce.sw5.pages.*;
import com.nopcommerce.sw5.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {

    BuildYourOwnComputer buildYourOwnComputer;
    CellPhonePage cellPhonePage;
    CheckOutPage checkOutPage;
    ComputerPage computerPage;
    DesktopPage desktopPage;
    ElectronicsPage electronicsPage;
    HomePage homePage;
    LoginPage loginPage;
    NokiaLumia1020Page nokiaLumia1020Page;
    RegisterPage registerPage;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        buildYourOwnComputer = new BuildYourOwnComputer();
        cellPhonePage = new CellPhonePage();
        checkOutPage = new CheckOutPage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        electronicsPage = new ElectronicsPage();
        homePage = new HomePage();
        loginPage = new LoginPage();
        nokiaLumia1020Page = new NokiaLumia1020Page();
        registerPage = new RegisterPage();
        shoppingCartPage = new ShoppingCartPage();


    }


    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        //1.1 Mouse Hover on “Electronics” Tab
        electronicsPage.hoverOnElectronics();
        //1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.hoverOnCellPhoneAndClick();
        //1.3 Verify the text “Cell phones”
        String actualText = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(actualText, "Cell phones", "Text not Displayed");
    }


    @Test(groups = {"sanity", "regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        electronicsPage.hoverOnElectronics();
        //2.2 Mouse Hover on “Cell phones” and click
        electronicsPage.hoverOnCellPhoneAndClick();
        //2.3 Verify the text “Cell phones”
        String actualText = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(actualText, "Cell phones", "Text not Displayed");
        //2.4 Click on List View Tab
       // cellPhonePage.clickOnListViewTab();
        //2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(1000);
        cellPhonePage.clickOnNokiaLumia1020();
        //2.6 Verify the text “Nokia Lumia 1020”
        String actualNokiaLumiaText = nokiaLumia1020Page.getNokiaLumiaText();
        Assert.assertEquals(actualNokiaLumiaText, "Nokia Lumia 1020", "Text not Displayed");
        //2.7 Verify the price “$349.00”
        String actualNokiaPriceText = nokiaLumia1020Page.getNokiaPriceText();
        Assert.assertEquals(actualNokiaPriceText, "$349.00", "Text not Displayed");
        //2.8 Change quantity to 2
        nokiaLumia1020Page.changeQuantity();
        //2.9 Click on “ADD TO CART” tab
        nokiaLumia1020Page.clickOnAddToCartButton();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar  After that close the bar clicking on the cross button.
        String actualTextShoppingCart = nokiaLumia1020Page.getTextFromProductAddedToCart();
        Assert.assertEquals(actualTextShoppingCart, "The product has been added to your shopping cart", "Text not Displayed");
        nokiaLumia1020Page.closeTheBarByClickingOnTheCrossButton();
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020Page.mouseHoverOnShoppingCart();
        nokiaLumia1020Page.clickOnShoppingCart();
        //2.12 Verify the message "Shopping cart"
        String actualShoppingCartMessage = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(actualShoppingCartMessage, "Shopping cart", "error");
        Thread.sleep(2000);
        //2.13 Verify the quantity is 2
        String actualQuantity = shoppingCartPage.getVerifyQuantity();
        Assert.assertEquals(actualQuantity, "(2)", "Error");
        //2.14 Verify the Total $698.00
        String actualTotal = shoppingCartPage.getVerifyTotal();
        Assert.assertEquals(actualTotal, "$698.00", "Error");

    }


}
