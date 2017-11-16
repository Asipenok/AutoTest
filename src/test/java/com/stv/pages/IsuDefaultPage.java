package com.stv.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IsuDefaultPage extends IsuFactoryPage {

    @FindBy(css = "a[href='/']")
    private WebElement otherCountryItem;

    public IsuDefaultPage(WebDriver driver){
        super(driver);
    }

    public IsuHomePage clickOnHomePageItemLink() {
        System.out.println("Navigate to main page");
        otherCountryItem.click();
        return new IsuHomePage(driver);
    }

    public boolean isHomePageItemDisplayed(){
        return otherCountryItem.isDisplayed();
    }



}
