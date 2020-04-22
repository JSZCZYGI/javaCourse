package com.capgemini.functionalTests.pages;

import com.capgemini.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.capgemini.driver.DriverFactory.getDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

}
