package com.assignment.day1.q8;

public class Main {
    /*Write a program to list all the prime numbers less than 1000.*/
    public static void main(String[] args) {
        for (int i=0;i<1000;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }

    static boolean isPrime(int num){
        int c=2;
        while (c*c<=num){
            if(num%c==0)
                return false;
            c++;
        }
        return true;
    }
}
