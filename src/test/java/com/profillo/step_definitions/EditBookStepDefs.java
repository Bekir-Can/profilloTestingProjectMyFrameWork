package com.profillo.step_definitions;

import com.profillo.pages.BookManagementPage;
import com.profillo.pages.EditBookPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

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
}
