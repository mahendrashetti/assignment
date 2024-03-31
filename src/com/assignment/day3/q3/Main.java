package com.assignment.day3.q3;

public class Main {

    public static void main(String[] args) {
        Item item=new Item(7985,"Alice in Wonderland");
        System.out.println(item.toString());

        item=new Printed(7985,"Alice in Wonderland",105);
        System.out.println(item.toString());

        item=new Multimedia(3565,"In a Sentimental Mood",597);
        System.out.println(item.toString());
    }
}
