package com.profillo.pages;

import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BarrowBookManagementPage extends BasePage {


    @FindBy(name = "tbl_books_length")
    public WebElement entityDropDown;

    @FindBy(css = ".toast-message")
    public WebElement message;

    @FindBy(xpath = "(//li[@class='page-item next'])[1]")
    public WebElement changePage;

    public void selectEntitiesNumber(String number) {
        Select select = new Select(entityDropDown);
        select.selectByValue(number);
    }

    public void borrowBookAction() {

        Select select = new Select(entityDropDown);
        Integer number = Integer.parseInt(select.getFirstSelectedOption().getText());
        for (int i = 1; i <= number; i++) {
            try {
                BrowserUtils.waitForClickablility(Driver.get().findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/a")), 2);
                WebElement element = Driver.get().findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/a"));
                element.click();
                System.out.println("this try block run");
                break;
            } catch (Exception e) {
                System.out.println("this borrow book button is not clickable");
                if (i % number == 0) {
                    i = 1;
                    changePage.click();
                }
            }
        }
    }
}
