package com.profillo.pages;

import com.profillo.utilities.ConfigurationReader;
import com.profillo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement usernameInputBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;


    public void librarianLogin() {
    usernameInputBox.sendKeys(ConfigurationReader.get("librarian_username"));
    passwordInputBox.sendKeys(ConfigurationReader.get("librarian_password")+ Keys.ENTER);
    }

    public void studentLogin() {
        usernameInputBox.sendKeys(ConfigurationReader.get("student_username"));
        passwordInputBox.sendKeys(ConfigurationReader.get("student_password"));
        signInButton.click();
    }

}