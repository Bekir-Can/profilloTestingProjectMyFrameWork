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


public class LoginStepDefs {



    @Given("the librarian logged in the application")
    public void the_librarian_logged_in_the_application() {

        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().librarianLogin();


    }

    @Given("Student logged in the application")
    public void student_logged_in_the_application() {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().studentLogin();


    }

    //Lib. and stu. log in with valid cred. (Test)
    @When("the user enter valid credentials {string} {string}")
    public void the_user_enter_valid_credentials(String email, String password) {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login(email, password);


    }

    @Then("the user can log in")
    public void the_user_can_log_in() {
        //BrowserUtils.waitFor(2);
        Assert.assertEquals("Login - Library", Driver.get().getTitle());


    }

    // Lib. log in with invalid cred. (Test)
    @When("the user cannot enter invalid credentials {string} {string}")
    public void the_user_cannot_enter_invalid_credentials(String usernameInputBox, String passwordInputBox) {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login1(usernameInputBox,passwordInputBox);
        

    }

    @Then("the user cannot log in")
    public void the_user_cannot_log_in() {
        BrowserUtils.waitFor(2);
        Assert.assertEquals("https://library3.cybertekschool.com/login.html", Driver.get().getCurrentUrl());

    }

    //Stu. log in with invalid cred. (Test)
    @When("the user enter invalid credentials {string} {string}")
    public void the_user_enter_invalid_credentials(String InvalidEmail, String InvalidPassword) {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login2(InvalidEmail, InvalidPassword);


    }






}  
