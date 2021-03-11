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

        Assert.assertEquals( "https://library3.cybertekschool.com/#users", Driver.get().getCurrentUrl() );

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

        BrowserUtils.waitFor( 2 );
        button.showBox.click();

    }

    @Then("the user can select,click one of the {string}")
    public void the_user_can_select_click_one_of_the(String str) {

        BrowserUtils.waitFor( 2 );
        Select showRecords = new Select(new UserManagementPage().showBox);
        showRecords.selectByVisibleText(str);

    }

    @Then("the number of rows in the table should be {string}")
    public void the_number_of_rows_in_the_table_should_be(String str2) {

           BrowserUtils.waitFor( 3 );
        Assert.assertEquals(str2, new UserManagementPage().getTableRowNumber());

    }

    @When("the librarian clicks on search box and types some user {string}")
    public void the_librarian_clicks_on_search_box_and_types_some_user(String string) {
        BrowserUtils.waitFor( 3 );
        button.searchBox.click();
        button.searchBox.sendKeys( string );
    }

    @Then("the table should contain {string}")
    public void the_table_should_contain(String string) {

        Assert.assertTrue( button.getUserInfo().contains(string) );

    }

    @When("the librarian clicks Status box to select an {string}")
    public void the_librarian_clicks_Status_box_to_select_an(String string) {

        BrowserUtils.waitFor( 2 );
        button.statusBox.click();
        Select userStatus = new Select( button.statusBox );
        userStatus.selectByVisibleText( string );

    }

    @Then("the column called Status in the table should show only {string}")
    public void the_column_called_Status_in_the_table_should_show_only(String string) {

        BrowserUtils.waitFor( 3 );
        Assert.assertEquals( string,button.tableUserStatus( string ) );

    }



}
