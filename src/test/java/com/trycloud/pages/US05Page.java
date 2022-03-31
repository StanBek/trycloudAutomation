package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US05Page extends LoginPage{

    public US05Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[3]/a[2]/span[1]")
    public WebElement clicksActionIconFromAnyFileOnThePageAndUserChooseTheOption;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[3]/a/span[2]")
    public WebElement addToFavorites;

    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[3]/a")
    public WebElement clickTheSubModuleOnTheLeftSide;


    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[1]/a/span[1]/span")
    public WebElement Talk;

}
