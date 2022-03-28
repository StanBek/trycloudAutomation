package com.trycloud.step_defs;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.SettingPage_JackPractice;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SettingPage_JackPractice_StepDef extends FilesPage {
    FilesPage filesPage = new FilesPage();
    SettingPage_JackPractice settingPage_jackPractice = new SettingPage_JackPractice();

    public void user_insert_and(String username, String password) {
        login(username, password);
    }

    public void the_user_clicks_the_module(String string) {
        filesPage.files.click();
    }

    @When("user clicks {string} on the left bottom corner")
    public void user_clicks_on_the_left_bottom_corner(String string) {
        filesPage.settingsButton.click();
    }

    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {

        settingPage_jackPractice.recommendationsEnabledToggle.click();
        settingPage_jackPractice.showHiddenGilesToggle.click();
        settingPage_jackPractice.showRichWorkspaces.click();
    }

    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        String beforeUploadStorageCapacity = filesPage.storageUsage.getText();
        System.out.println("beforeUploadStorageCapacity = " + beforeUploadStorageCapacity);
    }

    @When("user uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() throws InterruptedException {
        filesPage.buttonNew.click();
        uploadFileButton.click();
        uploadFileButton.sendKeys("/Users/maglovanyi/Desktop/School/SoftSkills/TryCloud/tryCloud.png");

        Thread.sleep(1000);
    }

    @When("user refresh the page")
    public void user_refresh_the_page() throws InterruptedException {
        Driver.getDriver().navigate().refresh();
        Thread.sleep(1000);
    }

    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {
        String afterUploadStorageCapacity = filesPage.storageUsage.getText();
        System.out.println("afterUploadStorageCapacity = " + afterUploadStorageCapacity);

    }

}
