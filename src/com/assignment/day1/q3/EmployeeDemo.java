package com.assignment.day1.q3;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e=new Employee("Harry smith",10000);
        e.printEmpDetails();

        Employee e1=new Employee();
        e1.setName("employee1");
        e1.setSalary(25000);
        e1.printEmpDetails();

        Employee e2=new Employee("employee2",15000);
        e2.printEmpDetails();
    }
}
