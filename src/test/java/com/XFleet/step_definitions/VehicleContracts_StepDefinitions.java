package com.XFleet.step_definitions;

import com.XFleet.pages.BasePage;
import com.XFleet.pages.LoginPage;
import com.XFleet.pages.VehicleContractsPage;
import com.XFleet.utilities.BrowserUtils;
import com.XFleet.utilities.ConfigurationReader;
import com.XFleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class VehicleContracts_StepDefinitions extends BasePage {

    LoginPage login = new LoginPage();
    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();
    @Given("The user is on log in page")
    public void the_user_is_on_log_in_page() {

    }
    @When("user logs in as store manager")
    public void user_logs_in_as_store_manager() {
        login.login(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));

        waitUntilLoaderScreenDisappear();

    }

    @And("user clicks on Fleet module")
    public void userClicksOnFleetModule() {


        vehicleContractsPage.fleet.click();

    }

    @Then("user clicks on Vehicle Contracts option")
    public void userClicksOnVehicleContractsOption() {

        vehicleContractsPage.vehicCont.click();
        waitUntilLoaderScreenDisappear();


    }

    @Then("user sees All - Vehicle Contract - Entities - System - Car - Entities - System in title")
    public void userSeesAllVehicleContractEntitiesSystemCarEntitiesSystemInTitle() {
        waitUntilLoaderScreenDisappear();
        String expectedTitle= "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }


    @When("user logs in as sales manager")
    public void user_logs_in_as_sales_manager() {
        login.login(ConfigurationReader.getProperty("sales_manager_username"),ConfigurationReader.getProperty("store_manager_password"));
    }


    @When("user logs in as driver")
    public void user_logs_in_as_driver() {
        login.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("store_manager_password"));
    }


    @Then("user sees You do not have permission to perform this action. message displayed")
    public void userSeesYouDoNotHavePermissionToPerformThisActionMessageDisplayed() {


        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = vehicleContractsPage.warningMessage.getText();

        Assert.assertEquals(actualMessage,expectedMessage);
    }








}
