package com.profillo.step_definitions;

import com.github.javafaker.Faker;
import com.profillo.pages.AddUserPage;
import com.profillo.pages.DashBoardPage;
import com.profillo.pages.UserManagementPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AddUserStepDefs {
    @Given("the librarian clicked +Add User button")
    public void the_librarian_clicked_Add_User_button() {
        BrowserUtils.waitFor(2);
        UserManagementPage userManagementPage = new UserManagementPage();
        BrowserUtils.clickWithJS(userManagementPage.addUserButton);
        BrowserUtils.waitFor(2);

    }

    @When("the librarian fill all fields with proper infos and click save changes")
    public void the_librarian_fill_all_fields_with_proper_infos_and_click_save_changes() {


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
        Assert.assertEquals(message, new AddUserPage().successMessage.getText());


    }

    @When("the librarian fill all fields and click button with librarian role")
    public void the_librarian_fill_all_fields_and_click_button_with_librarian_role() {


        AddUserPage addUserPage = new AddUserPage();
        addUserPage.enterFullNamePasswordEmail();
        addUserPage.selectUser("Librarian");
        addUserPage.selectStatus("ACTIVE");
        addUserPage.startDateInput.sendKeys("2021-04-20");
        addUserPage.endDateInput.sendKeys("2021-05-20");
        addUserPage.enterAddress();

        addUserPage.submitButton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("all the parameters titles should match with {string},{string},{string},{string},{string},{string},{string},{string}")
    public void all_the_parameters_titles_should_match_with(String fullName, String password, String email, String userGroup, String status, String startDate, String endDate, String address) {

        AddUserPage addUserPage = new AddUserPage();

        Assert.assertEquals(fullName, addUserPage.fullName.getText());
        Assert.assertEquals(password, addUserPage.password.getText());
        Assert.assertEquals(email, addUserPage.email.getText());
        Assert.assertEquals(userGroup, addUserPage.userGroup.getText());
        Assert.assertEquals(status, addUserPage.status.getText());
        Assert.assertEquals(startDate, addUserPage.startDate.getText());
        Assert.assertEquals(endDate, addUserPage.endDate.getText());
        Assert.assertEquals(address, addUserPage.address.getText());


    }

    @Then("the user should get all necessary userGroup options")
    public void the_user_should_get_all_necessary_userGroup_options(List<String> userGroup) {
        System.out.println("userGroup = " + userGroup);
        System.out.println("new AddUserPage().getUserGroupText() = " + new AddUserPage().getUserGroupText());
        Assert.assertEquals(userGroup, new AddUserPage().getUserGroupText());


    }

    @Then("the user should get all necessary status options")
    public void the_user_should_get_all_necessary_status_options(List<String> status ) {
        System.out.println("status = " + status);
        System.out.println("new AddUserPage().getStatusText() = " + new AddUserPage().getStatusText());
        Assert.assertEquals(status,new AddUserPage().getStatusText());

    }

    @Then("user should get {string} main title")
    public void user_should_get_main_title(String mainTitle) {
        AddUserPage addUserPage = new AddUserPage();
        Assert.assertEquals(mainTitle,addUserPage.mainTitle.getText());
    }
}
