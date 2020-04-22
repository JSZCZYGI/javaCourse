package com.capgemini.otherTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumTest {
    WebDriver driver;



    //region old
    @Test
    public void openingPage() {
        driver.get("https://google.com");
    }

    @Test
    public void assertingTitle() {
        driver.get("https://the-internet.herokuapp.com/");
        String expected = "The Internet";
        String actual = driver.getTitle();
        assertThat(actual)
                .isEqualTo(expected);
    }

    @Test
    public void controllingBrowser() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void interactionWithWebElement() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
        String expected = "12345";

        inputField.sendKeys(expected);
        String actual = inputField.getAttribute("value");

        assertThat(actual).
                isEqualTo(expected);
    }

    @Test
    public void jsExecutor() {
        driver.get("https://the-internet.herokuapp.com/inputs");

        JavascriptExecutor jsExecutor = ((JavascriptExecutor)driver);
        jsExecutor.executeScript("console.log('heloł')");
    }
    //endregion


}
