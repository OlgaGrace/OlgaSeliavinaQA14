package com.telran.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {


    public NavigationHelper (WebDriver driver) {

        super(driver);
    }
    public void goToGroupPage() {
        click(By.linkText("groups"));
    }

    public void goToAddNewPage() {
        driver.findElement(By.linkText("add new")).click();
    }

    public void goToHomePage() {
        driver.findElement(By.xpath("//a[@href='./']")).click();
    }
}
