package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage extends LoginPage {

    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement action_icon;

    @FindBy(xpath = "(//span[.='Details'])")
    public WebElement detailsButton;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentsButton;

    @FindBy(xpath = "//div[@contenteditable='true']")
    public WebElement commentsBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitButton;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement messageText;


}
