package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class BookManagementPage extends BasePage {


    @FindBy(xpath =  "//a[@data-target='#ajax']")
    public WebElement addBookButton;

    @FindBy(xpath = "//h5[text()='Edit Book Information']")
    public WebElement editBookWindow;

    @FindBy(xpath = "//h5[text()='Add Book']")
    public WebElement addBookWindow;

    @FindBy(xpath = "//button[text()='Close']")
    public WebElement closeWindow;

    public void chooseRandomEditBook() {
        Random ran = new Random();
        int rnd = ran.nextInt(10) + 1;
        WebElement editBoButton = Driver.get().findElement(By.xpath("//tbody/tr[" + rnd + "]/td[1]"));
        editBoButton.click();
    }
}