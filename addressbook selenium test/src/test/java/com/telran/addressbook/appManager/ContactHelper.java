package com.telran.addressbook.appManager;

import com.telran.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper {
    protected WebDriver driver;

    public ContactHelper(WebDriver driver) {
        this.driver=driver;
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
    }

    public void selectContact() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void initContactDelition() {
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
    }

    public int getContactCount() { return driver.findElements(By.name("selected[]")).size(); }
}
