package com.bridgelabz.addressbook;
import java.util.ArrayList;
public class AddressBookMain {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        AddressBook obj = new AddressBook();
        obj.addDetails(al1);
        obj.addMultipleContacts(al1);
    }
}
