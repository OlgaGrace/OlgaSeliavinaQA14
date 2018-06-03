package com.telran.addressbook.tests;

import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class CreateContact extends TestBase {

    @Test
    public void contactCreationTest() {
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().goToAddNewPage();
        File photo=new File("src/test/resources/cat.jpg");
        app.getContactHelper().fillContactForm(new ContactData()
                .withFirstName("Olga")
                .withLastname("Selevie")
                .withAddress("Ramat Gan")
                .withPhoto(photo)
                .withGroup("Hope"));
        app.getContactHelper().submitContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);

    }
}
