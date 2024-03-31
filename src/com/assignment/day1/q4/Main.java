package com.assignment.day1.q4;

public class Main {
    /*
    * Write a program to determine the sum of all positive numbers less than 100 which are divisible by 3 or 5.
    */
    public static void main(String[] args) {
        int sum=0;
        int n=1;
        while(n<100){
            if(n%3==0 || n%5==0){
                sum+=n;
            }
            n++;
        }

        System.out.println("sum of positive numbers less than 100 which are divisible by 3 or 5="+sum);
    }
}
