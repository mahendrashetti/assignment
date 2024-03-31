package com.assignment.day5.q5;

public class Person {
    //Person Class contains firstName and surName.

    private String firstName;
    private String surName;

    Person(String firstName,String surName){
        this.firstName=firstName;
        this.surName=surName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setSurName(String surName){
        this.surName=surName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSurName(){
        return surName;
    }

    public String toString(){
        return "firstName="+firstName+"surName="+surName;
    }
}
