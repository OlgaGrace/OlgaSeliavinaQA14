package com.telran.addressbook.model;

import java.io.File;

public class ContactData {
    private  String firstname;
    private  String lastname;
    private  String address;
    private File photo;
    private String group;



    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    public ContactData withFirstName(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public ContactData withLastname(String lastname) {
                this.lastname = lastname;
                return this;
    }

    public ContactData withAddress(String address) {
              this.address = address;
              return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public File getPhoto() {
        return photo;
    }

    public String getGroup() {        return group; }
}
