package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class UserManagementPage extends BasePage{

    @FindBy(xpath = "//a[@data-toggle='modal']")
    public WebElement addUserButton;

    @FindBy(xpath = "//h5[text()='Edit User Information']")
    public WebElement editWindow;

    @FindBy(xpath = "//h5[text()='Add User']")
    public WebElement addWindow;

    @FindBy(xpath = "//button[text()='Close']")
    public WebElement closeWindow;

    public void chooseRandomEditUser(){
        Random rn = new Random();
        int rndm= rn.nextInt(10)+1;
        WebElement editButton = Driver.get().findElement( By.xpath("//tbody/tr[" + rndm + "]/td[1]"));
        editButton.click();
    }

}
