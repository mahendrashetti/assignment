package com.assignment.day2.q3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*Write a program that takes as input the elements of 2 square matrices and determines the sum of the
matrices.*/

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr1=new int[n][n];
        int[][] arr2=new int[n][n];
        int[][] ans=new int[n][n];

        System.out.println("enter arr1 element");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=s.nextInt();
            }
        }

        System.out.println("enter arr2 element");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=s.nextInt();
            }
        }

        System.out.println("sum of matrix =");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
