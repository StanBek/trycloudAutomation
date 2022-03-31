package com.trycloud.step_defs;
import com.trycloud.pages.US05Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05StepDef extends US05Page {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        inputUsername.sendKeys("User23");
        inputPassword.sendKeys("Userpass123");
        loginBtn.click();
    }

    @When("user on the dashboard page")
    public void userOnTheDashboardPage() {
        dashboard.click();
        BrowserUtils.sleep(2);
    }

    @And("the user clicks the {string} module")
    public void theUserClicksTheModule(String arg0) {
        files.click();
        BrowserUtils.sleep(2);
    }

    @And("the user clicks action-icon from any file on the page And user choose the {string} option")
    public void theUserClicksActionIconFromAnyFileOnThePageAndUserChooseTheOption(String arg0) {
        clicksActionIconFromAnyFileOnThePageAndUserChooseTheOption.click();
        BrowserUtils.sleep(2);
    }

    @Then("user click the {string} sub-module on the left side Then Verify the chosen file is listed on the table")
    public void userClickTheSubModuleOnTheLeftSideThenVerifyTheChosenFileIsListedOnTheTable(String arg0) {
        clickTheSubModuleOnTheLeftSide.click();
        Assert.assertTrue(Talk.isDisplayed());





    }
}
