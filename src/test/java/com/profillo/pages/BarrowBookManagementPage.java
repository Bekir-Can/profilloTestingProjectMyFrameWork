package com.profillo.pages;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class BarrowBookManagementPage extends BasePage {
    @FindBy(name = "tbl_books_length")
    public WebElement entityDropDown;
    @FindBy(css = ".toast-message")
    public WebElement message;
    @FindBy(xpath = "//*[@id=\"tbl_books_paginate\"]/ul/li[8]/a/i")
    public WebElement changePage;
    public void selectEntitiesNumber(String number) {
        Select select = new Select(entityDropDown);
        select.selectByValue(number);
    }
    public void borrowBookAction() {
        Select select = new Select(entityDropDown);
        Integer number = Integer.parseInt(select.getFirstSelectedOption().getText());
        for (int i = 1; i <= number; i++) {
            try {
                BrowserUtils.waitForClickablility(Driver.get().findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/a")), 2);
                WebElement element = Driver.get().findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/a"));
                element.click();
                System.out.println("this try block run");
                break;
            } catch (Exception e) {
                System.out.println("this borrow button is not clickable");
                if (i % number == 0) {
                    i = 1;
                    changePage.click();
                }
            }
        }
    }
    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement inactiveButton;
    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[2]/a/span[1]")
    public WebElement BorrowingBookModule;
    @FindBy(xpath = "//*[@id=\"borrowed_list\"]/tbody/tr[1]/td[1]")
    public WebElement returnBookButton;
    @FindBy(xpath = "//*[@id=\"borrowing-books\"]/div[1]/div[1]/h3")
    public WebElement borrowingBookTitle;
    public void borrowingBookHistory() {
        int size = returnBooksList.size();
        for (int i = 1; i <= size; i++) {
            try {
                BrowserUtils.waitForClickablility(Driver.get().findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/a")), 2);
                WebElement element = Driver.get().findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/a"));
                element.click();
                System.out.println("this try block run");
                break;
            } catch (Exception e) {
                System.out.println("this borrow button is not clickable");
            }
        }
    }
    @FindBy(id = "book_categories")
    public WebElement categoryDropdown;
    @FindBy(xpath = "//table//tbody//tr/td[5]")
    public List<WebElement> table;
    public void selectCategory() {
        BrowserUtils.waitFor(2);
        String category = null;
        for (int i = 1; i <= table.size(); i++) {
            String xpath = "//table[@id='tbl_books']/tbody[1]/tr[" + i + "]/td[5]";
            category = Driver.get().findElement(By.xpath(xpath)).getText();
            Assert.assertEquals("Classic", category);
        }
    }
    public void bookCategory(List<String> bookOptions) {
        Select select = new Select(new BarrowBookManagementPage().categoryDropdown);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        List<String> actualOptions = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(bookOptions, actualOptions);
    }
    @FindBy(name = "tbl_books_length")
    public WebElement recordBox;
    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> sizeTabe;
    @FindBy(tagName = "input")
    public WebElement searchBox;
    public void BookName() {
        List<WebElement> nameBook = new BarrowBookManagementPage().sizeTabe;
        BrowserUtils.waitFor(3);
        for (int i = 1; i <= nameBook.size(); i++) {
            String bookName = Driver.get().findElement(By.xpath("//table/tbody/tr[" + i + "]/td[3]")).getText();
            BrowserUtils.waitFor(2);
            Assert.assertEquals("The Farm of AnimalPersuation", bookName);
        }
    }
    public void Author() {
        List<WebElement> nameBook = new BarrowBookManagementPage().sizeTabe;
        BrowserUtils.waitFor(3);
        for (int i = 1; i <= nameBook.size(); i++) {
            String authorName = Driver.get().findElement(By.xpath("//table/tbody/tr[" + i + "]/td[4]")).getText();
            BrowserUtils.waitFor(2);
            Assert.assertEquals("Cervantes", authorName);
        }
    }
    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> returnBooksList;
}