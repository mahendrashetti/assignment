package com.assignment.day1.q7;

public class Main {
    /*
    List all the numbers less than 10000 which are equal to the sum of the factorial of all its digits.
        For Example: 1!+4!+5! = 1+24+120 = 145
    */

    public static void main(String[] args) {
        for(int i=1;i<10000;i++){
            if(factSum(i))
                System.out.println(i);
        }
    }

    public static int factorial(int num){
        int prod=1;
        while (num>0){
            prod*=num--;
        }
        return prod;
    }

    public static boolean factSum(int num){
        int copy=num;
        int sum=0;
        while (copy>0){
            int rem=copy%10;
            sum+=factorial(rem);
            copy/=10;
        }

        return sum==num;
    }
}
