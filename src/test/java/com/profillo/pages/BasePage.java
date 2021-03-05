package com.profillo.pages;

import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardButton;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement usersButton;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement booksButton;

    @FindBy(css = "#navbarDropdown>span")
    public WebElement userMenu;

    @FindBy(css = ".dropdown-item")
    public WebElement logoutButton;

    //this method will return the user informations in string...
    public String getUserText() {
        return userMenu.getText();
    }

    /*no need to define this method inside
        LoginPage since the logout function
        is inside BasePage which is opening
        in every page of the application*/
    public void logOut() {
        logoutButton.click();
    }


    @FindBy(xpath = "//span[text()='Users']")
    public WebElement usersModule;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement booksModule;

    @FindBy(xpath = "//a[@id='navbarDropdown']//span[1]")
    public WebElement userLogOut;

    @FindBy(linkText = "Log Out")
    public WebElement logOutButton;

    @FindBy(xpath = "//span[text()='Borrowing Books']")
    public WebElement borrowingBooksModule;



    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
//    public void waitUntilLoaderScreenDisappear() {
//        try {
//            WebDriverWait wait = new WebDriverWait(Driver.get(), 7);
//            wait.until( ExpectedConditions.invisibilityOf(loaderMask));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public String getUserName(){
//        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForVisibility(userName, 7);
//        return userName.getText();
//    }
//
//
//
//    public void logOut(){
//        BrowserUtils.waitFor(2);
//        BrowserUtils.clickWithJS(userName);
//        BrowserUtils.clickWithJS(logOutLink);
//    }
//    public void goToMyUser(){
//        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForClickablility(userName, 5).click();
//        BrowserUtils.waitForClickablility(myUser, 5).click();
//
//    }


}

