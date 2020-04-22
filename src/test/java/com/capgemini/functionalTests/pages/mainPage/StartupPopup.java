package com.capgemini.functionalTests.pages.mainPage;

import com.capgemini.functionalTests.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.capgemini.driver.DriverFactory.getDriver;

public class StartupPopup extends BasePage {

    //region Page WebElements
    @FindBy(xpath = "//div[@class='modal-body welcome']")
    public List<WebElement> popupWindow;

    @FindBy(xpath = "//button[@id='next']")
    public WebElement nextButton;

    @FindBy(xpath = "//button[@id='closeModal']")
    public WebElement closeButton;
    //endregion

    //region Page creation
    private StartupPopup() {
        super();
    }

    public static StartupPopup getStartupPopUp() {
        return new StartupPopup();
    }
    //endregion

    public StartupPopup clickButtonNext() {
        nextButton.click();
        return this;
    }

    public StartupPopup clickButtonClose() {
        closeButton.click();
        return this;
    }

    public boolean isPopupClosed(){
        return popupWindow.isEmpty();
    }

}
