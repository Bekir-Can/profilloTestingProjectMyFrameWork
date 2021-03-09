package com.profillo.step_definitions;

import com.profillo.pages.AddBookPage;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddBookStepDefs {

    @When("user fills each add book parameters on add book window")
    public void user_fills_each_add_book_parameters_on_add_book_window() {

        AddBookPage a = new AddBookPage();
        a.BookNameBox.sendKeys("Bakkal");
        a.YearBox.sendKeys("1971");
        a.AuthorBox.sendKeys("Graven Dras");

    }

    @When("user clicks on save changes button")
    public void user_clicks_on_save_changes_button() {

        new AddBookPage().SaveChanges.click();

    }

    @Then("new added book will appear on book managament page")
    public void new_added_book_will_appear_on_book_managament_page() {

        Assert.assertTrue(Driver.get().findElement(By.xpath("//div[@class='toast-message']")).isDisplayed());

    }

    @Then("user should be able to see following parameters")
    public void user_should_be_able_to_see_following_parameters(List<String> addBookOptions) {

        Assert.assertEquals(addBookOptions, new AddBookPage().AddBookParameters());

    }

    @When("user clicks on ISBN box")
    public void user_clicks_on_ISBN_box() {

        new AddBookPage().ISBNbox.click();
    }

    @Then("user enters ISBN data")
    public void user_enters_ISBN_data() {

        new AddBookPage().ISBNbox.sendKeys("17870530243-6");
    }

    @When("user clicks on Year box")
    public void user_clicks_on_Year_box() {

        new AddBookPage().YearBox.click();

    }

    @Then("user enters Year data")
    public void user_enters_Year_data() {

        new AddBookPage().YearBox.sendKeys("1999");
    }

    @When("the user clicks on Book Category dropdown")
    public void the_user_clicks_on_Book_Category_dropdown() {

        new AddBookPage().BookCatBox.click();
    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> bookOptions) {

        Select select = new Select(Driver.get().findElement(By.id("book_group_id")));
        List<WebElement> dropDownOptions = select.getOptions();

        Assert.assertEquals(bookOptions.size(), dropDownOptions.size());

//        Assert.assertEquals(bookOptions,dropDownOptions);

    }

}
