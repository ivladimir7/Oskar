package com.telran.oskarLastVersion.tests.product;

import com.telran.data.UserData;
import com.telran.oskarLastVersion.tests.TestBase1;
import com.telran.pages.product.AllProductPage;
import com.telran.pages.product.HomePage;
import com.telran.pages.user.LoginAndRegistrationPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SidePanelTest extends TestBase1 {

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).clickOnLoginButton();
        new LoginAndRegistrationPage(driver).login(UserData.EMAIL, UserData.PASSWORDNewACC);
    }

    @Test
    public void isLinkRedirectsToClothingPage() {
        new AllProductPage(driver).clickOnClothingLink();
        Assert.assertTrue(new AllProductPage(driver).getPageTitleText().contains("Clothing"));
    }
    @Test
    public void isLinkRedirectToBooksPage() {
        new AllProductPage(driver).clickOnBooksLink();
        Assert.assertTrue(new AllProductPage(driver).getPageTitleText().contains("Books"));
    }

    @Test
    public void isLinkRedirectsToFictionPage() {
        new AllProductPage(driver).clickOnFictionLink();
        Assert.assertTrue(new AllProductPage(driver).getPageTitleText().contains("Fiction"));
    }

    @Test
    public void isLitLinkRedirectsToCompInLitPage() {
        new AllProductPage(driver).clickOnComputersInLiteratureLink();
        Assert.assertTrue(new AllProductPage(driver).getPageTitleText().contains("Computers"));
    }

    @Test
    public void isLinkRedirectsToNonFictionPage() {
        new AllProductPage(driver).clickOnNonFictionLink();
        Assert.assertTrue(new AllProductPage(driver).getPageTitleText().contains("Non-Fiction"));
    }

    @Test
    public void isLinkRedirectsToEssentialProgrammingPage() {
        new AllProductPage(driver).clickOnEssentialProgrammingLink();
        Assert.assertTrue(new AllProductPage(driver).getPageTitleText().contains("Essential"));
    }

    @Test
    public void isLinkRedirectsToHackingPage() {
        new AllProductPage(driver).clickOnHackingLink();
        Assert.assertTrue(new AllProductPage(driver).getPageTitleText().contains("Hacking"));
    }
}
