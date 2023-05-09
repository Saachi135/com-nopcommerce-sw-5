package com.nopcommerce.sw5.testsuite;

import com.nopcommerce.sw5.pages.*;
import com.nopcommerce.sw5.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

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

    @Test(groups = {"sanity","regression"})
    public void verifyTextOfComputerTopMenuTabSuccessfully() {

        homePage.selectAllTopMenuTabs("Computers");
        Assert.assertEquals(homePage.verifyPaveNavigationOfComputerTopMenuTab(), "Computers");
    }

    @Test(groups = {"smoke","regression"})
    public void verifyPageNavigationOfElectronicsTopMenuTabSuccessfully() {

        homePage.selectAllTopMenuTabs("Electronics");
        Assert.assertEquals(homePage.verifyPaveNavigationOfElectronicsTopMenuTab(), "Electronics");
    }
    @Test(groups = {"regression"})
    public void verifyPageNavigationOfApparelTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Apparel");
        Assert.assertEquals( homePage.verifyPaveNavigationOfApparelTopMenuTab(),"Apparel");
    }

    @Test(groups = {"regression"})
    public void verifyPageNavigationOfDigitalDownloadsTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Digital downloads");
        Assert.assertEquals(homePage.verifyPaveNavigationOfDigitalDownloadsTopMenuTab(), "Digital downloads");
    }

    @Test(groups = {"regression"})
    public void verifyPageNavigationOfBooksTopMenuTabSuccessfully() throws InterruptedException {
        homePage.selectAllTopMenuTabs("Books");
        Thread.sleep(5000);
        Assert.assertEquals(homePage.verifyPaveNavigationOfBooksTopMenuTab(), "Books");
    }

    @Test(groups = {"regression"})
    public void verifyPageNavigationOfJewelryTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Jewelry");
        Assert.assertEquals(homePage.verifyPaveNavigationOfJewelryTopMenuTab(), "Jewelry");
    }

    @Test(groups = {"regression"})
    public void verifyPageNavigationOfGiftCardsTopMenuTabSuccessfully() {
        homePage.selectAllTopMenuTabs("Gift cards");
        Assert.assertEquals(homePage.verifyPaveNavigationOfGiftCardsTopMenuTab(), "Gift Cards");
    }



}
