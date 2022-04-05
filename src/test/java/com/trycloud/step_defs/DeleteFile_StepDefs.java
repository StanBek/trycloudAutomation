package com.trycloud.step_defs;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.FilePage_Kaloyan;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteFile_StepDefs extends BasePage {

    FilePage_Kaloyan filePage_kaloyan = new FilePage_Kaloyan();
    String deletedItemText;

    @Given("user on the dashboard page {string} {string}")
    public void user_on_the_dashboard_page(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        new LoginPage().login(username, password);

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String moduleName) {
        clickModule(moduleName);
    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        BrowserUtils.sleep(10);
            filePage_kaloyan.actionBtn.click();
            deletedItemText = filePage_kaloyan.deletedItem.getText();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String actionName) {

            filePage_kaloyan.clickAction(actionName);
    }

    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String moduleName) {
        for (WebElement each : filePage_kaloyan.leftSideModules) {
            if (each.getText().equalsIgnoreCase(moduleName)){
                each.click();
                break;
            }
        }


    }
    @Then("Verify the deleted file is displayed on the page")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

    }

}
