package com.assignment.day2.q4;

import java.util.Scanner;

public class Main {

    /*
    Write a program that displays a text menu as shown below. The user is prompted to enter his choice of
operation from the text menu followed by two integers. Based on the entered choice, an operation will be
performed on the two integers. [infinite loop which terminates when “9” is input, use switch-case]
Sample Input Sample Output
USER MENU
==========
1. Sum
2. Difference
3. Product
4. Average
5. Maximum (larger of two numbers)
6. Minimum (Smaller of two numbers)
9. Exit
Enter the menu item number to select an operation
3
OK, you have entered 3
Enter the two numbers
10 20
You have selected 3. Product
Numbers entered are 10 and 20
Result is 200

     */


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int opt=0;

        do{
            System.out.println("USER MENU\n" +
                    "==========\n" +
                    "1. Sum\n" +
                    "2. Difference\n" +
                    "3. Product\n" +
                    "4. Average\n" +
                    "5. Maximum (larger of two numbers)\n" +
                    "6. Minimum (Smaller of two numbers)\n" +
                    "9. Exit\n" +
                    "Enter the menu item number to select an operation");
            opt=s.nextInt();
            System.out.println("ok, you have selected "+opt);
            switch (opt){
                case 1:{
                    System.out.println("enter the two numbers");
                    int n1=s.nextInt();
                    int n2=s.nextInt();
                    System.out.println("you have selected "+opt+" sum\nnumber entered are "+n1+" "+n2+"\nResult is "+sum(n1,n2));
                }
                break;

                case 2:{
                    System.out.println("enter the two numbers");
                    int n1=s.nextInt();
                    int n2=s.nextInt();
                    System.out.println("you have selected "+opt+" difference\nnumber entered are "+n1+" "+n2+"\nResult is "+difference(n1,n2));
                }
                break;

                case 3:{
                    System.out.println("enter the two numbers");
                    int n1=s.nextInt();
                    int n2=s.nextInt();
                    System.out.println("you have selected "+opt+" product\nnumber entered are "+n1+" "+n2+"\nResult is "+product(n1,n2));
                }
                break;

                case 4:{
                    System.out.println("enter the two numbers");
                    int n1=s.nextInt();
                    int n2=s.nextInt();
                    System.out.println("you have selected "+opt+" average\nnumber entered are "+n1+" "+n2+"\nResult is "+average(n1,n2));
                }
                break;

                case 5:{
                    System.out.println("enter the two numbers");
                    int n1=s.nextInt();
                    int n2=s.nextInt();
                    System.out.println("you have selected "+opt+" maximum\nnumber entered are "+n1+" "+n2+"\nResult is "+maximum(n1,n2));
                }
                break;

                case 6:{
                    System.out.println("enter the two numbers");
                    int n1=s.nextInt();
                    int n2=s.nextInt();
                    System.out.println("you have selected "+opt+" minimum\nnumber entered are "+n1+" "+n2+"\nResult is "+minimum(n1,n2));
                }
                break;

                case 9:return;

                default:
                    System.out.println("enter valid choice");
            }

        }while (opt!=9);

    }

    static int sum(int n1,int n2){
        return n1+n2;
    }

    static int difference(int n1,int n2){
        return n1-n2;
    }

    static int product(int n1,int n2){
        return n1*n2;
    }

    static int average(int n1,int n2){
        return n1+n2/2;
    }

    static int maximum(int n1,int n2){
        return Math.max(n1,n2);
    }

    static int minimum(int n1,int n2){
        return Math.min(n1,n2);
    }
}
