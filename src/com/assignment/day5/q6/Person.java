package com.assignment.day5.q6;

import java.util.Objects;

public class Person {
    //Person Class contains firstName and surName.

    private String firstName;
    private String surName;

    Person(String firstName,String surName){
        this.firstName=firstName;
        this.surName=surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSurName(){
        return surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
