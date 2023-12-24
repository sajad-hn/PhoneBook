package com.projects.phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
//    private static ArrayList<String> names = new ArrayList<>();
//    private static ArrayList<String> numbers = new ArrayList<>();
    private static ArrayList<Contact> contacts = new ArrayList<>();
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("--------------------");
            scanner.nextLine();
            // System.out.println(choice);

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    printAllContacts();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid User Input.");
            }
        } while (choice != 3);
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--------Menu--------");
        System.out.println("1. Add contacts");
        System.out.println("2. Print all contacts");
        System.out.println("3. Exit");
        System.out.println("--------------------");
    }

    private static void printAllContacts() {
        if(contacts.isEmpty()){
            System.out.println("Phonebook is empty!");
        }else{
            System.out.println("All Contacts:");
            System.out.println("--------------------");
            for (int i = 0; i < contacts.size(); i++) {
                //int j = i + 1;
                System.out.print("Contact No. " + (i + 1) );
                System.out.print(" Name is: " + contacts.get(i).getName() +" and ");
                System.out.println("Number is: " + contacts.get(i).getNumber());
                System.out.println("--------------------");
            }
        }
        if(!contacts.isEmpty()) {
            System.out.println("All contact's Names and Numbers printed successfully!");
        }
    }

    private static void addContact(Scanner scanner){
        Contact newContact = new Contact();
        System.out.println("Enter contact's name: ");
        String name = scanner.nextLine();
        newContact.setName(name);
        System.out.println("Enter contact's number: ");
        String number = scanner.nextLine();
        newContact.setNumber(number);
        contacts.add(newContact);
        System.out.println("Contact added successfully!");
        System.out.println("--------------------");
    }
}
