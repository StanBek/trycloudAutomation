package com.trycloud.step_defs;

import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_Dilia extends LoginPage {

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        dashboard.click();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        contacts.click();
    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {

    }


}
