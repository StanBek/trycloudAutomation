package com.trycloud.step_defs;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.SearchPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Map;

public class Search_step_defs extends SearchPage {

    String expectedResult;

    @When("enter credentials username {string} and passcode {string}, user on the dashboard page")
    public void enterCredentialsUsernameAndPasscodeUserOnTheDashboardPage(String username, String password) {
       login(username,password);
    }

    @Given("user  clicks the magnifier icon on the right top")
    public void user_clicks_the_magnifier_icon_on_the_right_top() {
        searchIcon.click();

    }

    @And("Search any existing file or folder or user name and verify the app displays the expected result option")
    public void searchAnyExistingFileOrFolderOrUserNameAndVerifyTheAppDisplaysTheExpectedResultOption(Map<String,String> nameOfValue) {
            searchInputBox.sendKeys(nameOfValue.get("nameOfValue"));
            expectedResult = nameOfValue.get("nameOfValue");
            String actualResult = searchResult.getText();
            System.out.println("actualResult = " + actualResult);
            Assert.assertTrue(expectedResult.equals(actualResult));

    }

}
