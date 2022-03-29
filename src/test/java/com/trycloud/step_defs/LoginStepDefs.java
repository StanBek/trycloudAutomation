package com.trycloud.step_defs;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.bouncycastle.cms.RecipientId.password;

public class LoginStepDefs extends LoginPage {

    @Given("user on the login page")
    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String username, String password) {
        inputUsername.sendKeys("User7");
        inputPassword.sendKeys("Userpass123");
    }


    @When("user click the login button")
    public void user_click_the_login_button() {
        loginBtn.click();
    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        BrowserUtils.verifyURLContains("dashboard");
    }


    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {

    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String arg0) {
    }

    @And("user clicks Settings on the left bottom corner")
    public void userClicksSettingsOnTheLeftBottomCorner() {
    }

    @Then("the user should be able to click any buttons")
    public void theUserShouldBeAbleToClickAnyButtons() {
    }

    @And("user checks the current storage usage")
    public void userChecksTheCurrentStorageUsage() {
    }

    @And("user uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() {
    }

    @And("user refresh the page")
    public void userRefreshThePage() {
    }

    @Then("the user should be able to see storage usage is increased")
    public void theUserShouldBeAbleToSeeStorageUsageIsIncreased() {
    }
}