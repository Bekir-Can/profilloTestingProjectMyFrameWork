package com.profillo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditBookPage extends BasePage{

    @FindBy(id = "book_group_id")
    public WebElement bookCategoryDropdown;



}
