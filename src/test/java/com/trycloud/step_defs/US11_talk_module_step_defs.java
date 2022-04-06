package com.trycloud.step_defs;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US11_talk_module_step_defs {

    @Given("user is on the Dashboard page")
    public void user_is_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
        new LoginPage().login(ConfigurationReader.getProperty("username1"),ConfigurationReader.getProperty("password"));

    }
    @When("the user clicks the Talk module")
    public void the_user_clicks_the_talk_module() {

    }
    @Then("verify the title is {string}")
    public void verify_the_title_is(String string) {

    }

}
