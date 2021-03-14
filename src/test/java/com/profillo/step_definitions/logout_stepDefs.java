package com.profillo.step_definitions;

import com.profillo.pages.DashBoardPage;
import com.profillo.pages.LoginPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.ConfigurationReader;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logout_stepDefs {


    @When("the user should be able to click the user name button")
    public void the_user_should_be_able_to_click_the_user_name_button() {
        new DashBoardPage().userLogOut.click();

    }

    @When("the user click the log out button")
    public void the_user_click_the_log_out_button() {
        BrowserUtils.waitFor(2);
        new DashBoardPage().logOutButton.click();

    }

    @Then("log out page title should be {string}")
    public void log_out_page_title_should_be(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);

    }
}
