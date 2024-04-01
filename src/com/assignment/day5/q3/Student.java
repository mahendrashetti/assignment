package com.assignment.day5.q3;

public class Student implements Comparable<Student>{

    /*Create a Student class with name, id and age. Write a program that gets some students from user and
        then sorts by:
        Ascending : order of Name (Use Comparable)
        Descending : order of Name
        Both age and name. (Use Comparator)
    */
    private String name;
    private int id;
    private int age;


    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

}
