package model;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    private List<Contact> contacts;

    public ContactBook(){
        contacts = new ArrayList<>();
    }

    public List<Contact> getContacts(){
        return contacts;
    }

    public boolean add(String name, String phone , String email){
        boolean added = false;
        contacts.add(new Contact(name,phone,email));

      return added;
    }
}
