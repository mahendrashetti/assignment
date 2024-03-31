package com.assignment.day4.q3;
//static import
import static java.lang.Math.*;
public class Main {
    /*Write a program that defines following variables.
double a = -191.635;
 double b = 43.74;
int c = 16, d = 45;
Use java.lang.Math class to find the following:
● Absolute value of a
● Ceiling of b
● Floor of b
● Maximum and Minimum of c and d
● A random integer number between 0 and 100(>=0 and <100)
Also, use static import of Math class in your code.
*/
    public static void main(String[] args) {
        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;

        System.out.println("Absolute value of a= "+abs(a));
        System.out.println("Ceiling of b= "+ceil(b));
        System.out.println("Floor of b= "+floor(b));
        System.out.println("Maximum of c and d= "+(max(c,d)==c?"max is c= "+c:"max is d= "+d)+"\nMinimum of c and d= "+(min(c,d)==c?"min is c= "+c:"min is d="+d));
        System.out.println("A random integer number between 0 and 100(>=0 and <100) = "+round(random()*100));
    }
}
