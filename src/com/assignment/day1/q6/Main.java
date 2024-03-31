package com.assignment.day1.q6;

public class Main {
   /* Write a program that displays the list of all positive integer palindromes which are less than 1000*/

    public static void main(String[] args) {

        for(int i=1;i<1000;i++){
            if(checkPalindrome(i))
                System.out.println(i+" ");
        }

    }

    public static boolean checkPalindrome(int num){
        int copy=num;
        int ans=0;
        while (copy>0) {
            int rem = copy % 10;
            ans = (ans * 10) + rem;
            copy /= 10;
        }
        return num==ans;
    }
}
