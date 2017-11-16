package com.stv.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tatiana_Sauchanka on 10/11/2017.
 */
public abstract class IsuFactoryPage {
    protected WebDriver driver;

    protected IsuFactoryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public String assertCurrentURL(){
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }
}
