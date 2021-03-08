package com.profillo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


}
