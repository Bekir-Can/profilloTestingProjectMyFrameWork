package com.profillo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditBookPage extends BasePage{

    @FindBy(id = "book_group_id")
    public WebElement bookCategoryDropdown;


    @FindBy(name="name")
    public WebElement nameBox;

    @FindBy(name="isbn")
    public WebElement isbnBox;
    @FindBy(name="year")
    public WebElement yearBox;
    @FindBy(xpath = "//input[@placeholder='Author']")
    public WebElement authorBox;
    @FindBy(id="description")
    public WebElement descriptionBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//label[text()='Book Name']")
    public WebElement bookTitle;
    @FindBy(xpath = "//label[text()='ISBN']")
    public WebElement ISBNTitle;
    @FindBy(xpath = "//label[text()='Year']")
    public WebElement YearTitle;
    @FindBy(xpath = "//label[text()='Author']")
    public WebElement AuthorTitle;
    @FindBy(xpath = "//label[text()='Book Category']")
    public WebElement BookCaTitle;
    @FindBy(xpath = "//label[text()='Description']")
    public WebElement DescTitle;


}
