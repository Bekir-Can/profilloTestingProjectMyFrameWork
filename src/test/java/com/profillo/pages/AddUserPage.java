package com.profillo.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage extends BasePage{
    @FindBy(name="full_name")
    public WebElement fullNameInput;

    @FindBy(name="password")
    public WebElement passwordInput;

    @FindBy(name="email")
    public WebElement emailInput;

    @FindBy(id="user_group_id")
    public WebElement userGroupDropDown;

    @FindBy(id = "status")
    public WebElement statusDropDown;

    @FindBy(name = "start_date")
    public WebElement startDateInput;

    @FindBy(name = "end_date")
    public WebElement endDateInput;

    @FindBy(id = "address")
    public WebElement addressInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(css = ".toast-message")
    public WebElement successMessage;

    public void enterFullNamePasswordEmail(){
        Faker faker = new Faker();

        fullNameInput.sendKeys(faker.name().fullName());
        passwordInput.sendKeys(faker.internet().password());
        emailInput.sendKeys(faker.internet().emailAddress());

    }

    public void selectUser(String user){
        Select select = new Select(userGroupDropDown);
        select.selectByVisibleText(user);

    }
    public void selectStatus(String status){
        Select select = new Select(statusDropDown);
        select.selectByVisibleText(status);

    }
    public void enterAddress(){
        Faker faker = new Faker();
        addressInput.sendKeys(faker.address().fullAddress());

    }


}
