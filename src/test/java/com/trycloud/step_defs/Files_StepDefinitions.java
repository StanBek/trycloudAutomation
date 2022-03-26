package com.trycloud.step_defs;

import com.sun.source.tree.AssertTree;
import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Files_StepDefinitions extends FilesPage {
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
    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        filesPage.commentsButton.click();
        expectedText = "jack";
        filesPage.commentsBox.sendKeys(expectedText + Keys.ENTER);


        // filesPage.commentsBox.sendKeys(expectedText);

    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
       // filesPage.submitButton.click();
    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        // Assert.assertTrue(messageText.isDisplayed());

        /*System.out.println(messageText.getText());
        String actualText = filesPage.messageText.getText();
        Assert.assertEquals(expectedText, actualText);

         */
        Driver.getDriver().findElement(By.xpath("//div[contains(text(),'"+expectedText+"')]")).isDisplayed();
        System.out.println("Driver.getDriver().findElement(By.xpath(\"//div[contains(text(),'  \"+ expectedText +\" ')]\")).getText() = "
                + Driver.getDriver().findElement(By.xpath("//div[contains(text(),'  " + expectedText + " ')]")).getText());

    }

}
