package com.profillo.step_definitions;

import com.github.javafaker.Faker;
import com.profillo.pages.AddUserPage;
import com.profillo.pages.BookManagementPage;
import com.profillo.pages.EditBookPage;
import com.profillo.pages.UserManagementPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EditBookStepDefs {

    @When("the librarian clicks Book Category dropdown")
    public void the_librarian_clicks_Book_Category_dropdown() {
        BrowserUtils.waitFor( 2 );
        EditBookPage BCDropdown = new EditBookPage();
        BCDropdown.bookCategoryDropdown.click();

    }

    @Then("the librarian should see following options")
    public void the_librarian_should_see_following_options(List<String> categoryOptions) {
       BrowserUtils.waitFor(3);
        Select select = new Select(new EditBookPage().bookCategoryDropdown);

        BrowserUtils.waitFor(2);
        List<String> actualOptions = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(categoryOptions,actualOptions);
    }

    @Then("user fills each component in edit window")
    public void user_fills_each_component_in_edit_window() {
        BrowserUtils.waitFor(2);
        EditBookPage box = new EditBookPage();
        box.nameBox.clear();
        box.nameBox.sendKeys("Persuasion");
        box.isbnBox.clear();
        box.isbnBox.sendKeys("HS-124367");
        box.yearBox.clear();
        box.yearBox.sendKeys("1989");
        box.authorBox.clear();
        box.authorBox.sendKeys("Jane Austen");
        box.descriptionBox.clear();
        box.descriptionBox.sendKeys("Classic");
    }


    @Then("all the parameters titles should match with {string},{string},{string},{string},{string},{string}")
    public void all_the_parameters_titles_should_match_with(String bookTitle, String ISBNTitle, String YearTitle, String AuthorTitle, String BookCaTitle, String DescTitle) {

        EditBookPage editBookPage = new EditBookPage();

        Assert.assertEquals(bookTitle,editBookPage.bookTitle.getText());
        Assert.assertEquals(ISBNTitle,editBookPage.ISBNTitle.getText());
        Assert.assertEquals(YearTitle,editBookPage.YearTitle.getText());
        Assert.assertEquals(AuthorTitle,editBookPage.AuthorTitle.getText());
        Assert.assertEquals(BookCaTitle,editBookPage.BookCaTitle.getText());
        Assert.assertEquals(DescTitle,editBookPage.DescTitle.getText());

    }

    @Then("the librarian clicks on Save Changes button")
    public void the_librarian_clicks_on_Save_Changes_button() {
        BrowserUtils.waitFor(3);
        EditBookPage button= new EditBookPage();
        button.saveButton.click();
    }

    @Then("New changes will appear on book management page")
    public void new_changes_will_appear_on_book_management_page() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().findElement(By.xpath("//div[@class='toast toast-success']")).isDisplayed());

    }

    @When("the librarian clicks on ISBN box")
    public void the_librarian_clicks_on_ISBN_box() {

        BrowserUtils.waitFor( 3 );
        Driver.get().findElement(By.xpath("(//input[@class='form-control'])[2]")).click();
    }

    @Then("the librarian  enters ISBN data")
    public void the_librarian_enters_ISBN_data() {
        BrowserUtils.waitFor( 3 );

        Driver.get().findElement(By.name("isbn")).clear();
        Driver.get().findElement(By.name("isbn")).sendKeys("HS-8589190");
        Driver.get().findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("abc");
    }
    @When("the librarian clicks on Year box")
    public void the_librarian_clicks_on_Year_box() {
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("(//input[@class='form-control'])[3]")).click();
        Driver.get().findElement(By.xpath("(//input[@class='form-control'])[3]")).clear();
    }

    @Then("the librarian enters Year data")
    public void the_librarian_enters_Year_data() {
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("1978");
    }

}
