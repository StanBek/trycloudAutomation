package com.trycloud.step_defs;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TryCloudUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class US10 extends LoginPage {

    FilesPage filesPage = new FilesPage();

    @Given("user enter the username and password")
    public void userEnterTheUsernameAndPassword() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("username1"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginBtn.click();
    }


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        dashboard.click();

    }


    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String arg0) {
        files.click();
    }

    @And("user clicks Settings on the left bottom corner")
    public void userClicksSettingsOnTheLeftBottomCorner() {
        filesPage.settingBtn.click();

    }

    @Then("the user should be able to click any buttons")
    public void theUserShouldBeAbleToClickAnyButtons() {
        filesPage.settingOptions.click();

        BrowserUtils.sleep(4);

        Assert.assertTrue(filesPage.settingOptions.isSelected());

    }

    @And("user checks the current storage usage")
    public void userChecksTheCurrentStorageUsage() {

        BrowserUtils.sleep(4);
        Assert.assertTrue(filesPage.usedStorageParagraph.isDisplayed());
    }

    @And("user uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() {


        filesPage.uploadBtn.click();
        String uploadFile = "istockphoto-862739386-1024x1024.jpeg";


        TryCloudUtility.waitForPageToLoad(30);
        filesPage.uploadFile.sendKeys(uploadFile);


        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

            wait.until(ExpectedConditions.invisibilityOf(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'"+uploadFile+"')]"))));
        } catch(Exception e){
            e.printStackTrace();
        }
    }





    @And("user refresh the page")
    public void userRefreshThePage() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.sleep(3);

    }

    @Then("the user should be able to see storage usage is increased")
    public void theUserShouldBeAbleToSeeStorageUsageIsIncreased(){

    }


}


