package com.assignment.day1.q2;

public class Main {
/*
    Write a program that prints all numbers starting from a specified number to another number specified for
    each looping construct.
        ● Count from 0 to 21 using a for loop incrementing by 1 for each iteration
        ● Print from 9.3 to 10.4 with 0.1 increment using for-each loop
            [declare - double d[]={9.3,9.4,9.5,9.6,9.7,9.8,9.9,10.0,10.1,10.2,10.3,10.4}]
        ● Count from 99 to 35 using while loop decrementing by 2 for each iteration
        ● Count from 1 to 400 using do-while loop incrementing by product of 2 for each iteration
 */

    public static void main(String[] args) {
        System.out.println("for loop");
        for(int i=0;i<=21;i++){
            System.out.print(i+" ");
        }

        System.out.println("\nfor-each loop");
        double d[]={9.3,9.4,9.5,9.6,9.7,9.8,9.9,10.0,10.1,10.2,10.3,10.4};
        for(double i:d){
            System.out.print(i+" ");
        }

        System.out.println("\nwhile loop");
        int n=99;
        while(n>=35){
            System.out.print(n+" ");
            n-=2;
        }

        System.out.println("\ndo-while loop");
        int m=1;
        do{
            System.out.print(m+" ");
            m+=2;
        }while (m<=400);
    }
}
