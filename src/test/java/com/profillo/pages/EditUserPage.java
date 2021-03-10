package com.profillo.pages;




import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EditUserPage{

    public EditUserPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    //my first
    @FindBy(xpath = "//input[contains(@placeholder, 'Full Name')]")
    public WebElement name;

    @FindBy(xpath = "//input[contains(@placeholder,'Password')]")
    public WebElement password;


    @FindBy(xpath ="//button[contains(@class, 'btn btn-primary')]")
    public WebElement saveChanges;

    @FindBy(xpath="//a[contains(@class,'btn btn-primary')]")
    public WebElement editUserButton;

    @FindBy(id = "user_group_id")
    public WebElement userGroupDropdown;

    @FindBy (xpath = "//div[@class='toast-message']") //updated
    public WebElement popUp;

    @FindBy(id = "status")
    public WebElement userStatusDropdown;

}
