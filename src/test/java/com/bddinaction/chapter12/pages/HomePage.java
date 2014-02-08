package com.bddinaction.chapter12.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://")
public class HomePage extends PageObject {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void selectMenuOptions(String... menuOptions) {
        for(String menuChoice : menuOptions) {
            $(".mainMenu").findBy(By.linkText(menuChoice)).click();
        }
    }

    public void enterFirstName(String firstName) {
    }

    public void enterLastName(String lastName) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public void enterAddress(String address) {
        //To change body of created methods use File | Settings | File Templates.
    }
}

