package com.telran.addressbook.appManager;

import com.telran.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase{


    public ContactHelper (WebDriver driver) {
       super(driver);
    }

    public void submitContactCreation() {

        driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void fillContactForm(ContactData contactData) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());

        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getLastname());

        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(contactData.getAddress());

        attach(By.name("photo"),contactData.getPhoto());
        if (isElementPresent(By.xpath("//select[@name='new_group']"))){
        new Select(driver.findElement(By.xpath("//select[@name='new_group']")))
                .selectByVisibleText(contactData.getGroup());}
    }

    public void selectContact() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void initContactDelition() {
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
    }

    public int getContactCount() { return driver.findElements(By.name("selected[]")).size(); }
}
