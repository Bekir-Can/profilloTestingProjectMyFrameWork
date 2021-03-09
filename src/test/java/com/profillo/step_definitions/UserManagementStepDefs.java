package com.profillo.step_definitions;

import com.profillo.pages.DashBoardPage;
import com.profillo.pages.UserManagementPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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

    @When("the user clicks on User Group dropdown and see following options")
    public void the_user_clicks_on_User_Group_dropdown_and_see_following_options(List<String> userOptions) {

        BrowserUtils.waitFor( 1 );
        button.userGroupBox.click();
        Select select = new Select( new UserManagementPage().userGroupBox );
        List<String> actualOptions = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(userOptions,actualOptions);


    }

    @When("the user can click and select one of the options")
    public void the_user_can_click_and_select_one_of_the_options() {

        BrowserUtils.waitFor( 3 );
        Select select = new Select( new UserManagementPage().userGroupBox );
        select.selectByVisibleText( "Students" );
        button.studentsColumn();

    }

    @Then("the Group column in the table should show only related options")
    public void the_Group_column_in_the_table_should_show_only_related_options() {

        BrowserUtils.waitFor( 3 );
        Select select = new Select( new UserManagementPage().userGroupBox );
        select.selectByVisibleText( "Librarian" );
        button.librarianColumn();

    }

    @Then("the user clicks show records dropdown")
    public void the_user_clicks_show_records_dropdown() {

    }

    @Then("the user can select,click one of the {int}")
    public void the_user_can_select_click_one_of_the(Integer int1) {

    }

    @Then("the number of rows in the table should be {int}")
    public void the_number_of_rows_in_the_table_should_be(Integer int1) {

    }



}
