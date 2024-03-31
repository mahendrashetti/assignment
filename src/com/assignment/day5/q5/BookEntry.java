package com.assignment.day5.q5;

public class BookEntry {
    //BookEntry contains Person object and PhoneNumber object

    private Person person;
    private PhoneNumber phoneNumber;

    public BookEntry(Person person, PhoneNumber phoneNumber) {
        this.person = person;
        this.phoneNumber = phoneNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BookEntry{" +
                "person=" + person +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
