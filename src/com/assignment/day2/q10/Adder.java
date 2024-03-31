package com.assignment.day2.q10;

public class Adder {

    /*Write a program that reads an unspecified number of integer arguments from the command line and adds
them together to print the result.
For example, suppose that you enter the following to run your java program Adder.java:
java Adder 1 3 2 10
The program should display 16, which is the addition of 1, 3, 2 and 10. The program should display an
error message if the user enters only one argument.*/

    public static void main(String[] args) {
        int sum=0;
        if(args.length<=1)
            System.err.println("enter more than one argument to compute");
        else{
            for(String num:args){
                sum+=Integer.parseInt(num);
            }
            System.out.println(sum);
        }
    }
}
