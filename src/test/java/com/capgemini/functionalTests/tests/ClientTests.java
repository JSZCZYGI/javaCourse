package com.capgemini.functionalTests.tests;

import com.capgemini.functionalTests.pages.mainPage.MainPage;
import org.testng.annotations.Test;

import static com.capgemini.functionalTests.pages.mainPage.MainPage.getMainPage;
import static org.assertj.core.api.Assertions.assertThat;

public class ClientTests extends BaseTestConf {
    MainPage mainPage = getMainPage();

    @Test
    public void closePopup() {
        mainPage.open()
                .startupPopUp.clickButtonNext()
                .clickButtonNext()
                .clickButtonNext()
                .clickButtonNext()
                .clickButtonClose();

        assertThat(mainPage.startupPopUp.isPopupClosed())
                .isTrue();
        assertThat(mainPage.submitButton.isDisplayed())
                .isTrue();
    }

    @Test
    public void goToUrl() {
        mainPage.open();
        assertThat(driver.getTitle())
                .isEqualTo("Restful-booker-platform demo");
    }

    @Test
    public void checkGH2OfThePage() {
        mainPage.open();
        assertThat(mainPage.header2.getText())
                .isEqualTo("Rooms");
    }


}
