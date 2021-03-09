package com.profillo.pages;

import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AddBookPage {

    public AddBookPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(name = "name")
    public WebElement BookNameBox;

    @FindBy(xpath = "//label[@class='control-label']")
    public WebElement BookNameText;

    @FindBy(name = "isbn")
    public WebElement ISBNbox;

    @FindBy(xpath = "//label[text()='ISBN']")
    public WebElement ISBNtext;

    @FindBy(name = "year")
    public WebElement YearBox;

    @FindBy(xpath = "//label[text()='Year']")
    public WebElement YearText;

    @FindBy(xpath = "//input[@name='author']")
    public WebElement AuthorBox;

    @FindBy(xpath = "//label[text()='Author']")
    public WebElement AuthorText;

    @FindBy(id = "book_group_id")
    public WebElement BookCatBox;

    @FindBy (xpath = "//label[text()='Book Category']")
    public WebElement BookCategoryText;

    @FindBy(xpath = "//label[text()='Description']")
    public WebElement DescriptionText;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SaveChanges;

    public List<String> AddBookParameters(){

        BrowserUtils.waitFor(2);

        List<String> a = new ArrayList<>();

        a.add(BookNameText.getText());
        a.add(DescriptionText.getText());
        a.add(AuthorText.getText());
        a.add(BookCategoryText.getText());
        a.add(ISBNtext.getText());
        a.add(YearText.getText());

        return a;

    }



}
