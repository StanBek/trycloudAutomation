package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='dashboard']")
    public WebElement dashboard;


    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='files']")
    public WebElement files;


    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='photos']")
    public WebElement photos;


    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='activity']")
    public WebElement activity;


    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='spreed']")
    public WebElement talk;


    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='mail']")
    public WebElement mail;


    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='contacts']")
    public WebElement contacts;


    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='circles']")
    public WebElement circles;


    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='calendar']")
    public WebElement calendar;


    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='deck']")
    public WebElement deck;


    @FindBy(xpath = "//div[@class='header-menu unified-search']")
    public WebElement searchIcon;


    @FindBy(css = "div[aria-label='Notifications']") // //div[@class='notifications']  div.notifications
    public WebElement notifications;


    @FindBy(xpath = "//div[@id='contactsmenu']") //  #contactsmenu>div.icon-contacts.menutoggle ;  //div[@id='contactsmenu']/div[@class='icon-contacts menutoggle']
    public WebElement contactList;


    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']") //  //div[@class='avatardiv avatardiv-shown']    //div[@id='expand']
    public WebElement userIcon;


    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement setStatus;


    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settings;


    @FindBy(xpath = "//li[@data-id='help']")
    public WebElement help;


    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logout;


    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement tryCloudTab;


}
