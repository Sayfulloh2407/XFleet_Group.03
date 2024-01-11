package com.XFleet.step_definitions;

import com.XFleet.pages.BasePage;
import com.XFleet.pages.CheckBoxPage;
import com.XFleet.pages.LoginPage;
import com.XFleet.utilities.BrowserUtils;
import com.XFleet.utilities.ConfigurationReader;
import com.XFleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Random;

public class CheckBoxStepDef extends BasePage{
    CheckBoxPage checkBoxPage = new CheckBoxPage();
    @When("The user logins on the login page as {string}")
    public void the_user_logins_on_the_login_page_as(String string) {
        BrowserUtils.waitFor(2);
        checkBoxPage.login(string);
    }
    @When("The user hovers over fleet button on the top menu of the Dashboard page.")
    public void the_user_hovers_over_fleet_button_on_the_top_menu_of_the_dashboard_page() {

        BrowserUtils.waitFor(4);
        action.moveToElement(checkBoxPage.fleetButton).perform();
        BrowserUtils.waitFor(3);
    }
    @When("The user clicks Vehicles button on the dropdown.")
    public void the_user_clicks_vehicles_button_on_the_dropdown() {
        checkBoxPage.vehicleButton.click();
        BrowserUtils.waitFor(4);
    }
    @Then("The user see all the checkboxes as unchecked.")
    public void the_user_see_all_the_checkboxes_as_unchecked() {
        BrowserUtils.waitFor(1);
        for (WebElement checkBox : checkBoxPage.checkBoxes) {
            Assert.assertFalse(checkBox.isSelected());
        }
    }

    @And("The user checks the first checkbox on the title line")
    public void theUserChecksTheFirstCheckboxOnTheTitleLine() {
        BrowserUtils.waitFor(4);
        checkBoxPage.firstCheckBox.click();
        BrowserUtils.waitFor(2);
    }

    @Then("The user see all the checkboxes as checked.")
    public void theUserSeeAllTheCheckboxesAsChecked() {
        for (WebElement checkBox : checkBoxPage.checkBoxes) {
            Assert.assertTrue(checkBox.isSelected());
        }
    }

    @And("The user checks the checkboxes rundem.")
    public void theUserChecksTheCheckboxesRundem() {
        for (WebElement clickBox : checkBoxPage.clickBoxes) {
            clickBox.click();
        }
    BrowserUtils.waitFor(1);
    }

    @Then("The user see all the checkboxes, which user checked has, as checked.")
    public void theUserSeeAllTheCheckboxesWhichUserCheckedHasAsChecked() {
        for (WebElement checkBox : checkBoxPage.checkBoxes) {
            Assert.assertTrue(checkBox.isSelected());
        }
    }
}
