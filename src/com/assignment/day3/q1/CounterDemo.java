package com.assignment.day3.q1;

public class CounterDemo {
static {
    System.out.println("Static block invoked in CounterDemo in CounterDemo Class.");
}
    public static void main(String[] args) {
        SCounter sc1=new SCounter();
        SCounter sc2=new SCounter();
        SCounter sc3=new SCounter();

        NSCounter nsc1=new NSCounter();
        NSCounter nsc2=new NSCounter();
        NSCounter nsc3=new NSCounter();
    }
}
