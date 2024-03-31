package com.assignment.day2.q7;

import java.util.Scanner;

public class Main {

    /*Write a program that prompts user for radius and prints area and circumference of the circle along with
        radius. [Area: PI*R*R; Circumference: 2*PI*R]. Define a java constant for PI=3.14.
        Sample Input Sample Output
        Enter radius of circle (in cm): 10 Radius(in cm): 10
        Area: 314 cm2
        Circumference: 62.8 cm
    */

    public static void main(String[] args) {
        final float PI=3.14f;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius of circle (in cm):");
        float radius=s.nextFloat();
        float circumference=2*PI*radius;
        double area=PI*radius*radius;

        System.out.printf("Radius(in cm):"+radius+"\nArea:%.2f cm2\nCircumference:%.2f"+"cm",area,circumference);
    }
}
