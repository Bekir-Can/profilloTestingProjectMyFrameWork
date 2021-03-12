package com.profillo.step_definitions;

import com.profillo.pages.BarrowBookManagementPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BarrowBookFunctionStepDefs {

    @Given("the user choose one records dropdown {string}")
    public void the_user_choose_one_records_dropdown(String number) {
        new BarrowBookManagementPage().selectEntitiesNumber(number);
    }

    @When("the user click the active Barrow Book button")
    public void the_user_click_the_active_Barrow_Book_button() {
        new BarrowBookManagementPage().borrowBookAction();
        BrowserUtils.waitFor(3);
    }

    @Then("the user can see green pop up and borrow the book")
    public void the_user_can_see_green_pop_up_and_borrow_the_book() {
        Assert.assertEquals("The book has been borrowed...", new BarrowBookManagementPage().message.getText());
    }

    @When("the user click inactive Borrow Book button")
    public void the_user_click_inactive_Borrow_Book_button() {
        BrowserUtils.waitFor(3);
        new BarrowBookManagementPage().inactiveButton.click();
    }

    @Then("the user can not borrowed same book twice")
    public void the_user_can_not_borrowed_same_book_twice() {
        BrowserUtils.waitFor(3);
        boolean flag = true;
        try {
            Assert.assertFalse(new BarrowBookManagementPage().message.isEnabled());
        } catch (Exception e) {
            System.out.println("catch run");
            flag = false;
            Assert.assertFalse(flag);
        }

    }

    @When("the user navigate Borrowing Book module")
    public void the_user_navigate_Borrowing_Book_module() {
        BrowserUtils.waitFor(3);
        new BarrowBookManagementPage().BorrowingBookModule.click();
    }

    @Then("the user should see own borrowed books history")
    public void the_user_should_see_own_borrowed_books_history() {
        BrowserUtils.waitFor(3);
        Assert.assertEquals("https://library3.cybertekschool.com/#borrowing-books", Driver.get().getCurrentUrl());
    }

    @When("the user click the Borrowing Books module")
    public void the_user_click_the_Borrowing_Books_module() {
        BrowserUtils.waitFor(3);
        new BarrowBookManagementPage().BorrowingBookModule.click();
    }

    @Then("the user see history of borrowed books list")
    public void the_user_see_history_of_borrowed_books_list() {
        BrowserUtils.waitFor(3);
        Assert.assertEquals("Borrowing Books", new BarrowBookManagementPage().borrowingBookTitle.getText());
    }

    @Then("the user click the active Return Book button")
    public void the_user_click_the_active_Return_Book_button() {
        new BarrowBookManagementPage().borrowingBookHistory();

    }

    @Then("the user see green pop up after return the book")
    public void the_user_see_green_pop_up_after_return_the_book() {
        BrowserUtils.waitFor(3);
        Assert.assertEquals("The book has been returned..", new BarrowBookManagementPage().message.getText());
    }

    @When("the user click Book Categories dropdown box")
    public void the_user_click_Book_Categories_dropdown_box() {
        new BarrowBookManagementPage().categoryDropdown.click();
    }

    @Then("the user see all book categories")
    public void the_user_see_all_book_categories(List<String> bookOptions) {
        BrowserUtils.waitFor(3);
        new BarrowBookManagementPage().bookCategory(bookOptions);
    }

    @When("the user select and click one category")
    public void the_user_select_and_click_one_category() {
        Select select = new Select(new BarrowBookManagementPage().categoryDropdown);
        select.selectByVisibleText("Classic");
    }

    @Then("the user see books related to that category")
    public void the_user_see_books_related_to_that_category() {
        BrowserUtils.waitFor(3);
        new BarrowBookManagementPage().selectCategory();
    }

    @Then("the user should be able to click to show records dropdown box")
    public void the_user_should_be_able_to_click_to_show_records_dropdown_box() {
        BrowserUtils.waitFor(3);
        BarrowBookManagementPage recordsBox = new BarrowBookManagementPage();
        recordsBox.recordBox.click();
    }

    @When("the user select one option in show records dropdown")
    public void the_user_select_one_option_in_show_records_dropdown() {
        BrowserUtils.waitFor(3);
        Select select = new Select(new BarrowBookManagementPage().recordBox);
        select.selectByVisibleText("10");
    }

    @Then("the user should be able to see the exact number of books that he selected")
    public void the_user_should_be_able_to_see_the_exact_number_of_books_that_he_selected() {
        BrowserUtils.waitFor(2);
        List<WebElement> columnEditBook = new BarrowBookManagementPage().sizeTabe;
        BrowserUtils.waitFor(3);
        Assert.assertEquals(10, columnEditBook.size());
    }

    @When("the user in search box should type the name of the book")
    public void the_user_in_search_box_should_type_the_name_of_the_book() {
        BrowserUtils.waitFor(3);
        BarrowBookManagementPage searchBox = new BarrowBookManagementPage();
        searchBox.searchBox.sendKeys("The Farm of Animal");
    }

    @Then("the user will see all books according to search")
    public void the_user_will_see_all_books_according_to_search() {
        BrowserUtils.waitFor(2);
        new BarrowBookManagementPage().BookName();
    }

    @When("the user in search box should type the name of author")
    public void the_user_in_search_box_should_type_the_name_of_author() {
        BrowserUtils.waitFor(3);
        BarrowBookManagementPage searchBox = new BarrowBookManagementPage();
        BrowserUtils.waitFor(2);
        searchBox.searchBox.clear();
        BrowserUtils.waitFor(1);
        searchBox.searchBox.sendKeys("Cervantes");
    }

    @Then("the user can see all books written by author that he searched")
    public void the_user_can_see_all_books_written_by_author_that_he_searched() {
        new BarrowBookManagementPage().Author();
    }

}


