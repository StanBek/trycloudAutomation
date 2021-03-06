package com.trycloud.step_defs;

import com.trycloud.pages.FilePage_Ramia;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.lang.module.Configuration;
import java.util.List;

public class RemoveFromFavorite_stepDefinition extends LoginPage {
    FilePage_Ramia file=new FilePage_Ramia();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login("User99","Userpass123");
        dashboard.isDisplayed();

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        files.click();

    }
    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
      file.firstActionButton.click();
      BrowserUtils.waitFor(5);


    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String expected) {

            String actual=file.removeFromFavorite.getText();
            Assert.assertEquals(actual,expected);
            file.removeFromFavorite.click();




    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        file.favoriteSubModule.click();
        BrowserUtils.waitFor(3);




    }
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
    Assert.assertFalse(file.folderName.isDisplayed());


    }

}
