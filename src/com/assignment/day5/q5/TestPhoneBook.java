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

        Scanner s=new Scanner(System.in);

        HashMap<Person,BookEntry> pBook=new HashMap<>();
        PhoneBook.setPhoneBook(pBook);

        int opt=0;
        do{
            System.out.println("Enter-1: to add a new phonebook entry\nEnter-2: to find the number for a " +
                            "name\nEnter-3: to find name for a number\nEnter-9: to quit");
            opt=s.nextInt();
            switch (opt){
                case 1:{
                    System.out.println("Enter first name of person");
                    String fName=s.next();
                    System.out.println("Enter sur name of person");
                    String sName=s.next();
                    System.out.println("Enter area code");
                    int aCode=s.nextInt();
                    System.out.println("Enter phone no");
                    long pno=s.nextLong();

                    Person person=new Person(fName,sName);
                    PhoneNumber phoneNumber=new PhoneNumber(aCode,pno);
                    BookEntry bookEntry=new BookEntry(person,phoneNumber);

                    PhoneBook.getPhoneBook().put(person,bookEntry);
                    System.out.println(PhoneBook.getPhoneBook().values());
                    break;
                }

                case 2:
            }
        }while (opt!=9);
    }
}
