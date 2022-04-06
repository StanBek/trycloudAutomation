package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//li[@id='more-apps']//preceding-sibling::li")
    public List<WebElement> modules;

    public List<String> getTextOfModules() {
        List<String> moduleTexts = new ArrayList<>();

        for (WebElement module : modules) {
            BrowserUtils.hover(module);
            // BrowserUtils.highlight(module); try and see the results this is good for us
            BrowserUtils.sleep(1);
            moduleTexts.add(module.getText());
        }
        return moduleTexts;
    }

    public void clickModule(String moduleName) {
        String locator = "//ul[@id='appmenu']//span[normalize-space(.)='"+moduleName+"']/..";
        Driver.getDriver().findElement(By.xpath(locator)).click();

    }
}
