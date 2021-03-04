package com.profillo.step_definitions;

import com.profillo.pages.LoginPage;
import com.profillo.utilities.ConfigurationReader;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Given;

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

}
