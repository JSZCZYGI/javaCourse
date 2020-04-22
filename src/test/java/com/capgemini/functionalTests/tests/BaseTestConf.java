package com.capgemini.functionalTests.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static com.capgemini.driver.DriverFactory.getDriver;
import static com.capgemini.driver.DriverFactory.getWebDriverWait;

public class BaseTestConf {
    protected WebDriver driver;
    protected WebDriverWait wait;


    @BeforeSuite
    public void setUp() {
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        wait = getWebDriverWait();
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
