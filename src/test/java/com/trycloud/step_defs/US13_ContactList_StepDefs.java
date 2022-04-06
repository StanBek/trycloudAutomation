package com.trycloud.step_defs;

import com.trycloud.pages.ContactsPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US13_ContactList_StepDefs {

    ContactsPage contactsPage = new ContactsPage();

    @Given("user on the Dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
        new LoginPage().login(ConfigurationReader.getProperty("username1"),ConfigurationReader.getProperty("password"));

    }

    @When("the user clicks the Contacts module")
    public void the_user_clicks_the_contacts_module() {

        BrowserUtils.waitForVisibility(contactsPage.contacts, 1);
        contactsPage.contacts.click();

    }

    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {

        for (WebElement element : contactsPage.contactsList) {
            BrowserUtils.highlight(element);
            Assert.assertTrue(element.isDisplayed());
        }
    }
}
