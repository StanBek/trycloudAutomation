package com.trycloud.step_defs;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TalkPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_talk_module_step_defs extends TalkPage {

    String expectedTitle;
    TalkPage talkPage = new TalkPage();

    @Given("user is on the Dashboard page")
    public void user_is_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
        new LoginPage().login(ConfigurationReader.getProperty("username2"),ConfigurationReader.getProperty("password"));

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_talk_module(String string) {
        BrowserUtils.sleep(3);
        talkPage.talk.click();

    }

    @Then("verify the title is {string}")
    public void verify_the_title_is(String titleName) {
        String expectedTitle = titleName;
        String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedTitle, actualTitle);

    }

}
