package com.assignment.day4.q2;

import java.util.Scanner;

public class Main {
    /*Write a program that prompts the user to enter a String and prints whether it is a palindrome or not. Use
StringBuilder class.
     */

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the string");
        StringBuilder str=new StringBuilder(s.next());

        StringBuilder rev=new StringBuilder(str).reverse();
        System.out.println(str+" "+rev);
        if(str.toString().equals(rev.toString()))
            System.out.println("given string is palindrome");
        else
            System.out.println("string is not palindrome");
    }
}
