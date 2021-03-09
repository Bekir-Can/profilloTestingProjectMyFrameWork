package com.profillo.pages;

import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
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

    @FindBy(id = "book_categories")
    public WebElement categoryDropdown;



    public void chooseRandomEditBook() {
        Random ran = new Random();
        int rnd = ran.nextInt(10) + 1;
        WebElement editBoButton = Driver.get().findElement(By.xpath("//tbody/tr[" + rnd + "]/td[1]"));
        editBoButton.click();
    }

    public void selectBooksCategory() {
        Select select = new Select(categoryDropdown);
        Random random = new Random();
        int rn = random.nextInt(21)+1;
        select.selectByIndex(rn);


    }

    public List<String> getCategories() {
        List<WebElement> elements = Driver.get().findElements(By.xpath("//tbody/tr/td[5]"));
    //    System.out.println(BrowserUtils.getElementsText(elements));
        return BrowserUtils.getElementsText(elements);


    }

    public String getExpected() {
        Select select = new Select(categoryDropdown);
    //    System.out.println(select.getFirstSelectedOption().getText());
        return select.getFirstSelectedOption().getText();
    }
}