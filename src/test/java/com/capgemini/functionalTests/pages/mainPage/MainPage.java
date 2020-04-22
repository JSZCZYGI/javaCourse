package com.capgemini.functionalTests.pages.mainPage;

import com.capgemini.functionalTests.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.capgemini.driver.DriverFactory.getDriver;
import static com.capgemini.functionalTests.pages.mainPage.StartupPopup.getStartupPopUp;

public class MainPage extends BasePage {
    private static final String URL = "https://www.automationintesting.online/#/";
    public StartupPopup startupPopUp = getStartupPopUp();

    //region Page WebElements
    @FindBy(xpath = "//div[@class='col-sm-10']/h2")
    public WebElement header2;

    @FindBy(xpath = "//button[@id='submitContact']")
    public WebElement submitButton;
    //endregion

    //region Page creation
    private MainPage() {
        super();
    }

    public static MainPage getMainPage() {
        return new MainPage();
    }
    //endregion

    public MainPage open() {
        driver.get(URL);
        return this;
    }


}
