package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FilePage_Ramia {

   public FilePage_Ramia(){
      PageFactory.initElements(Driver.getDriver(),this);
   }


   @FindBy(xpath = "//a[@class='action action-menu permanent']")
  public List<WebElement> allActionButton;

    @FindBy(xpath = "//tbody/tr[1]//a[@class='action action-menu permanent']")
    public WebElement firstActionButton;

   @FindBy(xpath = "//span[text()='Remove from favorites']")
   public WebElement removeFromFavorite;

   @FindBy(linkText = "Favorites")
   public WebElement favoriteSubModule;

   @FindBy(xpath = "//span[@class='innernametext']")
   public WebElement folderText;

   @FindBy(xpath = "//span[@class='innernametext']")
   public List<WebElement> allFavoriteList;


   public void clickAction(List<WebElement> allActions){
      for (WebElement eachAction : allActions) {
          WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);
          wait.until(ExpectedConditions.visibilityOf(eachAction));
          eachAction.click();
          Driver.getDriver().navigate().back();
            return;

      }

   }
   public void clickAllRemoveFromFavorite(List<WebElement> allActions){
       for (WebElement eachAction : allActions) {
           eachAction.click();
           BrowserUtils.waitFor(3);
       }
       Assert.assertTrue(removeFromFavorite.isDisplayed());

       return;
   }







}
