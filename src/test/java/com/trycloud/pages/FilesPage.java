package com.trycloud.pages;

        import com.trycloud.utilities.Driver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class FilesPage {

    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[contains(.,'Settings')]")
    public WebElement settingBtn;
    @FindBy(xpath = "//div[@id='app-settings-content']//input[@type='checkbox']")
    public WebElement settingOptions;
    @FindBy(xpath = "//a[@class='icon-quota svg']/p")
    public WebElement usedStorageParagraph;
    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label/span[2]")
    public WebElement uploadBtn;
}
