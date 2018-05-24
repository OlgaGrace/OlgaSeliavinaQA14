package com.telran.addressbook.appManager;

import com.telran.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    protected WebDriver driver;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private NavigationHelper navigationHelper;

    public void start() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(driver);
        contactHelper = new ContactHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        openAddressbook("http://localhost/addressbook/");
        login("admin", "secret");
    }

    public void login(String username, String password) {
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys(username);
      driver.findElement(By.xpath("//form[@id='LoginForm']/label[2]")).click();
      driver.findElement(By.name("pass")).click();
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys(password);
      driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void openAddressbook(String url) {
      driver.get(url);
    }

    public void stop() {
        driver.quit();
    }






    public void goToHomePage() {
        driver.findElement(By.linkText("home")).click();
    }


    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
