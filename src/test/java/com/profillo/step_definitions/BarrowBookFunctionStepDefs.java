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

}
