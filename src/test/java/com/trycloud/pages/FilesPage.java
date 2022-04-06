package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {


    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@id='app-settings-header']/button")
    public WebElement settingBtn;

    @FindBy(xpath = "//*[contains(label,'Show')]")
    public List<WebElement> settinChekBoxBtn;

    @FindBy(xpath = "//div[@id='app-settings-content']//input[@type='checkbox']")
    public List<WebElement> settingCheckBoxes;

    @FindBy(xpath = "//li[@id='quota']/a")
    public WebElement beforeStorageBtn;

    @FindBy(xpath = "//*[@class='icon icon-add']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement getUploadFileBtn;

    @FindBy(id = "uploadprogressbar")
    public WebElement uploadBar;

    @FindBy(xpath = "//*[@id='quota']//a")
    public WebElement afterStorage;


}

