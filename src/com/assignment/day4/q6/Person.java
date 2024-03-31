package com.assignment.day4.q6;

import java.util.Scanner;
import java.util.Vector;

public class Person {
    /*Create a Person Class which contains two member variables firstName and lastName.Write a program
that prompts the user to enter details of several persons. Model the collection of persons using Vector.
● Print the vector containing person details.
● Remove a person from vector and print.
(Prompt the user to enter first name of the person to be deleted).
● Insert a new person at some position entered by user.
● Print details of first person.Replace it with “Harry Smith”
● Convert the vector of Person objects to an array of Person objects
     */

    private String firstName;
    private String lastName;

    Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        return "fname="+this.firstName+" lname="+this.lastName;
    }

    public static void main(String[] args) {
        Vector<Person> personVector = new Vector<>();
        personVector.add(new Person("abc","def"));
        personVector.add(new Person("ghi","jkl"));
        personVector.add(new Person("mno","pqr"));
        personVector.add(new Person("stu","vwx"));
        Scanner s = new Scanner(System.in);
       int opt = 0;
        do {
            System.out.println("1 add person\n2 print the vector \n3 remove a person\n4 insert person at position " +
                            "\n5 update person\n6 convert the vector to array and exit");
            opt = s.nextInt();
            switch (opt) {
                case 1:{
                    System.out.println("enter first name and last name");
                    String fName = s.next();
                    String lName = s.next();
                    personVector.add(new Person(fName, lName));
                    break;
                }

                case 2:{
                    for (Person p : personVector) {
                        System.out.println(p);
                    }
                    break;
                }

                case 3:{
                    System.out.println("enter first name of person to delete");
                    String fName=s.next();
                    for (int i=0;i<personVector.size();i++) {
                        if(personVector.get(i).getFirstName().equals(fName))
                            personVector.remove(i);
                        else
                            System.out.println("person not found");
                    }

                    for (Person p : personVector) {
                        System.out.println(p);
                    }
                    break;
                }

                case 4:{
                    System.out.println("enter the index no");
                    int index=s.nextInt();
                    if(index>=personVector.size() || index<0){
                        System.out.println("please enter index between 0 and "+(personVector.size()-1));
                    }
                    else {
                        System.out.println("enter first name and last name");
                        String fName = s.next();
                        String lName = s.next();
                        personVector.add(index,new Person(fName, lName));
                    }
                    break;
                }

                case 5:{
                    System.out.println("enter first name of person to update");
                    String updateName=s.next();
                    for (Person p:personVector) {
                        if(p.getFirstName().equals(updateName)) {
                            System.out.println("enter first name and last name");
                            String fName = s.next();
                            String lName = s.next();
                            p.setFirstName(fName);
                            p.setLastName(lName);
                        }
                        else {
                            System.out.println("no person found");
                        }
                    }
                    break;
                }

                case 6:{
                    Person [] pArray=new Person[personVector.size()];
                    personVector.toArray(pArray);
                    for (Person p:pArray) {
                        System.out.println(p+" ");
                    }

                    break;
                }

                default:
                    System.out.println("enter valid option");
            }
        }while (opt!=6);
    }
}
