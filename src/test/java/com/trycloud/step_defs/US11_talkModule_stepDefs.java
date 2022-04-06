package com.trycloud.step_defs;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_talkModule_stepDefs extends LoginPage {

    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        dashboard.isDisplayed();
        BrowserUtils.sleep(2);
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String arg) {
        talk.click();
        BrowserUtils.sleep(2);
    }

    @Then("the user sees the page title {string}")
    public void the_user_sees_the_page_title(String title) {
        BrowserUtils.sleep(2);
        String expectedTitle = title;
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
/*
    @When("the user searches through the search box")
    public void the_user_searches_through_the_search_box() {
    }

    @When("the user writes the message")
    public void the_user_writes_the_message() {
    }

    @When("the user clicks a submit button")
    public void the_user_clicks_a_submit_button() {
    }

    @Then("the user should be able to see the message displayed in the conversation log")
    public void the_user_should_be_able_to_see_the_message_displayed_in_the_conversation_log() {
    }
*/
}
