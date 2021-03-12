package com.profillo.pages;

import com.github.javafaker.Faker;
import com.profillo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddUserPage extends BasePage {
    @FindBy(name = "full_name")
    public WebElement fullNameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(name = "email")
    public WebElement emailInput;

    @FindBy(id = "user_group_id")
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

    @FindBy(xpath = "(//div/label[@class='control-label'])[3]")
    public WebElement fullName;

    @FindBy(xpath = "(//label[@class='control-label'])[4]")
    public WebElement password;

    @FindBy(xpath = "(//label[@class='control-label'])[5]")
    public WebElement email;

    @FindBy(xpath = "(//label[@class='control-label'])[6]")
    public WebElement userGroup;

    @FindBy(xpath = "(//label[@class='control-label'])[7]")
    public WebElement status;

    @FindBy(xpath = "(//label[@class='control-label'])[8]")
    public WebElement startDate;

    @FindBy(xpath = "(//label[@class='control-label'])[9]")
    public WebElement endDate;

    @FindBy(xpath = "(//label[@class='control-label'])[10]")
    public WebElement address;

    @FindBy(xpath = "//h5[text()='Add User']")
    public WebElement mainTitle;

    public void enterFullNamePasswordEmail() {
        Faker faker = new Faker();

        fullNameInput.sendKeys(faker.name().fullName());
        passwordInput.sendKeys(faker.internet().password());
        emailInput.sendKeys(faker.internet().emailAddress());

    }

    public void selectUser(String user) {
        Select select = new Select(userGroupDropDown);
        select.selectByVisibleText(user);

    }

    public void selectStatus(String status) {
        Select select = new Select(statusDropDown);
        select.selectByVisibleText(status);

    }

    public void enterAddress() {
        Faker faker = new Faker();
        addressInput.sendKeys(faker.address().fullAddress());

    }

    public List<String> getUserGroupText() {
        Select select = new Select(userGroupDropDown);
        List<String> elementsText = BrowserUtils.getElementsText(select.getOptions());
        return elementsText;


    }
    public List<String> getStatusText() {
        Select select = new Select(statusDropDown);
        List<String> elementsText = BrowserUtils.getElementsText(select.getOptions());
        return elementsText;
    }
}