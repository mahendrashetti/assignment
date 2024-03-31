package com.assignment.day1.q5;

public class Main {
    /*
    * Write a program which prints the following pattern as output:
     * * * * * * *
     * * * * * * *
     * *       * *
     * *       * *
     * *       * *
     * * * * * * *
     * * * * * * *
     */

    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i<2 || i>=7-2 || j<2 || j>=7-2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
