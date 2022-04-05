package com.trycloud.step_defs;

import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.trycloud.pages.FilePage_Ramia;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import javax.swing.text.html.HTML;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFile_StepDefinition extends FilePage_Ramia {



    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
    addBtn.click();
        BrowserUtils.waitFor(2);
    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option () throws InterruptedException {
        String path="C:\\Users\\ENG ABDO\\Desktop\\HTML Class\\butterfly.jpeg";
        StringSelection filePath=new StringSelection(path);
        Robot robot=null;
        uploadFile.click();
        BrowserUtils.waitForPageToLoad(5);

       try {
           robot=new Robot();
           Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);
           robot.keyPress(KeyEvent.VK_CONTROL);
           robot.keyPress(KeyEvent.VK_V);
           robot.keyRelease(KeyEvent.VK_V);
           robot.keyRelease(KeyEvent.VK_CONTROL);
           robot.keyPress(KeyEvent.VK_ENTER);
           robot.keyRelease(KeyEvent.VK_ENTER);
           BrowserUtils.waitFor(3);
       }catch (AWTException e) {
           e.printStackTrace();
       }




    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(uploadedFolderName.isDisplayed());
    }
}
