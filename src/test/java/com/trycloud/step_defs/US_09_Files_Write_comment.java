package com.trycloud.step_defs;
import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_09_Files_Write_comment extends FilesPage {
    String expectedText;
    FilesPage filesPage = new FilesPage();

    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user insert {string} and {string}")
    public void user_insert_and(String username, String password) {
        login(username, password);
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        filesPage.files.click();
    }

    @When("user click action-icon from any file on the page And user choose the {string} option")
    public void user_click_action_icon_from_any_file_on_the_page_and_user_choose_the_option(String string) {
        filesPage.action_icon.click();
        filesPage.detailsButton.click();
        BrowserUtils.sleep(1);
    }

    @When("user write a {string} comment inside the input box")
    public void user_write_a_comment_inside_the_input_box(String message) {
        filesPage.commentsButton.click();
        filesPage.commentsBox.sendKeys(message);
        BrowserUtils.sleep(1);

    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        filesPage.submitButton.click();
        BrowserUtils.sleep(1);
    }

    @Then("Verify the {string} comment is displayed in the comment section")
    public void verify_the_comment_is_displayed_in_the_comment_section(String message) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[.='"+message+"']"));
        BrowserUtils.highlight(element);
        Assert.assertTrue(element.isDisplayed());

    }

}
