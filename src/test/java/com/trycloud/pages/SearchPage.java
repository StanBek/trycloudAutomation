package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends LoginPage{
    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class = 'unified-search__form-input']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//h3[@class='unified-search__result-line-one']")
    public WebElement searchResult;

    @FindBy(xpath = "//*[@type='reset']")
    public WebElement resetButton;

}
