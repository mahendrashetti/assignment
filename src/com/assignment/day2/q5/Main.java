package com.assignment.day2.q5;

import java.util.Scanner;

public class Main {
    /*Write a program that accepts several integers from the user, one integer at one time, till a 0 is input. Add
all the integers accepted, display the sum total after each accepted input. Implement using while loop.*/

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int num=1;
        int sum=0;
        System.out.println("I will add up the numbers you give me");

        while (num!=0){
            System.out.print("Number:");
            num=s.nextInt();
            if(num!=0) {
                sum += num;
                System.out.println("total so far is:" + sum);
            }
            else
                System.out.println("the grand total is:"+sum);
        }
    }
}
