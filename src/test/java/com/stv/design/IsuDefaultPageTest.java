package com.stv.design;

import com.stv.pages.IsuDefaultPage;
import com.stv.pages.IsuHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Tatiana_Sauchanka on 10/11/2017.
 */
import static com.stv.locators.IsuProjectLocators.HOME_PAGE_URL;

public class IsuDefaultPageTest extends BasicTest {

    @Test
    public void assertHomePageItemIsDisplayed() {
        boolean b = new IsuDefaultPage(driver).isHomePageItemDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test (dependsOnMethods = {"assertHomePageItemIsDisplayed"})
    public void clickOnHomePageItemLink(){
        new IsuDefaultPage(driver).clickOnHomePageItemLink();
    }

    @Test (dependsOnMethods = {"clickOnHomePageItemLink"})
    public void inspectIsuHomePageOpened(){
        String registerURL = new IsuHomePage(driver).assertCurrentURL();
        Assert.assertEquals(registerURL,HOME_PAGE_URL);
    }


}

