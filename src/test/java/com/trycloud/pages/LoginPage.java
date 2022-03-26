package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage  {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    @FindBy(id = "lost-password")
    public WebElement forgotPassword;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningMessage;

    @FindBy(xpath = "//a[normalize-space(.)='Log in with a device']")
    public WebElement loginWithDevice;

    @FindBy(xpath = "//a[normalize-space(.)='Back to login']")
    public WebElement backToLogin;

    @FindBy(id = "reset-password-submit")
    public WebElement resetPassword;

    public  void login(String username, String password){

        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();

    }
}
