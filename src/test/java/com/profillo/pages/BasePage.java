package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }



    @FindBy(xpath = "//span[text()='Books']")
    public WebElement BooksButton;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement usersButton;



}
