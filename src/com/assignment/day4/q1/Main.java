package com.assignment.day4.q1;

import java.util.Scanner;

public class Main {
    /*Define a String “This is lab session on String Handling”. Do the following
Write a main method to
● Prints the length of the String
● Prints “String Handling”
● Prints “LAB SESSION”
● Prints “This is J2SE lab session on String Handling”
● Replaces 'J2SE' with 'J2SE PG-DAC' in above string.
*/

    public static void main(String[] args) {
        String str="This is lab session on String Handling";

        System.out.println("length= "+str.length());
        System.out.println(str.substring(str.indexOf("Str")));
        System.out.println(str.substring(str.indexOf("lab"),str.indexOf("lab")+11).toUpperCase());
        StringBuilder sb1=new StringBuilder(str).insert(8,"J2SE ");
        System.out.println(sb1);
        String str2=sb1.toString().replaceFirst("J2SE","J2SE PG-DAC");
        System.out.println(str2);

        System.out.println("random password generated= "+randomGenerator());

        Scanner scan=new Scanner(System.in);
        System.out.println("enter file path");
        filePath(scan.nextLine());




    }

    static String randomGenerator(){
        /*● Generates and prints a random password by taking any one random letter from a-z,one
        random letter from A-Z and a random digit from 0-9.*/

        String pass=(char)(Math.round(Math.random()*26)+97)+""+(char)(Math.round(Math.random()*26)+65)+""+String.valueOf(Math.round(Math.random()*10));
        return pass;
    }

    static void filePath(String filePath){

       /* Define a String filePath and prints the extension,file-name and file-path.
                Example: filePath=”/home/user/index.html” should print
        extension = html
        file-name = index
        file-path = /home/user
        Use inbuilt methods in java.lang.String.
        */

        String sub=new StringBuilder(filePath).replace(filePath.lastIndexOf('/'),filePath.lastIndexOf('/')+1,"!").toString();

        String[] fileArr=sub.split("!");

        String fileName=fileArr[1];
        String path=fileArr[0];

        System.out.println("extension= "+fileName.substring(fileName.indexOf('.')+1));
        System.out.println("file-name= "+fileName.substring(0,fileName.indexOf('.')));
        System.out.println("file-path = "+path);
    }
}
