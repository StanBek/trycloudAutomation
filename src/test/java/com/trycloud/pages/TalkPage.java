package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TalkPage extends LoginPage {

    public TalkPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
