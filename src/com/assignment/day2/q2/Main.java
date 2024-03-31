package com.assignment.day2.q2;

import java.util.Scanner;

public class Main {
    /*
        Write a program which takes input as number of 50 paise coins, number of 25 paise coins, number of 10
        paise coins and outputs the total amount of money
    */

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of 50paise coin");
        int coin50=s.nextInt();
        System.out.println("enter no of 25paise coin");
        int coin25=s.nextInt();
        System.out.println("enter no of 10paise coin");
        int coin10=s.nextInt();

        int ans=0;
        int rem50=coin50%2;
        ans+=coin50/2;
        int rem25=coin25%4;
        ans+=coin25/4;
        int rem10=coin10%10;
        ans+=coin10/10;

        int rem=rem10*10+rem25*25+rem50*50;
        int remAns=0;
        if(rem>100){
            remAns=rem%100;
            ans+=rem/100;
        }
        else
            remAns=rem;

        System.out.println("total amount="+ans+"rupees "+remAns+"paisa");

    }
}
