package com.trycloud.step_defs;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_Dilia extends LoginPage {


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        talk.click();
    }
    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String name) {
        String expectedResult = name;
        System.out.println("expectedResult = " + expectedResult);
        String actualResult = Driver.getDriver().getTitle();
        System.out.println("actualResult = " + actualResult);
        Assert.assertTrue(expectedResult.contains(actualResult));
    }
}