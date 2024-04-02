package com.assignment.day5.q5;

import java.util.HashMap;
import java.util.Scanner;

public class TestPhoneBook {
    /*Implement a PhoneBook using HashMap.
        Hint: Create the following classes:
        Person Class contains firstName and surName.
        PhoneNumber Class contains areaCode and number.
        BookEntry contains Person object and PhoneNumber object.
        PhoneBook contains a HashMap<Person,BookEntry>.
        TestPhoneBook Class contains main() to do the following:
        The user should be prompted with the following menu:
        Enter-1: to add a new phonebook entry
        Enter-2: to find the number for a name
        Enter-3: to find name for a number
        Enter-9: to quit
     */

    public static void main(String[] args) {

        PhoneBook phoneBook=new PhoneBook();

        Scanner scanner=new Scanner(System.in);

        int opt=0;
        do{
            System.out.println("Enter-1: to add a new phonebook entry\nEnter-2: to find the number for a " +
                            "name\nEnter-3: to find name for a number\nEnter-9: to quit");
            opt=scanner.nextInt();
            scanner.nextLine();
            switch (opt){
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter surname: ");
                    String surName = scanner.nextLine();
                    System.out.print("Enter area code: ");
                    int areaCode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    Long phoneNumber = scanner.nextLong();
                    phoneBook.addEntry(new Person(firstName, surName), new PhoneNumber(areaCode, phoneNumber));
                    break;
                case 2:
                    System.out.print("Enter first name: ");
                    String fName = scanner.nextLine();
                    System.out.print("Enter surname: ");
                    String sName = scanner.nextLine();
                    Person person = new Person(fName, sName);
                    PhoneNumber foundPhoneNumber = phoneBook.findPhoneNumber(person);
                    if (foundPhoneNumber != null) {
                        System.out.println("Phone number: " + foundPhoneNumber);
                    } else {
                        System.out.println("Person not found in the phonebook.");
                    }
                    break;
                case 3:
                    System.out.print("Enter area code: ");
                    int aCode = scanner.nextInt();
                    System.out.print("Enter phone number: ");
                    long pNumber = scanner.nextLong();
                    PhoneNumber phNumber = new PhoneNumber(aCode, pNumber);
                    Person foundPerson = phoneBook.findPerson(phNumber);
                    if (foundPerson != null) {
                        System.out.println("Name: " + foundPerson);
                    } else {
                        System.out.println("Phone number not found in the phonebook.");
                    }
                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while (opt!=9);
    }
}
