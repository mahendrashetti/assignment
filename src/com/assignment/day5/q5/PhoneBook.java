package com.assignment.day5.q5;

import java.util.HashMap;

public class PhoneBook {
    //PhoneBook contains a HashMap<Person,BookEntry>

    private static HashMap<Person,BookEntry> phoneBook;

    public PhoneBook() {
        
    }

    public static HashMap<Person, BookEntry> getPhoneBook() {
        return phoneBook;
    }

    public static void setPhoneBook(HashMap<Person, BookEntry> phoneBook) {
        PhoneBook.phoneBook = phoneBook;
    }


}
