package com.profillo.step_definitions;




import com.profillo.pages.EditUserPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class EditUserStepDefs {





    //My first scenario 3 and 4. steps...

    @When("change the Full Name information with {string} and click Save changes")
    public void change_the_Full_Name_information_with_and_click_Save_changes(String string) {
        BrowserUtils.waitFor(4);
        EditUserPage fullName = new EditUserPage();
        fullName.name.clear();
        fullName.name.sendKeys("John");
        fullName.saveChanges.click();










    }

    @Then("librarian should get {string}")
    public void librarian_should_get(String string) {
        BrowserUtils.waitFor(4);
        EditUserPage popUp1 = new EditUserPage();
        String expectedPopUp = "The user updated.";
        String actualPopUp = popUp1.popUp.getText();
        Assert.assertEquals("verify popUp", expectedPopUp, actualPopUp);

    }




    //My second Scenario

    @When("change the Password information with {string} and click Save changes")
    public void change_the_Password_information_with_and_click_Save_changes(String string) {
        EditUserPage passWord = new EditUserPage();
        passWord.password.clear();
        BrowserUtils.waitFor(3);
        passWord.password.sendKeys("12345pass");
        passWord.saveChanges.click();


    }


    //My third Scenario

    @When("click User Group dropdown,select Librarian,and click Save changes")
    public void click_User_Group_dropdown_select_Librarian_and_click_Save_changes() {
        BrowserUtils.waitFor(3);
        EditUserPage dropdown = new EditUserPage();
        dropdown.userGroupDropdown.click();
        Select select = new Select(new EditUserPage().userGroupDropdown);
        select.selectByVisibleText("Librarian");
        dropdown.saveChanges.click();


    }

    @When("click User Group dropdown,select Students,and click Save changes")
    public void click_User_Group_dropdown_select_Students_and_click_Save_changes() {
        BrowserUtils.waitFor(3);
        EditUserPage dropdown = new EditUserPage();
        dropdown.userGroupDropdown.click();
        Select select = new Select(new EditUserPage().userGroupDropdown);
        select.selectByVisibleText("Students");
        dropdown.saveChanges.click();


    }



    //My last Scenario
    @When("click Status dropdown,select ACTIVE,and click Save changes")
    public void click_Status_dropdown_select_ACTIVE_and_click_Save_changes() {
        BrowserUtils.waitFor(3);
        EditUserPage drop=new EditUserPage();
        drop.userStatusDropdown.click();
        Select select = new Select( new EditUserPage().userStatusDropdown);
        select.selectByVisibleText("ACTIVE");
        drop.saveChanges.click();


    }

    @When("click Status dropdown,select INACTIVE,and click Save changes")
    public void click_Status_dropdown_select_INACTIVE_and_click_Save_changes() {
        BrowserUtils.waitFor(3);
        EditUserPage drop=new EditUserPage();
        drop.userStatusDropdown.click();
        Select select = new Select( new EditUserPage().userStatusDropdown);
        select.selectByVisibleText("INACTIVE");
        drop.saveChanges.click();


    }



}
