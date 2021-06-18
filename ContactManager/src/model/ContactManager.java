package model;

import java.util.ArrayList;
public class ContactManager {
	
	private ArrayList<Contact> contacts;
	
	public ContactManager() {
		contacts = new ArrayList<Contact>();
	}
	
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	
	public void saveContact(Contact newContact) {
		contacts.add(newContact);
		
	}

}
