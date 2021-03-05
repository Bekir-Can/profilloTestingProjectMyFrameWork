package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


}
