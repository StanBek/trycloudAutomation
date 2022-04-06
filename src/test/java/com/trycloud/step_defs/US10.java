package com.trycloud.step_defs;


import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US10 extends LoginPage {

    FilesPage filesPage = new FilesPage();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("username1"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginBtn.click();
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String page) {
        files.click();
    }

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        filesPage.settingBtn.click();
    }

    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
        int i = 0;
        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        for (WebElement each : filesPage.settinChekBoxBtn) {
            BrowserUtils.waitForClickablility(each, 20);
            each.click();
            if (!filesPage.settingCheckBoxes.get(i).isSelected()) {
                actions.moveToElement(each).click().perform();
                Assert.assertTrue(filesPage.settingCheckBoxes.get(i).isSelected());
                i++;
            }
        }
    }

    String beforeLoad, afterLoad;

    @And("user checks the current storage usage")
    public void userChecksTheCurrentStorageUsage() {
        beforeLoad = filesPage.beforeStorageBtn.getText();
    }

    @And("user uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() {
        String filePath = "/Users/arstanbektemirov/Desktop/AWS Acc.docx";
        BrowserUtils.waitFor(2);
        filesPage.uploadFileBtn.click();
        BrowserUtils.waitForPageToLoad(10);
        filesPage.getUploadFileBtn.sendKeys(filePath);
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
            wait.until(ExpectedConditions.invisibilityOf(filesPage.uploadBar));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("user refresh the page")
    public void userRefreshThePage() {
        Driver.getDriver().navigate().refresh();
    }

    @Then("the user should be able to see storage usage is increased")
    public void theUserShouldBeAbleToSeeStorageUsageIsIncreased() {
        afterLoad = filesPage.afterStorage.getText();
        Assert.assertNotEquals(beforeLoad, afterLoad);
    }
}


