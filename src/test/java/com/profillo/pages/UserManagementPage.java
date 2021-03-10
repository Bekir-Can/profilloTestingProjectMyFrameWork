package com.profillo.pages;

import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserManagementPage extends BasePage{

    @FindBy(xpath = "//a[normalize-space()='Add User']")
    public WebElement addUserButton;

    @FindBy(xpath = "//h5[text()='Edit User Information']")
    public WebElement editWindow;

    @FindBy(xpath = "//h5[text()='Add User']")
    public WebElement addWindow;

    @FindBy(xpath = "//button[text()='Close']")
    public WebElement closeWindow;

    @FindBy(id = "user_groups")
    public WebElement userGroupBox;

    @FindBy(xpath="//table//tbody//tr/td[5]")////table//tbody//tr[2]/td[5]
    public List<WebElement> table;

    @FindBy(name = "tbl_users_length")
    public WebElement showBox;

    @FindBy(id = "tbl_users_info")
    public WebElement tableRow;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    public ArrayList<String> getUserInfo(){

        BrowserUtils.waitFor(4);
        ArrayList<String> searchBy = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {

            WebElement row = Driver.get().findElement(By.xpath("//table//tbody//tr[1]//td["+i+"]"));
            searchBy.add(row.getText());

        }

        return searchBy;


    }

    public String tableUserStatus(String UserStatus){

        List<WebElement> numRows = table;

        for (int i = 1; i <= numRows.size(); i++) {

            WebElement row = Driver.get().findElement(By.xpath("//table//tbody//tr["+i+"]//td[6]"));

            return row.getText();

            /*Assert.assertEquals(UserStatus, row.getText());*/

        }

        return UserStatus;
    }



    public void studentsColumn(){
        BrowserUtils.waitFor( 2 );

        String category = null;

        for (int i = 1; i <= table.size(); i++) {
            String xpath = "//table//tbody//tr[" + i + "]/td[5]";
            category = Driver.get().findElement( By.xpath( xpath ) ).getText();
            Assert.assertEquals( "Students",category );
        }
    }

    public void librarianColumn(){
        BrowserUtils.waitFor( 2 );

        String category = null;

        for (int i = 1; i <= table.size(); i++) {
            String xpath = "//table//tbody//tr[" + i + "]/td[5]";
            category = Driver.get().findElement( By.xpath( xpath ) ).getText();
            Assert.assertEquals( "Librarian",category );
        }
    }

    public void chooseRandomEditUser(){
        Random rn = new Random();
        int rndm= rn.nextInt(10)+1;
        WebElement editButton = Driver.get().findElement( By.xpath("//tbody/tr[" + rndm + "]/td[1]"));
        editButton.click();
    }

    public String getTableRowNumber(){


        BrowserUtils.waitFor(4);

        String text = tableRow.getText();
        String[] dateInputarr = text.split(" ");

        System.out.println(dateInputarr[3]);

        BrowserUtils.waitFor(3);

        return dateInputarr[3];


    }


}
