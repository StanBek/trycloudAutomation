package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class US11_talk_page extends LoginPage {

    public US11_talk_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
