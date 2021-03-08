package com.profillo.step_definitions;

import com.github.javafaker.Faker;
import com.profillo.pages.AddUserPage;
import com.profillo.pages.DashBoardPage;
import com.profillo.pages.UserManagementPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddUserStepDefs {
    @Given("the librarian clicked +Add User button")
    public void the_librarian_clicked_Add_User_button() {
        BrowserUtils.waitFor(2);
        new DashBoardPage().usersButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("the librarian fill all fields with proper infos and click save changes")
    public void the_librarian_fill_all_fields_with_proper_infos_and_click_save_changes() {

        UserManagementPage userManagementPage = new UserManagementPage();
        userManagementPage.addUserButton.click();
        BrowserUtils.waitFor(2);

        AddUserPage addUserPage = new AddUserPage();
        addUserPage.enterFullNamePasswordEmail();
        addUserPage.selectUser("Students");
        addUserPage.selectStatus("ACTIVE");
        addUserPage.startDateInput.sendKeys("08-03-2021");
        addUserPage.endDateInput.sendKeys("08-05-2021");
        addUserPage.enterAddress();

        addUserPage.submitButton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the librarian should get {string}")
    public void the_librarian_should_get(String message) {
        Assert.assertEquals(message,new AddUserPage().successMessage.getText());


    }

}
