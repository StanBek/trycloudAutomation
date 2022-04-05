package com.trycloud.step_defs;

import com.trycloud.pages.FilePage_Ramia;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import javax.swing.text.html.HTML;
import java.awt.*;

public class UploadFile_StepDefinition extends FilePage_Ramia {
    String path="C:\\Users\\ENG ABDO\\Desktop\\HTML Class";
    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
    addBtn.click();
        BrowserUtils.waitFor(2);
    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option () throws InterruptedException {
        uploadFile.sendKeys(path) ;


    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

    }
}
