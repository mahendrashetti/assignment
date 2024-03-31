package com.assignment.day4.q7;

import java.util.Scanner;

public class Main {
    /*Write a JAVA Program which accepts text of words separated by commas and gives the output
        of words printed on separated lines with commas removed.
        Sample Output:
        Enter the string to parse
        Monday,Tuesday,Wednesday,Thursday,Friday,Sunday
        Monday
        Tuesday
        Wednesday
        Thursday
        Friday
        Sunday
     */

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string to parse separated by commas");
        String[] str=s.nextLine().split(",");

        for (String words:str){
            System.out.println(words);
        }
    }
}
