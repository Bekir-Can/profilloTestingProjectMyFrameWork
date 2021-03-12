package com.profillo.step_definitions;

import com.profillo.pages.BookManagementPage;
import com.profillo.pages.DashBoardPage;
import com.profillo.pages.UserManagementPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class BookManagementStepDefs {
    BookManagementPage button = new BookManagementPage();

    @Given("the librarian clicked on Books module")
    public void the_librarian_clicked_on_Books_module() {
        DashBoardPage books = new DashBoardPage();
        books.booksModule.click();
    }

    @Then("the Book Management page opened")
    public void the_Book_Management_page_opened() {
        Assert.assertEquals( "https://library3.cybertekschool.com/#books", Driver.get().getCurrentUrl() );
    }

    @When("the librarian clicks Edit Book button")
    public void the_librarian_clicks_Edit_Book_button() {
        BrowserUtils.waitFor( 2 );
        button.chooseRandomEditBook();

    }

    @When("the Edit Book Information window will open")
    public void the_Edit_Book_Information_window_will_open() {
        BrowserUtils.waitFor( 4 );
        Assert.assertEquals( button.editBookWindow.getText(),"Edit Book Information" );
        BrowserUtils.waitFor( 1 );
        button.closeWindow.click();
        BrowserUtils.waitFor( 3 );
    }

    @When("the librarian clicks Add Book button")
    public void the_librarian_clicks_Add_Book_button() {
        BrowserUtils.waitFor( 3 );
        new BookManagementPage().addBookButton.click();

    }

    @Then("the Add Book window will open")
    public void the_Add_Book_window_will_open() {
        BrowserUtils.waitFor( 2 );
        Assert.assertEquals( "Add Book",button. addBookWindow.getText() );
    }
    @When("the librarian click Book Categories dropdown box")
    public void the_librarian_click_Book_Categories_dropdown_box() {
        BrowserUtils.waitFor(3);
        button.categoryDropdown.click();

    }

    @When("the librarian select and click one category")
    public void the_librarian_select_and_click_one_category() {
        button.selectBooksCategory();
        BrowserUtils.waitFor(3);


    }

    @Then("the librarian see books related to that category")
    public void the_librarian_see_books_related_to_that_category() {
        List<String> categories = button.getCategories();
        for (String category : categories) {
            Assert.assertEquals(button.getExpected(),category);
            
        }


    }


}
