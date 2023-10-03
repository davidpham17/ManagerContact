package main;

import controller.ContactManagement;
import model.Contact;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact();
        
        new ContactManagement(contact).run();
    }
    
}
