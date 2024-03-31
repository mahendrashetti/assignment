package com.assignment.day2.q6;

import java.util.Scanner;

public class Main {
    /*Write a program which displays a different message depending on the age given. Here are the possible
responses:
● age is less than 16, say "You can't drive."
● age is less than 18, say "You can't vote."
● age is less than 25, say "You can't rent a car."
● age is 25 or over, say "You can do anything that's legal."
Remember that a person who is under 16 will display three messages, one for being under 16, one for also
being under 18, and one for also being under 25. Implement using if-else construct

Sample Input Sample Output
Hey, what's your name?
Harry
Ok, Harry, how old are you?
17
You can't vote, Harry.
You can't rent a car, Harry
*/

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Hey,what's your name?");
        String name=s.next();
        System.out.println("ok, "+name+",how old are you?");
        int age=s.nextInt();
        if(age<16)
            System.out.println("You can't drive, "+name);
        if(age<18)
            System.out.println("You can't vote, "+name);
        if(age<18)
            System.out.println("You can't rent a car, "+name);
        else
            System.out.println("You can do anything that's legal."+name);
    }
}
