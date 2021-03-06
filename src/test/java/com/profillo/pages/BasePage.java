package com.profillo.pages;

import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
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




}
