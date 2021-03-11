package com.profillo.step_definitions;

import com.profillo.pages.DashBoardPage;
import com.profillo.pages.LoginPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginLogoutSmokeTest_StepDefs {

    //Lib login/ logout with valid credentials (Smoke Test)
    @Given("the librarian should be able to login page {string}")
    public void the_librarian_should_be_able_to_login_page(String string) {
        Driver.get().get("https://library3.cybertekschool.com");

    }

    @When("the librarian should be able to enter valid credentials {string} {string}")
    public void the_librarian_should_be_able_to_enter_valid_credentials(String usernameInputBox, String passwordInputBox) {
        new LoginPage().usernameInputBox.sendKeys(usernameInputBox);
        new LoginPage().passwordInputBox.sendKeys(passwordInputBox);

    }

    @When("the librarian should be able to click sign in button")
    public void the_librarian_should_be_able_to_click_sign_in_button() {
        new LoginPage().signInButton.click();

    }

    @Then("the librarian should be able to log out")
    public void the_librarian_should_be_able_to_log_out() {
        BrowserUtils.waitFor(2);

        new DashBoardPage().userLogOut.click();
        new DashBoardPage().logOutButton.click();

    }

    //Stu. login/ logout with valid credentials (Smoke Test)
    @Given("the student should be able to login page {string}")
    public void the_student_should_be_able_to_login_page(String string) {
        Driver.get().get("https://library3.cybertekschool.com");

    }

    @When("the student should be able to enter valid credentials {string} {string}")
    public void the_student_should_be_able_to_enter_valid_credentials(String student_username, String student_password) {
        new LoginPage().usernameInputBox.sendKeys(student_username);
        new LoginPage().passwordInputBox.sendKeys(student_password);


    }

    @When("the student should be able to click sign in button")
    public void the_student_should_be_able_to_click_sign_in_button() {
        new LoginPage().signInButton.click();

    }

    @Then("the student should be able to log out")
    public void the_student_should_be_able_to_log_out() {
        BrowserUtils.waitFor(2);
        new DashBoardPage().userLogOut.click();
        new DashBoardPage().logOutButton.click();

    }

    //Stu&Lib cannot login with invalid cred. (Smoke Test)
    @When("the student should not be able to enter invalid credentials {string} {string}")
    public void the_student_should_not_be_able_to_enter_invalid_credentials(String invalidEmail, String invalidPassword) {
        new LoginPage().usernameInputBox.sendKeys(invalidEmail);
        new LoginPage().passwordInputBox.sendKeys(invalidPassword);

    }

    @When("the librarian should not be able to enter invalid credentials {string} {string}")
    public void the_librarian_should_not_be_able_to_enter_invalid_credentials(String invalidEmail2, String invalidPassword2) {
        new LoginPage().usernameInputBox.sendKeys(invalidEmail2);
        new LoginPage().passwordInputBox.sendKeys(invalidPassword2);

    }

    @Then("the student and librarian should not be able to log in {string}")
    public void the_student_and_librarian_should_not_be_able_to_log_in(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);

    }


}
