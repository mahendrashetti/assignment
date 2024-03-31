package com.assignment.day1.q9;

public class Main {
    /*Write a program to compute the sum of squares of all even numbers equal to or less than 20 */

    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=20;i+=2){
            sum+=Math.pow(i,2);
        }

        System.out.println(sum);
    }
}
