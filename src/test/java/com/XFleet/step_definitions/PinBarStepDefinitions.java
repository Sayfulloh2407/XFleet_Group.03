package com.XFleet.step_definitions;

import com.XFleet.pages.BasePage;
import com.XFleet.pages.LoginPage;
import com.XFleet.pages.PinbarPage;
import com.XFleet.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class PinBarStepDefinitions extends BasePage {

    LoginPage login = new LoginPage();
    PinbarPage pinbarPage = new PinbarPage();

    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @Then("user clicks on {string} bar")
    public void userClicksOnBar(String arg0) {


        pinBar.click();
        waitUntilLoaderScreenDisappear();
    }

    @Then("user sees {string}")
    public void userSees(String arg0) {
        waitUntilLoaderScreenDisappear();

        Assert.assertTrue(pinBarImage.isDisplayed());

    }

    @And("user clicks pin icon on the top right corner")
    public void userClicksPinIconOnTheTopRightCorner() {
        waitUntilLoaderScreenDisappear();
        pinIcon.click();
    }


    @Then("user sees an expected image")
    public void user_sees_an_expected_image() {
        waitUntilLoaderScreenDisappear();

       Assert.assertTrue(pinBarImage.isDisplayed());
    }

}