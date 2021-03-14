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

    public void login(String userNameStr, String passwordStr) {
        usernameInputBox.sendKeys(userNameStr);
        passwordInputBox.sendKeys(passwordStr);
        signInButton.click();

    }
    public void login1(String librarian, String passwordd) {
        usernameInputBox.sendKeys(librarian);
        passwordInputBox.sendKeys(passwordd);
        signInButton.click();
    }
    public void login2(String InvalidEmail, String InvalidPassword) {
        usernameInputBox.sendKeys(InvalidEmail);
        passwordInputBox.sendKeys(InvalidPassword);
        signInButton.click();
    }
    public void preLogIn(String librarianEmail, String librarianPassword){
        usernameInputBox.sendKeys(librarianEmail);
        passwordInputBox.sendKeys(librarianPassword);
        signInButton.click();

    }




}