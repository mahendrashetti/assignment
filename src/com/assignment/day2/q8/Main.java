package com.assignment.day2.q8;

public class Main {
    /*Write a program that implements overloaded methods for each statement given below:
● Find area of either rectangle or square. [func(int, int) and func(int)]
● Find sum of two numbers(int or double). [calc(int, int) and calc(double, double)]*/

    public static void main(String[] args) {

        func(5);

        func(5,3);

        calc(2,8);

        calc(3.54,5.21);

    }

    static void func(int l){
        System.out.println("area of square="+l*l);
    }

    static void func(int l,int b){
        System.out.println("area of rectangle="+l*b);
    }

    static void calc(int num1,int num2){
        System.out.println("sum of 2 integer="+num1+num2);
    }

    static void calc(double num1,double num2){
        System.out.println("sum of 2 double="+num1+num2);
    }
}
