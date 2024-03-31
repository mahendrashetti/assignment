package com.assignment.day2.q1;

import java.util.Scanner;

public class Main {
    /*Write a program that accepts two numbers as input and finds the Least Common Multiple[LCM] of those
numbers.
*/

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();

        int lcm=(num1*num2)/gcd(num1,num2);

        System.out.println(lcm);
    }

    static int gcd(int num1,int num2){
        if(num2==0)
            return num1;
        else
            return gcd(num2,num1%num2);
    }
}
