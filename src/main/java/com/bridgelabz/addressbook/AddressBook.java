package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    public void CreateContact(){
        Contact contact = new Contact();
        System.out.println("Enter first name");
        String firstname = scanner.next();
        contact.setFirstname(firstname);
        System.out.println("Enter last name");
        String lastname = scanner.next();
        contact.setLastname(lastname);
        System.out.println("Enter address");
        String address = scanner.next();
        contact.setLastname(address);
        System.out.println("Enter city");
        String city = scanner.next();
        contact.setCity(city);
        System.out.println("Enter state");
        String state = scanner.next();
        contact.setState(state);
        System.out.println("Enter zip");
        int zip = scanner.nextInt();
        contact.setZip(zip);
        System.out.println("Enter phonenum");
        long phonenum = scanner.nextLong();
        contact.setPhonenum(phonenum);
        System.out.println("Enter email");
        String email = scanner.next();
        contact.setEmail(email);
        System.out.println(contact);


    }
}
