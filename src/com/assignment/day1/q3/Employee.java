package com.assignment.day1.q3;

public class Employee {

    /*
    * Implement a class Employee. An employee has a name and salary.
        ● Write a default constructor.
        ● Write a constructor with parameters(name and salary).
        ● Write a member method printEmpDetails() which prints name and salary.
        Implement another class EmployeeDemo which contains the main() and does the following:
        ● Creates Employee object e with the following details
        ○ Name : Harry Smith
        ○ Salary : 10000
        ● Prints employee “e1” details and employee “e2” details using printEmpDetails() constructed using
        the no parameter constructor and the parameterized constructor respectively.
     */

    private String name;
    private double salary;

    Employee(){
    }

    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public void printEmpDetails(){
        System.out.println("Name= "+name+" salary= "+salary);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }
}
