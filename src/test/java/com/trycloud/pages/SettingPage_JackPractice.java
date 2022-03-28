package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingPage_JackPractice extends BasePage{

    @FindBy(xpath = "//*[.='Show rich workspaces']")
    public WebElement showRichWorkspaces;

    @FindBy(xpath = "//*[.='Show recommendations']")
    public WebElement recommendationsEnabledToggle;

    @FindBy(xpath = "//*[.='Show hidden files']")
    public WebElement showHiddenGilesToggle;
}
