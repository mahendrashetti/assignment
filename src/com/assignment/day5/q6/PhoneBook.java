package com.assignment.day5.q6;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    //PhoneBook contains a HashMap<Person,BookEntry>

    private static Map<Person, BookEntry> phoneBookMap;

    public PhoneBook() {
        phoneBookMap = new HashMap<>();
    }

    public static Map<Person, BookEntry> getPhoneBookMap() {
        return phoneBookMap;
    }

    public void addEntry(Person person, PhoneNumber phoneNumber) {
        phoneBookMap.put(person, new BookEntry(person, phoneNumber));
    }

    public PhoneNumber findPhoneNumber(Person person) {
        BookEntry entry = phoneBookMap.get(person);
        if (entry != null) {
            return entry.getPhoneNumber();
        }
        return null;
    }

    public Person findPerson(PhoneNumber phoneNumber) {
        for (BookEntry entry : phoneBookMap.values()) {
            if (entry.getPhoneNumber().equals(phoneNumber)) {
                return entry.getPerson();
            }
        }
        return null;
    }

}
