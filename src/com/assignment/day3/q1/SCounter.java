package com.assignment.day3.q1;

public class SCounter {
    static int count;

    SCounter(){
        this.count++;
        System.out.println(count);
    }

    static {
        System.out.println("Static block invoked in SCounter in SCounter Class.");
    }
}
