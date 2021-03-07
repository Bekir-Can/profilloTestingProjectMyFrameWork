package com.profillo.step_definitions;

import com.profillo.pages.DashBoardPage;
import com.profillo.pages.UserManagementPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserManagementStepDefs {

    UserManagementPage button = new UserManagementPage();


    @Given("the librarian clicked on Users module")
    public void the_librarian_clicked_on_Users_module() {
        DashBoardPage users = new DashBoardPage();
        users.usersModule.click();

    }

    @Then("the User Management page opened")
    public void the_User_Management_page_opened() {

        Assert.assertEquals( "http://library3.cybertekschool.com/#users", Driver.get().getCurrentUrl() );

    }

    @When("the librarian clicked Edit User button")
    public void the_librarian_clicked_Edit_User_button() {

        BrowserUtils.waitFor( 2 );
        button.chooseRandomEditUser();

    }

    @When("the Edit User Information window will open")
    public void the_Edit_User_Information_window_will_open() {

        BrowserUtils.waitFor( 4 );
        Assert.assertEquals( button.editWindow.getText(),"Edit User Information" );
        BrowserUtils.waitFor( 1 );
        button.closeWindow.click();

    }

    @When("the librarian clicked Add User button")
    public void the_librarian_clicked_Add_User_button() {

        button.addUserButton.click();

    }

    @Then("the Add User window will open")
    public void the_Add_User_window_will_open() {

        BrowserUtils.waitFor( 2 );
        Assert.assertEquals( "Add User",button.addWindow.getText() );

    }


}
