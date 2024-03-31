package com.assignment.day2.q11;
/*Implement a class EmployeeDemo which contains
● an inner class Employee. An employee has a name and salary. Write a default constructor and
parametrised constructor with parameters(name and salary). Also, write a member method
printEmpDetails() which prints name and salary.
● main() which creates an Employee object e with the following details
○ Name : Harry Smith
○ Salary : 10000
● using parameterized constructor and prints employee details using printEmpDetails().
 */
public class EmployeeDemo {

    class Employee{

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

    public static void main(String[] args) {
        EmployeeDemo.Employee e=new EmployeeDemo().new Employee("Harry Smith",10000);
        e.printEmpDetails();
    }
}
